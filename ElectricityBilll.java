import java.util.Scanner;
public class ElectricityBilll {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Consumer Number: ");
   String consumerNumber=sc.nextLine();
   System.out.print("Enter Consumer Name: ");
  String consumerName=sc.nextLine();
   System.out.print("Enter Previous Month Reading: ");
   int prevReading=sc.nextInt();
   System.out.print("Enter Current Month Reading: ");
    int currReading=sc.nextInt();
   sc.nextLine();
   System.out.print("Enter Connection Type (domestic/commercial): ");
   String type=sc.nextLine();

  int units = currReading - prevReading;
   double amount = 0;

 if (type.equalsIgnoreCase("domestic")) {
    if (units <= 100)
        amount = units * 1;
  else if (units <= 200)
     amount = 100 * 1 + (units - 100) * 2.5;
    else if (units <= 500)
        amount = 100 * 1 + 100 * 2.5 + (units - 200) * 4;
  else
    amount = 100 * 1 + 100 * 2.5 + 300 * 4 + (units - 500) * 6;
        } 

else if (type.equalsIgnoreCase("commercial")) {
   if (units <= 100)
   amount = units * 2;
   else if (units <= 200)
     amount = 100 * 2 + (units - 100) * 4.5;
 else if (units <= 500)
   amount = 100 * 2 + 100 * 4.5 + (units - 200) * 6;
 else
   amount = 100 * 2 + 100 * 4.5 + 300 * 6 + (units - 500) * 7;
        } 

else {
    System.out.println("Invalid connection type entered.");
        }

System.out.println("\n     Electricity Bill:   ");
System.out.println("Consumer Number   : " + consumerNumber);
System.out.println("Consumer Name     : " + consumerName);
System.out.println("Connection Type   : " + type);
System.out.println("Units Consumed    : " + units);
System.out.println("Total Bill Amount : Rs. " + amount);
   }
}
