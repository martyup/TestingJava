

import java.util.Scanner;

public class AnnenGrad{

  public static void main(String[] args) {

      Scanner tastatur = new Scanner(System.in);

      System.out.println("**********************************************************************");
      System.out.println("*                                                                    *");
      System.out.println("*  Dette programmet løser en 2.gradsligning på formen ax^2 + bx + x  *");
      System.out.println("*                                                                    *");
      System.out.println("**********************************************************************");
      System.out.println();  // Skriver ut en blank linje
     
// Innlesing av a, b og c
      System.out.print("Gi verdien til a: ");
      double a = tastatur.nextDouble(); 
      System.out.print("Gi verdien til b: ");
      double b = tastatur.nextDouble(); 
      System.out.print("Gi verdien til c: ");
      double c = tastatur.nextDouble(); 
    
// Regner ut diskriminanten til ligningen
      double diskriminant = (b * b) - (4 * a * c);

// Avgjør hvor mange løsninger vi har
      boolean ingenLosning = diskriminant < 0.0;
      boolean enLosning = diskriminant == 0.0;
      boolean toLosninger = diskriminant > 0.0;

      System.out.println("Du har skrevet "+a+"x^2 + "+b+"x + "+c);
/*
      System.out.print("\nDu har skrevet "+a+"x^2 ");

      if (b>=0.0)
        System.out.print("+ ");
      System.out.print(b+"x ");
      if (c>=0.0)
        System.out.print("+ ");
      System.out.println(c+"\n");
*/
      if (ingenLosning) {
        System.out.println("Diskriminanten er "+diskriminant+". Ligningen har ingen løsning");
      }
      else {
        double rotDiskriminant = Math.sqrt(diskriminant);
        double forsteLosning = (-b + rotDiskriminant)/(2.0 * a);

        if (enLosning) {
          System.out.println("Ligningen har bare en løsning: "+forsteLosning);
        }
        else 
          if (toLosninger) {
            double andreLosning = (-b - rotDiskriminant)/(2.0 * a);
            System.out.println("Ligningen har to løsninger: "+forsteLosning+" og "+andreLosning);
          }
          else
            System.out.println("Et eller annet er seriøst feil...");
      }
      
  } // main

}
