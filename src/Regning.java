
class Regning
{
  public static void main (String[]args)
  {
    double pris, sum, total;
    int antall;
    
    System.out.printf("Bare Data A/S                 ");
    System.out.printf("%02d-%02d-%04d, %02d:%02d:%02d %n %n", 6, 7, 2005, 12, 5, 9);
    
    System.out.printf("%-24s %8s %6s %8s%n", "Vare", "Pris", "Antall", "Sum");
    pris= 999.75; antall=2; sum=antall*pris; total=sum;
    
    System.out.printf("%-24s %8.2f %6d %8.2f%n", "Ultraflash, USB 2.0, 1GB", pris, antall, sum);
    pris= 1250.00; antall=1; sum=antall*pris; total =total+sum;
    
    System.out.printf("%-24s %8.2f %6d %8.2f%n", "Mega HD, 200GB", pris, antall, sum);
    pris= 63.99; antall=3; sum=antall*pris; total =total+sum;
    
    System.out.printf("%-24s %8.2f %6d %8.2f%n", "USB 2.0 kabel, 2m", pris, antall, sum);
    
    System.out.printf("%-24s %8.2f %n", "Total: ", total);
  }
}