
import java.util.Scanner;

public class GjettEtTall{

  public static void main(String[] args) {

      int htall = 0;
      Scanner tastatur = new Scanner(System.in);

     // Be brukeren aa tenke paa et tall
      System.out.println("Tenk på et tall fra 1 til og med 10");

      System.out.println("Er tallet mindre enn 6 (1 for ja, 0 for nei)?");

      // Les inn temperaturen
      int svar = tastatur.nextInt(); 
    
      if (svar == 1) {  // 1-5
        System.out.println("Er tallet mindre enn 3 (1 for ja, 0 for nei)?");
        svar = tastatur.nextInt(); 
        if (svar == 1) {  // 1-3
          System.out.println("Er tallet mindre enn 2 (1 for ja, 0 for nei)?");
          svar = tastatur.nextInt(); 
          if (svar == 1) {  // 1
            htall = 1;
          }
          else { // 2-3
            System.out.println("Er tallet mindre enn 3 (1 for ja, 0 for nei)?");
            svar = tastatur.nextInt(); 
            if (svar == 1) {  // 2
              htall = 2;
            }
            else { // 3
              htall = 3;
            }
          } // Ferdig 2-3
        }   // Ferdig 1-3
        else { // 4-5
          System.out.println("Er tallet mindre enn 5 (1 for ja, 0 for nei)?");
          svar = tastatur.nextInt(); 
          if (svar == 1) {  // 4
            htall = 4;
          }
          else { // 5
            htall = 3;
          }
        } // Ferdig 4-5
      }   // Ferdig 1-5
      else { // 6-10
        System.out.println("Er tallet mindre enn 9 (1 for ja, 0 for nei)?");
        svar = tastatur.nextInt(); 
        if (svar == 1) {  // 6-8
          System.out.println("Er tallet mindre enn 7 (1 for ja, 0 for nei)?");
          svar = tastatur.nextInt(); 
          if (svar == 1) {  // 6
            htall = 6;
          }
          else { // 7-8
            System.out.println("Er tallet mindre enn 8 (1 for ja, 0 for nei)?");
            svar = tastatur.nextInt(); 
            if (svar == 1) {  // 7
              htall = 7;
            }
            else { // 8
              htall = 8;
            }
          } // Ferdig 7-8
        }   // Ferdig 6-8
        else { // 9-10
          System.out.println("Er tallet mindre enn 10 (1 for ja, 0 for nei)?");
          svar = tastatur.nextInt(); 
          if (svar == 1) {  // 9
            htall = 9;
          }
          else { // 10
            htall = 10;
          }
        } // Ferdig 9-10 
      }   // Ferdig 6-10

      System.out.println("Du tenkte på " + htall +"!");
      
  } // main

}
