import java.util.Scanner;

public class SannhetsTabell
{
  public static void main (String[] args)
  {
    Scanner tastatur = new Scanner(System.in);
    System.out.println("====================================================");
    System.out.println("|(a, b, !(a || b), !a && !b, !(a && b) og !a || !b)|");
    System.out.println("====================================================");
    
    
    skrivUtRad(false,false);
    skrivUtRad(true,false);
    skrivUtRad(false,true);
    skrivUtRad(true, true);
  }
  public static void skrivUtRad(boolean a, boolean b)
  {
        System.out.printf("|  %-7s|  %-7s|  %-7s|  %-7s|  %-7s|%n",
                      a, b, !(a || b), !a && !b, !(a && b), !a || !b);

  }
}