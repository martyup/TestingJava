
public class lagEnV {
	public static void main (String[]args){
		int tall=8;//hvor stor V'en blir
		for(int i = 1; i<tall; i++){
			for(int j = 0; j < tall *2 ; j++){
				if(i == j || i == tall*2-j && i <tall){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int k =0; k < tall; k++){
			
			if(k== tall -1){System.out.print(" * ");}
			else{System.out.print(" ");}
		}
	}

}
