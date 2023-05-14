import java.util.HashMap;

/**
 * I need a phonbook class. The class should include hashmap of Persons and the id should be a key and Person the value.

GitHub Copilot
Here's an example Java class named Phonebook that includes a HashMap of Person objects, where the id is the key and the Person object is the value: 
*/

public class Phonebook {
    private HashMap<Integer, Person> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void addPerson(Person person) {
        phonebook.put(person.getId(), person);
    }

    public void removePerson(int id) {
        phonebook.remove(id);
    }

    public Person getPerson(int id) {
        return phonebook.get(id);
    }

    public HashMap<Integer, Person> getPhonebook() {
        return phonebook;
    }
}