//Create a class called Employee that includes 
//three instance variables—a first name (type String), 
//a last name (type String) and a monthly salary (double).
public class Employee {
  private String firstName;
  private String lastName;
  private double monthlySalary;

  // Provide a constructor that initializes the three instance variables.
  public Employee(String firstName, String lastName, double monthlySalary) {
      this.firstName = firstName;
      this.lastName = lastName;
      setMonthlySalary(monthlySalary);
  }

  //Provide a set and a get method for each instance variable. 
  //If the monthly salary is not positive, do not set its value.
  public String getFirstName() {
      return firstName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public void setLastName(String lastName) {
      this.lastName = lastName;
  }

  public double getMonthlySalary() {
      return monthlySalary;
  }

  public void setMonthlySalary(double monthlySalary) {
      if (monthlySalary > 0) {
          this.monthlySalary = monthlySalary;
      } else {
          this.monthlySalary = 0.0;
      }
  }

  // Method to calculate yearly salary
  public double getYearlySalary() {
      return monthlySalary * 12;
  }

  // Method to give a raise
  public void giveRaise(double percentage) {
    double raiseAmount = monthlySalary * percentage / 100;
    monthlySalary += raiseAmount;
  }
}
