package insurely;

public interface PersonalNumbersRegExpressions {

    // RegEx for Swedish Personal Number (YYMMDD-XXXX) (YYMMDD+XXXX)
    String swedishPatternTen = "^\\d{6}[-+]\\d{4}$";
    // RegEx for Swedish Personal Number (YYYYMMDD-XXXX) (YYYYMMDD+XXXX)
    String swedishPatternTwelve = "^\\d{8}[-+]\\d{4}$";
    // RegEx for Swedish characters in a name
    String swedishNameOrSurname = "^[a-zA-ZåäöÅÄÖ]+([-'][a-zA-ZåäöÅÄÖ]+)*$";
}