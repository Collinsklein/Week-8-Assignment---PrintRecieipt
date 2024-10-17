package printReceipt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PrintReceipt {
    public static void printReceipt() {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.println("Enter the product name: ");
            String productName = scanner.nextLine();

            System.out.println("Enter the price of the product: ");
            double price = scanner.nextDouble();

            System.out.println("Enter the quantity of the product: ");
            int quantity = scanner.nextInt();

            // Calculate the total cost
            double total = price * quantity;

            // Get the current date
           LocalDate currentDate = LocalDate.now();

           // another way to get time
        Date date = new Date();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

            // Format and print the receipt
            System.out.println("\n----------------------------------------------");
            System.out.printf("%-12s %-8s %-10s %-10s%n", "Name", "Qty", "Price", "Total");
            System.out.printf("%-12s %-8s %-10s %-10s%n", "----", "---", "-----", "-------");
            System.out.printf("%-12s %-8d $%-9.2f $%-10.2f%n", productName, quantity, price, total);
            System.out.println("\n\tThank you. Come again!!!");
          System.out.println("\nPurchased on: " + currentDate.format(formatter));
            System.out.println("----------------------------------------------");

            // Revision Muscle memory notes
        System.out.println("\n  \n  \n");

        System.out.println("\t My muscle memory notes;");
        System.out.println("From Tuesday's Class - When I want to print time");
        int number = 8888;
        System.out.printf(" %c", number);
        System.out.println("****This is how to print the Day + Month + date in the m/d/y format***");

        int number2 = 8888;
        System.out.printf(" %c", number2);
        System.out.println("This is how To print the current time");
        String timeOnly = String.format("%tr", date);
        int number3 = 8888;
        System.out.printf(" %c", number3);
        System.out.println("And This is the current time");
        System.out.println(timeOnly);

        Date today = new Date();
        String dayMonthYear = String.format("%tA %tB %tD", today, today, today );
        int number4 = 8888;
        System.out.printf(" %c", number4);
        System.out.println("And This is the current Date");
        System.out.println(dayMonthYear);

        int number5 = 8888;
        System.out.printf(" %c", number5);
        System.out.println("And These are the current Date (Day Month dayOftheMonth) in short form ");

        String dayMonthYearLowercase = String.format("%ta %tb %td", today, today, today );
        System.out.println(dayMonthYearLowercase);

        String dYL = String.format("%ta %<tb %<td", today);
        System.out.println(dYL);


        }
    public static void main(String[] args) {
        printReceipt();
    }
    }

