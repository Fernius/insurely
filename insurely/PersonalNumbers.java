package insurely;

public interface PersonalNumbers {
    public static String verifyPersonalNumber(String personalNumber, String countryCode){
        if(countryCode.equalsIgnoreCase("SE")){
            return insurely.PersonalNumbersImpl.verifyPersonalNumberSweden(personalNumber);
        }
        return insurely.PersonalNumbersMessages.ERROR_STANDARD;
    }

    public static String verifyName(String name, String countryCode) {
        if(countryCode.equalsIgnoreCase("SE")){
            return insurely.PersonalNumbersImpl.verifyNameSweden(name, countryCode);
        }
        return insurely.PersonalNumbersMessages.ERROR_PERSON_NAME;
    }

    public static String validatePersonalNumberAndName (Person person, String countryCode){
        return verifyName(person.getName(), countryCode) + 
        " and " +
        verifyPersonalNumber(person.getPersonalNumber(), countryCode);
    }
}
