/*4.17 (Gas Mileage) 
Drivers are concerned with the mileage their automobiles get. 
One driver has kept track of several trips by recording the 
miles driven and gallons used for each tankful. Develop a Java 
application that will input the miles driven and gallons used 
(both as integers) for each trip. The program should calculate 
and display the miles per gallon obtained for each trip and print 
the combined miles per gallon obtained for all trips up to this 
point. All averaging calculations should produce floating-point 
results. Use class Scanner and sentinel-controlled iteration to 
obtain the data from the user. 
*/
import java.util.Scanner;

public class Chap4_ex417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;
        
        System.out.println("Enter the miles driven and gallons used for each trip (enter -1 to exit):");
        
        while (true) {
            System.out.print("Miles driven for trip " + (tripCount + 1) + ": ");
            int miles = input.nextInt();
            
            if (miles == -1) {
                break;
            }
            
            System.out.print("Gallons used for trip " + (tripCount + 1) + ": ");
            int gallons = input.nextInt();
            
            double mpg = (double) miles / gallons;
            
            System.out.printf("MPG for trip %d: %.2f%n", tripCount + 1, mpg);
            
            totalMiles += miles;
            totalGallons += gallons;
            tripCount++;
            
            double totalMPG = (double) totalMiles / totalGallons;
            
            System.out.printf("Combined MPG for all trips: %.2f%n", totalMPG);
        }
        
        input.close();
    }
}
