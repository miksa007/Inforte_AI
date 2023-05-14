/**
 * Testing github copilot chat -tool
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Strating the program");

        PhonebookUI phonebookUI = new PhonebookUI();
        phonebookUI.run();

    }
}        

/**
 * I need a java class named Person. It should include inner variables id, name and phonenumber

GitHub Copilot
Here's an example Java class named Person with inner variables id, name, and phoneNumber:
 */
class Person {
    private int id;
    private String name;
    private String phoneNumber;

    public Person(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
