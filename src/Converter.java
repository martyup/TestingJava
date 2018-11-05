

import java.util.Scanner;

/**
 * An application which will convert from Fahrenheit to Celsius or from Celsius
 * to Fahrenheit.
 */
public class Converter {
  
  /**
   * The entry point of the application.
   * @param args No arguments expected.
   */
  public static void main(String[] args)
  {
    int choice;
    int temp1;
    int temp2;
    String from;
    String to;
    Scanner kb = new Scanner(System.in);
    do {
      choice = -1;
      System.out.println("\nConvert temperature:\n");
      System.out.println("\t1 - Convert from Fahrenheit to Celsius");
      System.out.println("\t2 - Convert from Celsius to Fahrenheit");
      System.out.println("\t3 - Exit");
      choice = kb.nextInt();
      
      switch (choice) {
        case 1:
          System.out.println("\nEnter the temperature in Fahrenheit:");
          temp1 = kb.nextInt();
          temp2 = convertToCelsius(temp1);
          from = "Fahrenheit";
          to = "Celsius";
          break;
        case 2:
          System.out.println("\nEnter the temperature in Celsius:");
          temp1 = kb.nextInt();
          temp2 = convertToFahrenheit(temp1);
          from = "Celsius";
          to = "Fahrenheit";
          break;
        default:
          continue; // no input, no output
      }
      System.out.print("\n");
      System.out.print(temp1);
      System.out.print(' ');
      System.out.print(from);
      System.out.print(" = ");
      System.out.print(temp2);
      System.out.print(' ');
      System.out.print(to);
      System.out.print('\n');
    } while (choice != 3);
  }

private static int convertToFahrenheit(int temp1) {
	// TODO Auto-generated method stub
	return 0;
}

private static int convertToCelsius(int temp1) {
	// TODO Auto-generated method stub
	return 0;
}
}