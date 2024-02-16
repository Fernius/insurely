package insurely;

public class PersonalNumbersTest {

        public static void main(String[] args) {
            // Test cases
            insurely.SwedishPerson[] swedishPeople = {
                new insurely.SwedishPerson("Anna-Lena", "830111-4156"),
                new insurely.SwedishPerson("Karl-Oskar", "830111-4156"),
                new insurely.SwedishPerson("Åsa", "19830111-4156"),
                new insurely.SwedishPerson("Björn", "19901231-1234"),
                new insurely.SwedishPerson("Lars-Göran", "901231+1234"),
                new insurely.SwedishPerson("Örjan", "901231-1"),
                new insurely.SwedishPerson("Muñoz", ""),
                new insurely.SwedishPerson("", "830111-4156"),
                new insurely.SwedishPerson("Johanna Berit", "901231-1234")};

            for (insurely.SwedishPerson swedishPerson : swedishPeople) {
                try {
                    System.out.println(swedishPerson.getName() + ": " + 
                    insurely.CodeImpl.validatePersonalNumberSweden(swedishPerson.getPersonalNumber())
                    + " and " + 
                    insurely.CodeImpl.validateNameSweden(swedishPerson.getName())
                    );
                } catch (insurelyException e) {
                    // TODO Auto-generated catch block
                    System.out.println(swedishPerson.getName() + ": ");
                    System.out.println("Validation error: " + e.getMessage());
                }
            }
        }
    }
