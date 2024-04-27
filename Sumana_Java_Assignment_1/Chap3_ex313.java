/*3.13 
(Employee Class) Create a class called Employee that includes 
three instance variables—a first name (type String), a last name 
(type String) and a monthly salary (double). Provide a constructor 
that initializes the three instance variables. Provide a set and 
a get method for each instance variable. If the monthly salary is 
not positive, do not set its value. Write a test app named 
EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s 
yearly salary again. 
*/

public class Chap3_ex313 {
  public static void main(String[] args) {
    // Employee objects
    Employee employee1 = new Employee("John", "Doe", 5000);
    Employee employee2 = new Employee("Jane", "Smith", 6000);

    // Display yearly salary for each employee
    System.out.printf("Employee %s %s's yearly salary: %.2f%n",
      employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
    System.out.printf("Employee %s %s's yearly salary: %.2f%n",
      employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

    // Then give each Employee a 10% raise and display each Employee’s yearly salary again. 
    employee1.giveRaise(10);
    employee2.giveRaise(10);

    // Display yearly salary after raise for each employee
    System.out.println("\nAfter 10% raise:");
    System.out.printf("Employee %s %s's yearly salary: %.2f%n",
      employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
    System.out.printf("Employee %s %s's yearly salary: %.2f%n",
      employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
  }
}
