public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      //disse to er helt like^
      for (double x: myList){
    	  System.out.println(x);
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
        //total = total +myList
    	 // System.out.println(i+ ", "+total);
    	  total += myList[i];
      }
      System.out.println("Total is " + total);
      
      int pluss = 0;
      for (int i = 0; i < 8; i++) {
        //total = total +myList
    	  System.out.println(i+ ", "+pluss);
    	  pluss += i;
      }
      System.out.println("Total is " + pluss);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  
   }
}