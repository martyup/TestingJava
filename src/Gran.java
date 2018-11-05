import java.util.Scanner;
public class Gran
{
  public static void main(String[]args)
  {

    int antallEtasjer;
    
    //Leser inn antall etasjer
    System.out.print("Skriv inn antall etasjer: ");
    Scanner tastatur = new Scanner(System.in);
    antallEtasjer = tastatur.nextInt();

    int maxinnrykk = 2 + antallEtasjer;
    
    // Skriver ut gran
    for(int etasje = 1; etasje <= antallEtasjer; etasje++) {
      for(int rad = etasje; rad < etasje + 3; rad++){

        // Regner ut antall tegn
        int antallx = 2*rad - 1;
        int antallMellomrom = maxinnrykk - antallx / 2;

        for (int kolonne = 0; kolonne < antallMellomrom; kolonne++) { 
          System.out.print(" ");
        }
        for (int kolonne = 0; kolonne < antallx; kolonne++) {
          System.out.print("x");
        }
        System.out.println();
      }
    }
  }  
}
