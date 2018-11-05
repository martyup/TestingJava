
import java.util.Scanner;
class DiverseSannhetsuttrykk {
  public static void main(String[] args) {
    Scanner tastatur = new Scanner(System.in);
    System.out.print("Gi ukedag [1=mandag,...,7=soendag]: ");
    int ukedag = tastatur.nextInt();
    if (ukedag == 2 || ukedag == 4)
      System.out.println("Tirsdag/torsdag: Forelesning i Java fra 12:15-14");
    else if (ukedag==1 || ukedag==5)
      System.out.println("Mandag/Fredag: Java oevelse fra 14:15-16");
    else if (ukedag>=6 || ukedag==3)
      System.out.println("Ingen forelesninger i dag: Repeter det du er usikker paa!");
    if (ukedag<=5 && !(ukedag==3))                                               // (1)
      System.out.println("Ukedager unntatt onsdag: Forelesning i logikk fra 10:15-12");
  }
}
