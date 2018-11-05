

public class BrukAvVariabler{  

  public static void main(String[] args) {

    int x = 3; // Deklarasjon med startverdi.
    int y = 4;

    System.out.println("Resultat: " + (x+y));

    y = y + 7;     // Endrer y verdien

// Merk at alt mellom " " tegnene er en tekststreng
    System.out.println(x + " + " + y + " = " + (x+y));

//***************************************************

// Bytte av verdi
    System.out.println("x = " + x + " og y = " + y);

    int temp = x;
    x = y;
    y = temp;

    System.out.println("Men nå er x = " + x + " og y = " + y);

//***************************************************

    System.out.print("Potenser av 2: 0, ");

    int i = 2;
    System.out.print(i + ", ");
    i = i*2;
    System.out.print(i + ", ");
    i = i*2;
    System.out.print(i + ", ");
    i = i*2;
    System.out.print(i + ", ");
    i = i*2;
    System.out.print(i + ", ");
    i = i*2;
    System.out.println(i);  // Avslutter med println

  }

}
