import java.util.Scanner;
public class Pyramide
{
  public static void main (String[]args)
  {
    Scanner tastatur = new Scanner(System.in);
    System.out.println("Skriv inn antall rader: ");
    int antallRader = tastatur.nextInt();
    
   int maxInnrykk = antallRader + 2;

    for(int rad = 0; rad < antallRader; rad++)
    {
      int antallx = 2*rad;

      // Skriver ut innrykk
      for(int kolonne = 0; kolonne < maxInnrykk - antallx / 2; kolonne++)
      {
        System.out.print(" ");
      }

      // Skriver ut en rad i pyramiden
      System.out.print("d");
      for(int kolonne = 0; kolonne < antallx; kolonne++)
      {
        System.out.print("0");
      }
      System.out.println("b");
    }
  }
}