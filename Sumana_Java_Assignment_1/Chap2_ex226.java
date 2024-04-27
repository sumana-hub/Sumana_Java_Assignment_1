/*2.26 (Multiples) 
Write an application that reads two integers, 
determines whether the first is a multiple of 
the second and prints the result. 
[Hint: Use the remainder operator.] 
*/

import java.util.Scanner;

public class Chap2_ex226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // reads two integers
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // determines whether the first is a multiple of the second
        boolean isMultiple = num1 % num2 == 0;

        // prints the result
        if (isMultiple) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        input.close();
    }
}
