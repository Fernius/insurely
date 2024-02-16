package insurely;

enum ErrorType {
    ERROR_REGULAR_EXPRESSION(5001, "This code is not correct"),
    ERROR_MSG_FORMAT(5002, "Format for personal number is not correct"),
    ERROR_MSG_DATE(5003, "The date for this personal number is not correct"),
    ERROR_MSG_LUHN(5004, "Serial number's personal number is not correct"),
    ERROR_STANDARD(5005, "Personal number is not valid or empty"),
    ERROR_PERSON_NAME(5007, "This persons name is not in a valid format");

    private final int errorCode;
    private final String errorMessage;

    ErrorType(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
