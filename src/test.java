import java.util.*;
public class test {
	public static void main(String args[]){
		String navn;
		double firstnr, secondnr, svar;
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("Hva heter du?");
		navn= tastatur.nextLine();
		
		
		System.out.println("Hei " + navn + ", skriv inn et nr: ");
		firstnr= tastatur.nextDouble();
		System.out.println("et til: ");
		secondnr= tastatur.nextDouble();
		
		svar= firstnr + secondnr;
		System.out.println(firstnr + " + " + secondnr + " = " + svar);
		

		System.out.println("Er tallet mindre en 100?");
		if (svar <= 100){
			System.out.println("ja");
		}
		else{
			System.out.println("nei, tallet er " + svar);
			
		}
	}
	public void melding(){

		System.out.println("tallet er lavere en 10");
	}
}
