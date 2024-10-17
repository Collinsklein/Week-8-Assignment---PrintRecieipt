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
        String timeOnly = String.format("%tr", date);
        System.out.println(timeOnly);

        Date today = new Date();
        String dayMonthYear = String.format("%tA %tB %tD", today, today, today );
        System.out.println(dayMonthYear);

        System.out.println(" ");

        String dayMonthYearLowercase = String.format("%ta %tb %td", today, today, today );
        System.out.println(dayMonthYearLowercase);

        String dYL = String.format("%ta %<tb %<td", today);
        System.out.println(dYL);


        }
    public static void main(String[] args) {
        printReceipt();
    }
    }

