
public class mathClass {
	public static void main (String []args){
		System.out.println(Math.ceil(7.4)); //runder opp
		System.out.println(Math.floor(7.4)); //runder ned
		System.out.println(Math.max(8.6,5.2)); // finner det høyeste
		System.out.println(Math.min(8.6,5.2)); // finner det laveste
		System.out.println(Math.pow(5,3)); // 5*5*5
		System.out.println(Math.sqrt(9)); // squerrout 
		
		
	    int i = 1;
	    int j = 2;
	 
	    System.out.println("i is " + i);
	    System.out.println("j is " + j);
	  
	    int k = i + j;
	    System.out.println("i + j is " + k);
	    
	    k = i - j;
	    System.out.println("i - j is " + k);
	    
	    /*     
	 * <li>sumOfDigits(129) == 12
     * <li>sumOfDigits(-12) == 3
     * <li>sumOfDigits(100) == 1*/
        
        int x = 129;
        double c = 100;
        double d = -12;
        double y =134;
        
        System.out.println("x mod 10 = " + x%7);
        System.out.println("d mod 10 = " + d%5);
        System.out.println("c mod 10 = " + c%6); 
        System.out.println("c mod 10 = " + y%10);
        
        
        
        

	}
}
