
public class IfSetninger {
	public static void main(String[]args){
	
		int age = 30;
		
		//nøstede if-setninger
		if(age <50){
			System.out.println("You are young");
		}else{
			System.out.println("You are old");
			if (age > 75){
				System.out.println("You are really old");
			}else{
				System.out.println("naaah not that old");
			}
		}
		
		
		//else  if setninger
		if (age >= 60){
			System.out.println("You are old");
		}else if(age >= 50){
			System.out.println("You are in your 50s");
		}else if(age >= 40){
			System.out.println("You are in your 40s");
		}else if(age >= 30){
			System.out.println("You are in your 30s");
		}else if(age >= 20){
			System.out.println("You are in young");
		}
		
		
		//conditional operator
			System.out.println(age > 50 ? "You are old" : "You are young");
		
	}
}
