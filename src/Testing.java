public class Testing {

   public static void main(String args[]) {
      int a, b;
      a = 10;
     
      //variable x = (expression) ? value if true : value if false
      
      //a!=1, så blir false aka 30
      b = (a == 1) ? 20: 30;
      System.out.println( "Value of b is : " +  b );

    //a=10, så blir true aka 20
      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );
      
      
      
      String name = "James";

      // following will return true since name is type of String
      
      //( Object reference variable ) instanceof  (class/interface type)
      boolean result = name instanceof String;
      System.out.println( result );
      
      
      for(int x =0; x<30; x++){
    	  System.out.print(x + ", ");
      }
      System.out.print("\n");
      int numbers[] = {10, 20, 30, 40};
      
      for(int x: numbers){
    	  System.out.print(x+", ");
      }

      System.out.print("\n");      
      String [] names ={"James", "Tommy", "Larry", "Jerry"};
      for (String x: names){
    	  System.out.print(x+", ");
      }
      int length = names.length;
      System.out.println(" there are "+names.length+" names in the arrey");
   }
}
