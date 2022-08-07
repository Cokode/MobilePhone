import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Contacts {

    private static ArrayList<String> namesList = new ArrayList<String>();
    private static ArrayList<String> numberList = new ArrayList<String>();

    public void myContactNames() {
        System.out.println("You have " + namesList.size() + " contact in your contact list");
        for (int i = 0; i < namesList.size(); i++) {
        }
        for (int j = 0; j < numberList.size(); j++) {
            System.out.println(j + 1 + ". " + "Name: " + namesList.get(j) + " Phone No: " + numberList.get(j));
        }
    }

    public void oneContact2(String nameIndex){
        int index = namesList.indexOf(nameIndex);
        for (int i = 0; i < namesList.size(); i++) {
            if (index == i) {
                System.out.println(i + 1 + ". " + "Name: " + namesList.get(i) + " " + " Phone No: " + numberList.get(i));
                break;
            }
        }
    }


    public void addNamesAndPhoneNumber(String name, String number) {
        Scanner scanner = new Scanner(System.in);
        boolean checkName = namesList.contains(name);
        boolean checkNumber = numberList.contains(number);
        if (!checkNumber && (!checkName)){
            namesList.add(name);
            numberList.add(number);
            System.out.println("contact details successfully added");
        } else if (checkName && !checkNumber) {
            System.out.println("""
        Contact name already exist.
        press Yes to continue save as new contact with new number
        No to cancel
        """);
            String input = scanner.nextLine();
            if(Objects.equals(input, "Yes")) {
                namesList.add(name);
                numberList.add(number);
                System.out.println("contact details successfully added");
            } else{
                System.out.println("action canceled!");
            }

        } else{
                System.out.println("This contact name and number already exist in contact");
        }
    }

    public void modifyContact0(String oldNumber, String newNumber) {
        int oldNumberIndex = numberList.indexOf(oldNumber);
            if (oldNumberIndex >= 0) {
                numberList.set(oldNumberIndex, newNumber);
                System.out.println("contact info successfully modified.");
            } else {
                System.out.println("cannot find contacts in mobile Phone");
            }
    }

    public void modifyContact2(String oldName, String newName) {
        int oldNameIndex = namesList.indexOf(oldName);
        if (oldNameIndex >= 0 ) {
            namesList.set(oldNameIndex, newName);
            System.out.println("contact info successfully modified.");
        } else {
            System.out.println("cannot find contacts in mobile Phone");
        }
    }

    public void modifyContact(String oldNumber, String newNumber) {
        int oldNumberIndex = numberList.indexOf(oldNumber);
        if (oldNumberIndex >= 0 ) {
            numberList.set(oldNumberIndex,newNumber);
            System.out.println("contact info successfully modified.");
        } else {
            System.out.println("cannot find contacts in mobile Phone");
        }
    }

    public void removeContact(String name) {
        int findName = namesList.indexOf(name);
        int findNumber = numberList.indexOf(name);
        if (findName >= 0 || findNumber >= 0) {
            namesList.remove(findName);
            numberList.remove(findName);
        }
    }

    public String searchContactsName(String name) {
        int searchName = namesList.indexOf(name);
        if(searchName >= 0) {
           return namesList.get(searchName);
        } else {
           return null;
        }
    }
    public String searchContactsName2(String number) {
        int searchNumber = numberList.indexOf(number);
        if (searchNumber >=0 ) {
            return numberList.get(searchNumber);
        } else {
            return null;
        }
    }

    public int indexOfContact(String contactName) {
        return namesList.indexOf(contactName);
    }

    public String findItems(String search) {
        int isIndex = namesList.indexOf(search);
        if(isIndex >=0) {
            return namesList.get(isIndex);
        }
        return null;
    }
}
