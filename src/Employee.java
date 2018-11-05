import java.io.*;
public class Employee {
	String name;
	int age;
	String destination;
	double salary;
public Employee (String name){
	this.name = name;
}

public void empAge(int empAge){
	age=empAge;
}

public void empDestination(String empDestination){
	destination=empDestination;
}

public void empSalary(double empSalary){
	salary=empSalary;
}

public void printEmployee() {
    System.out.println("Name:"+ name );
    System.out.println("Age:" + age );
    System.out.println("Designation:" + destination );
    System.out.println("Salary:" + salary);
 }
}
