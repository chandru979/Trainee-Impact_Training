package oops;
interface EmployeeBehavior {
 void work();  
 void attendMeeting(); 

 default void takeBreak() {
     System.out.println("The employee is taking a short break.");
 }
}

abstract class Company {
 String companyName;
 String companyLocation;

 public Company(String companyName, String companyLocation) {
     this.companyName = companyName;
     this.companyLocation = companyLocation;
 }

 abstract void companyPolicy();  

 public void companyDetails() {
     System.out.println("Company Name: " + companyName);
     System.out.println("Company Location: " + companyLocation);
 }
}

class Employee extends Company implements EmployeeBehavior {
 
 public Employee(String companyName, String companyLocation) {
     super(companyName, companyLocation);  // Call parent class constructor
 }

 @Override
 void companyPolicy() {
     System.out.println(companyName + " has a flexible work-from-home policy.");
 }

 @Override
 public void work() {
     System.out.println("The employee is working at " + companyName + ".");
 }

 @Override
 public void attendMeeting() {
     System.out.println("The employee is attending a meeting at " + companyName + ".");
 }
}

public class Abc {
 public static void main(String[] args) {
     Employee employee = new Employee("TechCorp", "San Francisco");

     employee.companyDetails();  
     employee.companyPolicy();   
     employee.work();            
     employee.attendMeeting();   
     employee.takeBreak();       
 }
}

