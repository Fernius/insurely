package insurely;

class insurelyException extends Exception {
    private ErrorType errorType = null;

    public insurelyException(ErrorType errorType) {
        super(errorType.getErrorMessage());
        this.errorType = errorType;
    }

    public int getErrorCode() {
        return errorType.getErrorCode();
    }
}