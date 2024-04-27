/*(Odd or Even) 
Write an application that reads an integer and determines and prints 
whether it’s odd or even. 
*/
import java.util.Scanner;

public class Chap2_ex225 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("Enter an integer: "); 
  int number = input.nextInt(); // read the number from user

  // [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]
  if (number % 2 == 0) {
    System.out.println(number + " is even.");
  } else {
    System.out.println(number + " is odd.");
  }
  
  input.close();
  } // main()
} //class()
