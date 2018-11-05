

import java.util.Scanner;
class RegneSideneTilRektangel
{
  public static void main (String [] args)
  {
    Scanner tastatur = new Scanner (System.in);
    
    int lengde;
    int bredde;
    int grunnflaten;
    
    System.out.println("Skriv inn lengden til rektangelet:");
    lengde = tastatur.nextInt();
    
    System.out.println("Skriv inn bredden til rektangelet:");
    bredde = tastatur.nextInt();
    
    grunnflaten  = (lengde*bredde);
    System.out.printf("Grunnflaten av et rektangel med lengde " + lengde + " og  bredde " + bredde + " er: " + grunnflaten);
    
  }
}