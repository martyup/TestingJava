import java.util.*;
public class Switch {
	public static void main(String args[]){
		int age;
		
		Scanner tastatur =new Scanner(System.in);
		System.out.println("Skriv inn din alder: ");
		age = tastatur.nextInt();
		
		switch (age){
		case 20:
			System.out.println("Du er ikke tenåring lenger");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You do stupid stuff");
			break;
		default: 
			System.out.println("I dont know how old you are");
			break;
		}
	}
}
