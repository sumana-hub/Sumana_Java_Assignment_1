/*
5.11 (Find the Smallest Value) 
Write an application that finds the smallest of several integers. 
Assume that the first value read specifies the number of values 
to input from the user. 
*/

import java.util.Scanner;

public class Chap5_ex511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the number of values to input
        System.out.println("Enter the number of values: ");
        int numValues = input.nextInt();

        // Check if the number of values is valid
        if (numValues <= 0) {
            System.out.println("Invalid input.");
            input.close();
            return;  
        }

        // Ask for the integers
        System.out.println("Enter " + numValues + " integers:");

        // Read the first integer
        int smallest = input.nextInt();

        // Loop through the remaining integers
        for (int i = 1; i < numValues; i++) {
            int next = input.nextInt();
            if (next < smallest) {
                smallest = next;
            }
        }

        // Display the smallest value
        System.out.println("The smallest value is: " + smallest);

        input.close(); 
    }
}
