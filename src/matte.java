
	public class matte {
		
		public static void main(String[] args){
		
			matte recursionTool = new matte();
			
			//recursionTool.calculateSquaresToPrint(6);
			//System.out.println("TN: "+recursionTool.getTriangularNum(6));
			//System.out.println("TN: "+recursionTool.getTriangularNumR(-6));
			System.out.println("TN: "+recursionTool.getFactorial(-5));
			//System.out.println("TN: "+matte.sumOfDigits(-12));
			//System.out.println("TN: "+matte.nCr(2, 1));
			
		}
		 /**
	     * N choose R.
	     * 
	     * The function nCr(n, r) returns how many possible combinations of r
	     * elements can be made out of a collection of size n. For example, given
	     * three (n=3) fruits, say an apple, an orange and a pear, there are three
	     * combinations of two (r=2) that can be drawn from this set: an apple and a
	     * pear; an apple and an orange; or a pear and an orange. Thus, nCr(3,
	     * 2)==3.
	     * 
	     * Examples:
	     * <ul>
	     * <li>nCr(3, 2) == 3
	     * <li>nCr(2, 1) == 2
	     * <li>nCr(1, 0) == 1
	     * <li>nCr(2, 3) == 0
	     * <li>nCr(5, -1) == 0
	     * <li>nCr(-2, 1) == 0
	     * </ul>
	     * 
	     * Try writing the function without calculating the factorial, and without
	     * using loops of any form (for, while, etc.)
	     * 
	     * Hint 1: By the definition, what happens when r>n? r==n? r==0?
	     * 
	     * Hint 2: Suppose there are n different types of fruit, and that apples are
	     * one of them. Some of the possible combinations of fruit that can be made
	     * include apples, say x. Some combinations of fruit does __not__ contain
	     * apples, say y. Notice that then the total number of combinations is x+y.
	     * Can we calculate x and y recursively?
	     * 
	     * Hint 3: If you are still stuck, look up the recurrence relation here:
	     * https://en.wikipedia.org/wiki/Binomial_coefficient#Recursive_formula
	     * 
	     * 
	     * If you test the function and find that it is very slow on big inputs, that
	     * is to be expected. Is there something we can do to speed it up?
	     * 
	     * @param n
	     *            the size of the collection
	     * @param r
	     *            the size of the combination
	     * @return the number of ways to pick r items from a collection of n items.
	     */
		
		/*C(n,r) = 
C(3,2) =
3! / (2! (3 - 2)!) =*/ 
		public static int nCr(int n, int r) {
		        if (n<0 || r<0){
		        return 0;
		        }
		        if(r>n){
		        	return 0;
		        }
		        if(r==n){
		        	return 1;
		        }
		        if(r==0){
		        	return 1;
		        }
		        if(r==n-1){
		        	return n;
		        }
		        return nCr(n-1, r-1) + nCr(n-1, r);
		    }
		 
		public int getTriangularNum(int num){
			int triangularNumber =0;
			
			//3+2+1 =6
			
			while (num >0){
				triangularNumber = triangularNumber + num;
				num --;
			}
			return triangularNumber;
		}	
		
		public int getTriangularNumR(int num){
			System.out.println("Method " + num);
			if (num == 1){
				System.out.println("returned 1");
				return 1;
			}else{
				int result = num + getTriangularNumR(num -1);
				System.out.print("returned "+ result);
				System.out.println(" : " + num + " get TN( " + num + " - 1)");
				return result;
			}
		}
		
		public int getFactorial(int height){
			System.out.println("Method " + height);
			if (height == 0){
				return 0;
			} else if (height>0){
				// 5 = 2 * 2+1
				//14 = 3 * 3+5
				//30 = 4 * 4+14
				//(forrigeSvar + høyden) * høyden =  antallBlokker
				//int forrige =1;
				int result = getFactorial(height-1) + (height * height);
				//int result = height * getFactorial(height-1);
				//result++;
				
				System.out.print("returned "+ result);
				System.out.println(" : " + height + " * " + height + " + ("+ height + " - 1)");
				
				return result;
			}
			else{
				
				int result = getFactorial(height+1) + ((height * height) * -1);

				System.out.print("returned "+ result);
				System.out.println(" : " + height + " * " + height + " + ("+ height + " - 1)");
				
				return result;
			}
			
		
		}
		/*
		 * 
		 * <li>pyramidBlocks(0) == 0
     * <li>pyramidBlocks(1) == 1
     * <li>pyramidBlocks(2) == 5
     * 3==14
     * <li>pyramidBlocks(-2) == -5
		public void drawSquares(int howManySquares){
			for (int i =0; i< howManySquares; i++)
				System.out.print(" --  ");
				System.out.println();
			
			for (int i =0; i< howManySquares;i++)
				System.out.print("|" + howManySquares + " | ");
		}
		     * <li>sumOfDigits(129) == 12
     * <li>sumOfDigits(-12) == 3
     * <li>sumOfDigits(100) == 1
		*/
		
		
        public static int sumOfDigits(int num)
		{
			if(num >= 10){
				//return num;
				return (num%10) + sumOfDigits(num/10);
				}
			else if(num <= -10){
				return ((num%10) + sumOfDigits(num/10))*-1;
			}else{
				return num;
			}
			
		}
}
