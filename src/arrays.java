import java.util.Random;
public class arrays {
	public static void main(String[]args){
		
		
		//nr1
		System.out.println("nr 1");
		
		int martine[] = new int[10]; //ti verdier i arrayen
		
		martine[0]= 87;
		martine[1]= 234;
		martine[9]= 435;
		
		System.out.println(martine[1]);
		
		
		//nr2
		System.out.println("nr 2");
		int newMarty[]= {87,234,5,6,7,8,12};
		System.out.println(newMarty[3]);
	
		//nr3
//		System.out.println("nr 3");
		/*System.out.println("Index\tValue");
		int marty[]={21,43,675,12,56};
		
		for(int teller=0; teller <= marty.length; teller++){
			System.out.println(teller + "\t" + marty[teller]);
		}
		*/
		//nr4
		System.out.println("nr 4");
		String[] columns= {"name","age","country", "heigth"};
		  String text [][]= {{"emil","23","sweden", "180"}, 
			       {"jojo","98", "murica", "200"},
			       {"hershel", "40", "mexico", "175"}};

			for (int i =0; i<columns.length;i++){
			   System.out.print(columns[i] + "\t");
			  }
			  
			  System.out.println("\n");
			  String newText = "";
			  
			// iterates through each row i in the text array
			  for (int i = 0; i<text.length;i++){
			   // goes through each word j in the row of i
			   for(int j = 0; j<text[i].length;j++){
			    //add the word and a tab between the columns
			    newText += text[i][j] + "\t";
			   }
			   //after each row, add new line
			   newText += "\n";
			  }
			  System.out.println(newText);
	
			  
			  //nr5
			  /*
			   * System.out.println("nr 5");
			  int marty5[]={21,43,53,12};
			  int sum=0;
			  
			  for(int teller= 0;teller<= marty5.length; teller++){
				  sum += marty5[teller];
			  }
			  
			  System.out.println("summen er " + sum);*/
			  
			  //nr6
			  System.out.println("nr 6");
			   Random random = new Random();
			   
			   int freq[] = new int [7];
			   for(int roll=1; roll< 100; roll++){
				   ++freq[1+random.nextInt(6)];
			   }
			   System.out.println("Face\t Frequency");
			   for(int face=1; face<freq.length;face++){
				   System.out.println(face + "\t" + freq[face]);
			   }
			   
			   
			   //nr7
			   
			   System.out.println("nr 7");
			   int tabell[]={1,2,23,4,5};
			   change(tabell);
			   
			   for(int y:tabell){
				   System.out.println(y);
			   }
			   
			   //nr8
			   System.out.println("nr 8");
			   int firstArray[][]={{3,4,5,6},{3,4,5,5}};
			   int secondArray[][]={{20,30,23,40}, {34}, {1,2,3}};
			   
			   System.out.println("This is the first");
			   display(firstArray);
			   
			   System.out.println("This is the second");
			   display(secondArray);
			   
			   
			   //nr9
			   System.out.println("nr 9");
			   System.out.println(average(45,323,54,43,3,12));
					  
	}
	
	public static int average(int...numbers){//kan skrive så mange nr man vil
		int total =0;
		for(int x:numbers)
			total+=x;
		
		return total/numbers.length;
	}
	
	public static void change(int x[]){
		for(int teller2=0; teller2< x.length;teller2++){
			x[teller2]+=5;
			// legger til 5 på alle tallene i arrayen
		}
	}
	
	public static void display (int x [][]){
		for(int row=0; row<x.length; row++){
			for(int column=0; column<x[row].length; column++){
				System.out.print(x[row][column]+ "\t");
			}
			System.out.println();
		}
	}
}
