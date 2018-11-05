
import java.util.Scanner;

class HeltallsAreal {

  public static void main(String[] args) {

    int lengde;
    int bredde;
    int grunnflate;

    Scanner tastatur = new Scanner(System.in);

    System.out.print("Gi lengden av rektangelet [heltall]: ");                    // (1)
    lengde = tastatur.nextInt();                                                  // (2)
    System.out.print("Gi bredden av rektangelet [heltall]: ");                    // (3)
    bredde = tastatur.nextInt();                                                  // (4)

    grunnflate = lengde * bredde;                                                 // (5)

    System.out.printf( "Grunnflaten av et rektangel med lengde %d og bredde %d er %d%n",
      lengde, bredde, grunnflate);                                                // (6)
  }
}
