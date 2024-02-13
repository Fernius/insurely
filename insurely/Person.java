package insurely;

public class Person {
    private String name;
    private String personalNumber;

    public Person(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Method to get full name
    public String getPerson() {
        return name + " " + personalNumber;
    }
}

