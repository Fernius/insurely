package insurely;

public class PersonalNumbersRegExpressions {

    // RegEx for Swedish Personal Number (YYMMDD-XXXX) (YYYYMMDD+XXXX)
    public static final String[] swedishPersonalNumberRegularExpressions = {"^\\d{6}[-+]\\d{4}$", "\\d{8}[-+]\\d{4}$"};

    // RegEx for Swedish name
    public static final String swedishNameOrSurname = "^[a-zA-ZåäöÅÄÖ]+([-'][a-zA-ZåäöÅÄÖ]+)*$";
}