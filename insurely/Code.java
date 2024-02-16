package insurely;

abstract class Code {

    abstract String validateRule();
}

class PersonalNumber extends Code {

    String personalNumber;

    public PersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String validateRule() {
        try {
            return insurely.CodeImpl.validatePersonalNumberSweden(personalNumber);
        } catch (insurelyException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        return personalNumber;
    }
}

class SwedishName extends Code {

    String swedishName;

    String validateRule() {
        try {
            return insurely.CodeImpl.validateNameSweden(swedishName);
        } catch (insurelyException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        return swedishName;
    }
    
}
