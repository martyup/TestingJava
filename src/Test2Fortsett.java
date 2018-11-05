import java.util.*;
public class Test2Fortsett {
	public static void main(String[]args){
		Scanner tastatur = new Scanner(System.in);
		Test2 TestObject2 = new Test2();
		
		System.out.println("Skriv inn navnet på din første bff: ");
		String temp = tastatur.nextLine();
		TestObject2.setName(temp);
		TestObject2.saying();
	}
}
