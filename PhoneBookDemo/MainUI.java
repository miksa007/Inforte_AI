package PhoneBookDemo;

import java.util.Scanner;

public class MainUI {
    public static void main(String[] args) {
      main_ui_with_case_structure(); 
    }

    public static void main_ui_with_case_structure(){
        Scanner sc = new Scanner(System.in);
        Phonebook pb1 = new Phonebook();
        while (true) {
            System.out.println("Enter a command: ");
            String command = sc.nextLine();
            if (command.equals("add")) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter phone: ");
                String phone = sc.nextLine();
                Person p = new Person(name, phone);
                try {
                    pb1.addPerson(p);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("print")) {
                pb1.printPhonebook();
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command");
            }
        }
    }

}
