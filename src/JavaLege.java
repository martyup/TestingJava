
import java.util.Scanner;

public class JavaLege {

  public static void main(String[] args) {

      Scanner tastatur = new Scanner(System.in);

     // Be om pasientens temperatur
      System.out.println("Hva er din temperatur? ");

      // Les inn temperaturen
      double temperatur = tastatur.nextDouble(); 
        
      // Sjekk om pasienten har feber
      if (temperatur > 37.5) 
        System.out.println("Du har feber!");
      else 
        System.out.println("Du har ikke feber!");
      
      if (temperatur == 37.5) 
        System.out.println("Du er med stor sansynlighet frisk!");
  }
}
