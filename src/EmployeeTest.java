import java.io.*;
public class EmployeeTest {
public static void main (String []args){
	Employee empOne = new Employee("Jane Doe");
	Employee empTwo = new Employee("John Smith");
	
	empOne.empAge(21);
	empOne.empDestination("Designer");
	empOne.empSalary(1000);
	empOne.printEmployee();
	
	empTwo.empAge(40);
	empTwo.empDestination("CEO");
	empTwo.empSalary(1450);
	empTwo.printEmployee();
	}
}
