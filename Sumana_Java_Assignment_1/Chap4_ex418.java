/*4.18 (Credit Limit Calculator) 
Develop a Java application that determines whether any of several 
department-store customers has exceeded the credit limit on a charge account.
For each customer, the following facts are available:
account number
balance at the beginning of the month
total of all items charged by the customer this month
total of all credits applied to the customer’s account this month
allowed credit limit.
The program should input all these facts as integers, 
calculate the new balance (= beginning balance + charges – credits), 
display the new balance and determine whether the new balance exceeds 
the customer’s credit limit. For those customers whose credit limit 
is exceeded, the program should display the message 
"Credit limit exceeded". 
*/

import java.util.Scanner;

public class Chap4_ex418 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = input.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("Enter details for customer " + i + ":");
            System.out.print("Account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Balance at the beginning of the month: ");
            int beginningBalance = input.nextInt();
            System.out.print("Total of all items charged this month: ");
            int totalCharges = input.nextInt();
            System.out.print("Total of all credits applied this month: ");
            int totalCredits = input.nextInt();
            System.out.print("Allowed credit limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Display new balance
            System.out.println("New balance for account " + accountNumber + ": " + newBalance);

            // Check if new balance exceeds credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded for account " + accountNumber);
            }
        }

        input.close();
    }
}
