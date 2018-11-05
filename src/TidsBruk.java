
import java.util.Scanner;

public class TidsBruk{

  public static void main(String[] args) {

// Lager ny scanner og knytter denne til System.in (dvs tastaturet)
      Scanner tastatur = new Scanner(System.in);
     
      System.out.println();
      System.out.print("Gi start-tidspunkt og slutt-tidspunkt ");
      System.out.println("så regner programmet ut tidsforbruket.");
      System.out.println("Gi tidspunkt som timer, minutter og sekunder, ");
      System.out.println("tre tall på en linje med mellomrom mellom hvert par av tall\n");

      System.out.print("Gi start-tidspunkt, tre heltall med mellomrom: ");
      int startTime   = tastatur.nextInt(); 
      int startMinutt = tastatur.nextInt(); 
      int startSekund = tastatur.nextInt(); 

      System.out.print("Gi slutt-tidspunkt, tre heltall med mellomrom: ");
      int sluttTime   = tastatur.nextInt(); 
      int sluttMinutt = tastatur.nextInt(); 
      int sluttSekund = tastatur.nextInt(); 
      System.out.println();

// Regner ut totalt antall sekunder fra kl. 00:00:00 til start og slutt
      int totalStart = startTime * 3600 + startMinutt * 60 + startSekund;
      int totalSlutt = sluttTime * 3600 + sluttMinutt * 60 + sluttSekund;
      
// Regn ut totalt antall sekunder brukt
      int totalBrukt = totalSlutt - totalStart;

// Regn ut antall timer, minutter og sekunder brukt
      int bruktTime = totalBrukt/3600;   // Antall timer
      totalBrukt = totalBrukt % 3600;     // Trekk fra timene
      int bruktMinutt = totalBrukt/60;  // Antall minutter
      totalBrukt = totalBrukt % 60;       // Trekk fra minuttene
      int bruktSekund = totalBrukt;       // Antall sekunder

      System.out.printf("Med start-tid %02d:%02d:%02d ",startTime,startMinutt,startSekund);
      System.out.printf("og slutt-tid %02d:%02d:%02d ",sluttTime,sluttMinutt,sluttSekund);
      System.out.printf("har du brukt %02d:%02d:%02d \n",bruktTime,bruktMinutt,bruktSekund);

// Forbedringer: Kunne sjekket at data var lovlige og gitt feilmelding
// Hva om man legger til dager, måneder og år?

  } // main

}
