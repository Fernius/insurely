package insurely;

public class PersonalNumbersTest {

        public static void main(String[] args) {
            // Test cases
            insurely.Person[] swedishPeople = {
                new insurely.Person("Anna-Lena", "901231-1234"),
                new insurely.Person("Karl-Oskar", "830111-4156"),
                new insurely.Person("Åsa", "19830111-4156"),
                new insurely.Person("Björn", "19901231-1234"),
                new insurely.Person("Lars-Göran", "901231+1234"),
                new insurely.Person("Örjan", "901231-1"),
                new insurely.Person("Muñoz", ""),
                new insurely.Person("", "830111-4156"),
                new insurely.Person("Johanna Berit", "901231-1234")
            };

            for (insurely.Person swedishPerson : swedishPeople) {
                System.out.println(swedishPerson.getName() + ": " + 
                insurely.PersonalNumbers.validatePersonalNumberAndName(swedishPerson, "SE"));
            }
        }
    }
