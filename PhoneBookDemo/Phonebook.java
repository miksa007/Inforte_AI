package PhoneBookDemo;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> people;
    public Phonebook() {
        people = new ArrayList<Person>();
    }
    /**
     * Add a person to the phonebook 
     * @param name
     * @return Person object if found, null otherwise
     */
    public void addPerson(Person p) throws Exception {
        if (people.contains(p)) {
            throw new Exception("Person already exists in phonebook");
        }
        people.add(p);
    }
    
    public void countThePersons(){
        int count = 0;
        for (Person p : people) {
            count++;
        }
    }
    public void printPhonebook() {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
