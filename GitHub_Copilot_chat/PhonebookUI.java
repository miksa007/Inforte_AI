import java.util.Scanner;
/**
 * I need a console based ui class where the user can add, find , remove and print Phonebooks data. The interaction with user should be done with switch -case combination

GitHub Copilot
Here's an example Java class named PhonebookUI that provides a console-based UI for interacting with a Phonebook object. The UI allows the user to add, find, remove, and print Person objects in the Phonebook using a switch statement:
 */


public class PhonebookUI {
    private Phonebook phonebook;
    


    private Scanner scanner;

    public PhonebookUI() {
        phonebook = new Phonebook();
        /*
     * give a test data with java code for creating test persons

        GitHub Copilot
        Here's an example Java code that creates five test Person objects using the Person class:
     */
        Person person1 = new Person(1, "John Doe", "555-1234");
        Person person2 = new Person(2, "Jane Smith", "555-5678");
        Person person3 = new Person(3, "Bob Johnson", "555-9012");
        Person person4 = new Person(4, "Alice Brown", "555-3456");
        Person person5 = new Person(5, "Tom Wilson", "555-7890");
        phonebook.addPerson(person1);
        phonebook.addPerson(person2);
        phonebook.addPerson(person3);
        phonebook.addPerson(person4);
        phonebook.addPerson(person5);
        
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Add person");
            System.out.println("2. Find person");
            System.out.println("3. Remove person");
            System.out.println("4. Print phonebook");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    findPerson();
                    break;
                case 3:
                    removePerson();
                    break;
                case 4:
                    printPhonebook();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void addPerson() {
        System.out.println("Enter person ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        System.out.println("Enter person name:");
        String name = scanner.nextLine();

        System.out.println("Enter person phone number:");
        String phoneNumber = scanner.nextLine();

        Person person = new Person(id, name, phoneNumber);
        phonebook.addPerson(person);
        System.out.println("Person added to phonebook");
    }

    private void findPerson() {
        System.out.println("Enter person ID:");
        int id = scanner.nextInt();

        Person person = phonebook.getPerson(id);
        if (person != null) {
            System.out.println("Person found:");
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Phone number: " + person.getPhoneNumber());
        } else {
            System.out.println("Person not found");
        }
    }

    private void removePerson() {
        System.out.println("Enter person ID:");
        int id = scanner.nextInt();

        phonebook.removePerson(id);
        System.out.println("Person removed from phonebook");
    }

    private void printPhonebook() {
        System.out.println("Phonebook:");
        for (Person person : phonebook.getPhonebook().values()) {
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Phone number: " + person.getPhoneNumber());
            System.out.println();
        }
    }
}