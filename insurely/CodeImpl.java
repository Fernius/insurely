package insurely;

import java.util.regex.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;

public class CodeImpl {

    public static String validatePersonalNumberSweden(String personalNumber) throws insurelyException {

        if (personalNumber.isEmpty()){
            throw new insurelyException(ErrorType.ERROR_MSG_FORMAT);
        }

        Boolean isMatch = false;
        for (String swedishPersonalNumberRegularExpression : insurely.PersonalNumbersRegExpressions.swedishPersonalNumberRegularExpressions){
            // Check if the input matches the pattern
            if (Pattern.matches(swedishPersonalNumberRegularExpression, personalNumber)){
                isMatch = true;
            }
        }

        if (!isMatch){
            throw new insurelyException(ErrorType.ERROR_MSG_FORMAT);
        }

        String formattedPersonalNumber = formatPersonalNumberSweden(personalNumber);

        if (!isValidDateSweden(formattedPersonalNumber)){
            throw new insurelyException(ErrorType.ERROR_MSG_DATE);
        }

        if (!isValidLuhn(formattedPersonalNumber)){
            throw new insurelyException(ErrorType.ERROR_MSG_LUHN);
        }
            
        return insurely.PersonalNumbersMessages.SUCCESS_PERSONAL_NUMBER;
    }

    /*
     * @param personalNumber
     * @return personal number has a correct serial number
     */
    private static boolean isValidLuhn(String personalNumber) {
        int checksum = Character.getNumericValue(personalNumber.charAt(personalNumber.length() - 1));
        int total = 0;

        for (int i = personalNumber.length() - 2; i >= 0; i--) {
            int sum = 0;
            int digit = Character.getNumericValue(personalNumber.charAt(i));
            if (i % 2 == personalNumber.length() % 2) { //right to left every odd digit
                digit = digit * 2;
            }

            sum = digit / 10 + digit % 10;
            total += sum;
        }

        return total % 10 != 0 ? 10 - total % 10 == checksum : checksum == 0;
    }
    
    /*
     * @param personalNumber
     * @return true if birthdate is valid
     */
    public static boolean isValidDateSweden(String personalNumber) {

        if (personalNumber.isEmpty()){
            return false;
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        dateFormat.setLenient(false); // Disable lenient parsing

        try {
            // Attempt to parse the date string
            dateFormat.parse(getBirthdateSweden(personalNumber));

            // If parsing succeeds, the date is valid
            return true;
        } catch (ParseException e) {
            // Parsing failed, the date is invalid
            return false;
        }
    }

    /*
     * @param personalNumber
     * @return birthdate in yyyyMMdd format
     */
    private static String getBirthdateSweden(String personalNumber){
        String birthdate = null;
        if (personalNumber.isEmpty() || personalNumber.length()<10 || personalNumber.length()>12){
            return birthdate;
        }
        if (personalNumber.length()<12){
            birthdate = (personalNumber.substring(0,6));
            return birthdate;
        }
        birthdate = personalNumber.substring(2,8);
        return birthdate;
    }
    
    /*
     * @param personalNumber
     * @return birthdate in yyyyMMdd format
     */
    private static String formatPersonalNumberSweden (String personalNumber) throws insurelyException{
        String formattedPersonalNumber = null;

        if (personalNumber.isEmpty()){
            throw new insurelyException(ErrorType.ERROR_MSG_FORMAT);
        }

        formattedPersonalNumber = personalNumber.replaceAll("-", "");
        formattedPersonalNumber = formattedPersonalNumber.replaceAll("\\+", "");
    
        if (formattedPersonalNumber.length()<10 || formattedPersonalNumber.length()>12){
            throw new insurelyException(ErrorType.ERROR_MSG_FORMAT);
        }

        if (formattedPersonalNumber.length()<11){
            formattedPersonalNumber = (formattedPersonalNumber.substring(0,10));
            return formattedPersonalNumber;
        }

        formattedPersonalNumber = (formattedPersonalNumber.substring(2,12));
        
        return formattedPersonalNumber;
    }

    public static String validateNameSweden (String name) throws insurelyException{
        if (!Pattern.matches(insurely.PersonalNumbersRegExpressions.swedishNameOrSurname, name)){
            throw new insurelyException(ErrorType.ERROR_PERSON_NAME);
        }
        return insurely.PersonalNumbersMessages.SUCCESS_PERSON_NAME;
    }
}
