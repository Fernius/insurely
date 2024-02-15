package insurely;

public class SwedishPerson {
    private String name;
    private PersonalNumber personalNumber;

    public SwedishPerson(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = new insurely.PersonalNumber(personalNumber);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber.personalNumber;
    }

    public void setPersonalNumber(PersonalNumber personalNumber) {
        this.personalNumber = personalNumber;
    }
}

