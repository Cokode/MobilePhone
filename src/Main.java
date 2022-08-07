import java.util.Scanner;

public class Main {
    private static Scanner isScanner = new Scanner(System.in);
    private static MobilePhone myMobilPhone = new MobilePhone();
    private static Contacts newContacts = new Contacts();

    public static void main (String[] args) {
        MobilePhone.printMenu();
        boolean quit = false;

        while (!quit) {
            System.out.println("\nChoose Menu option \n(0 to display menu list)");
            int choice = isScanner.nextInt();
            isScanner.nextLine();
            switch (choice) {
                case 0 ->  MobilePhone.printMenu();
                case 1 -> MobilePhone.addContacts();
                case 2 -> MobilePhone.displayContacts();
                case 3 -> MobilePhone.modifyContact();
                case 4 -> MobilePhone.removeContact();
                case 5 -> MobilePhone.searchContacts();
                case 7 -> {
                    System.out.println("Shutting down...\n" +
                            "Goodbye.");
                    quit = true;
                }
                case 6 -> newContacts.containsName();
            }
        }
    }
}
