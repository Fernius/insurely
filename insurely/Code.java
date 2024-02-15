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
        return insurely.CodeImpl.validatePersonalNumberSweden(personalNumber);
    }
}

class SwedishName extends Code {

    String swedishName;

    String validateRule() {
        return insurely.CodeImpl.validateNameSweden(swedishName);
    }
    
}
