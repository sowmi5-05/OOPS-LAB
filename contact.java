import java.util.ArrayList;
import java.util.Scanner;

public class contact {
 public static void main(String[] args) {
   ArrayList<String> contacts = new ArrayList<>();
   Scanner sc = new Scanner(System.in);

    while (true) {
 System.out.println("\n1. Add Contact");
 System.out.println("2. View Contacts");
 System.out.println("3. Update Contact");
 System.out.println("4. Delete Contact");
 System.out.print("Enter your choice: ");
  int choice = sc.nextInt();
 sc.nextLine(); 
 switch (choice) {
   case 1:
     System.out.print("Enter name: ");
   String name = sc.nextLine();
 System.out.print("Enter phone number: ");
  String phone = sc.nextLine();
  String contact = name + " - " + phone;
  contacts.add(contact);
   System.out.println("Contact added.");
  break;
    case 2:
   if (contacts.isEmpty()) {
System.out.println("No contacts found.");
 } 
else {
  System.out.println("Contact List:");
    for (int i = 0; i < contacts.size(); i++) {
   System.out.println((i + 1) + ". " + contacts.get(i));
  }
   }
 break;
 case 3:
   System.out.print("Enter contact number to update: ");
int upIndex = sc.nextInt() - 1;
sc.nextLine(); // Clear buffer
  if (upIndex >= 0 && upIndex < contacts.size()) {
 System.out.print("Enter new name: ");
   String newName = sc.nextLine();
  System.out.print("Enter new phone number: ");
  String newPhone = sc.nextLine();
 String newContact = newName + " - " + newPhone;
 contacts.set(upIndex, newContact);
 System.out.println("Contact updated.");
    } 
else {
  System.out.println("Invalid contact number.");
   }
   break;
  case 4:
  System.out.print("Enter contact number to delete: ");
   int delIndex = sc.nextInt() - 1;
  if (delIndex >= 0 && delIndex < contacts.size()) {
  contacts.remove(delIndex);
   System.out.println("Contact deleted.");
   } else {
   System.out.println("Invalid contact number.");
   }
   break;
  default:
  System.out.println("Invalid option. Try again.");
  }
 }
 }
}
