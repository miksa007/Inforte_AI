package PhoneBookDemo;

public class Person {
    private String name;
    private String phone;
    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String toString() {
        //give me a string representation of this object
        //"name is: " + name + " phone is: " + phone
        return String.format("name is: %s phone is: %s", name, phone);
    }
}
