import java.util.Scanner;

import static java.lang.System.in;

public class MobilePhone {
    static Contacts myContacts = new Contacts();

    private static Scanner myScanner = new Scanner(in);

    public static void printMenu() {
        System.out.println("""
        Press :
        press 0 to show Menu
        press 1 to add phone contact
        press 2 to display contacts
        press 3 to modify contact
        press 4 to remove a contact
        press 5 to find contact
        press 6 to search names in phonebook
        press 7 to quit the application \n""");
    }

    public static void addContacts() {
        System.out.println("Add a contact name ");
        String contactName = myScanner.nextLine();
        System.out.println("Add contact phone number ");
        String contactNumber = myScanner.nextLine();
        myContacts.addNamesAndPhoneNumber(contactName, contactNumber);
    }

    public static void displayContacts() {
        myContacts.myContactNames();
    }

    public static void modifyContact() {
        System.out.println("Type contact name to modify ");
        String oldName = myScanner.nextLine();
        System.out.println("Type new name ");
        String newName = myScanner.nextLine();

        System.out.println("""
        press 1 to change number OR press 2 to save with old number
         """);
        int answer = myScanner.nextInt();
        myScanner.nextLine();

        if (answer == 1) {
            System.out.println("Type new number ");
            String newNumber = myScanner.nextLine();
            myContacts.modifyContact02(oldName, newNumber);
            myContacts.modifyContact2(oldName, newName);
        } else if (answer == 2) {
            myContacts.modifyContact2(oldName, newName);
        } else {
            System.out.println("Huh? ");
        }
    }

    public static void removeContact() {
        System.out.println("Type contact name to remove");
        String oldName = myScanner.nextLine();

        if (myContacts.searchContactsName(oldName) != null ) {
            System.out.println("This action will delete contact name and number");
            System.out.println("press 1 to continue 2 to abort");
            int answer = myScanner.nextInt();
            if (answer == 1) {
                myContacts.removeContact(oldName);
                System.out.println(oldName + " removed from contacts");
            } else {
                System.out.println("Action aborted");
            }
        } else {
            System.out.println("this contact does not exist");
        }
    }

    public static void searchContacts() {
        System.out.println("please type contact name you want to find");
        String itemToFind = myScanner.nextLine();
        myScanner.nextLine();

        String check = myContacts.findItems(itemToFind);
        if (check != null) {
            System.out.println(itemToFind + " found in contact list");
            myContacts.oneContact2(itemToFind);
        } else {
            System.out.println(itemToFind + " not in grocery list");
        }
    }
}
