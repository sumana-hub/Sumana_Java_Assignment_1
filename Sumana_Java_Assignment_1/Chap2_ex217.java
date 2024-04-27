/*
(Arithmetic, Smallest and Largest) Write an application that 
inputs three integers from the user and displays the sum, average, 
product, smallest and largest of the numbers. 
*/

import java.util.Scanner;

public class Chap2_ex217 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first integer: "); 
    int number1 = input.nextInt(); // read first number from user

    System.out.println("Enter the second integer: "); 
    int number2 = input.nextInt(); // read second number from user

    System.out.println("Enter the third integer: "); 
    int number3 = input.nextInt(); // read third number from user
      
    int sum = number1 + number2 + number3; // Sum Calculation
    int average = sum / 3; // Average Calculation
    int product = number1 * number2 * number3; // Product Calculation
      
    // To find the smallest
    int smallest = number1;
    if (number2 < smallest) {
        smallest = number2;
    }
    if (number3 < smallest) {
        smallest = number3;
    }
    // To find the largest
    int largest = number1;
    if (number2 > largest) {
        largest = number2;
    }
    if (number3 > largest) {
        largest = number3;
    }

    // Print the sum, average, product, smallest and the largest number
    System.out.printf("The sum is %d%n", sum);
    System.out.printf("The average is %d%n", average);
    System.out.printf("The product is %d%n", product);
    System.out.printf("The smallest is %d%n", smallest);
    System.out.printf("The largest is %d%n", largest);

    input.close();
   } // main()
} // class()