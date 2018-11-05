import java.util.Random;
public class randomNum {
	public static void main (String[]args){
		Random dice = new Random();
		int num;
		
		for (int teller = 1; teller<=10; teller++){
			num = 1 + dice.nextInt(6);
			System.out.println(num + " "); 
		}
	}
}
