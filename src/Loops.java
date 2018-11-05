
public class Loops {
	public static void main(String[]args){

		//øker med en hver gang, så lenge tallet er mindre en 10
		for(int counter = 1; counter <= 10; counter++){
				System.out.println(counter);
		}

		//øker med 3 hver gang, så lenge tallet er mindre en 10
		for(int counter = 1; counter <= 10; counter+=3){
				System.out.println(counter);
		}
		
		
		//øker med 3 hver gang, så lenge tallet er mindre en 34 og begynner på 6
		for(int counter = 6; counter <= 34; counter+=3){
				System.out.println(counter);
		}
		
		
		//enhanced for loop
		int marty[]={3,4,5,6,7};
		int sum=0;
		
		for(int x: marty){
			sum += x;
		}
		System.out.println("din sum er " + sum);
	}
}
