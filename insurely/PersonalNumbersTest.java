package insurely;

public class PersonalNumbersTest {

        public static void main(String[] args) {
            // Test cases
            insurely.Person[] swedishPeople = {
                new insurely.Person("Anna-Lena", "901231-1234"),
                new insurely.Person("Karl-Oskar", "901231-1234"),
                new insurely.Person("Åsa", "901231-1234"),
                new insurely.Person("Björn", "901231-1234"),
                new insurely.Person("Lars-Göran", "901231-1234"),
                new insurely.Person("Örjan", "901231-1234"),
                new insurely.Person("Muñoz", "901231-1234"),
                new insurely.Person("", "901231-1234"),
                new insurely.Person("Johanna Berit", "901231-1234")
            };

            for (insurely.Person swedishPerson : swedishPeople) {
                System.out.println(swedishPerson.getName() + ": " + 
                insurely.PersonalNumbers.validatePersonalNumberAndName(swedishPerson, "SE"));
            }
        }
    }
