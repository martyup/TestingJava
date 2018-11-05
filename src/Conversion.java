

import java.util.Scanner; 
//Import to allow you to get user input
public class Conversion 
{ 
  public static void main(String[] args) 
  { 
    Scanner in = new Scanner(System.in); //Creates scanner object, requires java.util.Scanner 
    System.out.println("Would you like to convert from Fahrenheit to Celcius or Celcius to Fahrenheit? (1/2)"); 
    System.out.println("(1) Fahrenheit to Celcius"); 
    System.out.println("(2) Celcius to Fahrenheit"); 
    int choice = in.nextInt(); //Get user input on whether to do F to C or C to F 
    if (choice != 1 && choice != 2) 
    {
      System.out.println("That was not one of the choices."); //handle if they don't enter a valid choice. 
    } 
    else 
    { System.out.println("Please enter the temperature in Celcius to be converted to Fahrenheit:"); 
      double toConvertCelcius = in.nextDouble(); 
      toConvertCelcius = (((toConvertCelcius*9)/5)+32); //multiply by 9, divide by 5, add 32. 
      System.out.println("Your converted value is: " + toConvertCelcius + " degrees Fahrenheit."); 
    } 
  } 
}