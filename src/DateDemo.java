import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date using toString()
      System.out.println(date.toString());
      
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
      
      // display time and date
      String str = String.format("Current Date/Time : %tc", date );

      System.out.printf(str+"\n");
      
      
      // display time and date
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
      
      System.out.printf("\n%s %tB %<te, %<tY", "Due date:", date);
      
      
      
      SimpleDateFormat fto = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input = args.length == 0 ? "1818-11-11" : args[0]; 

      System.out.print("\n"+ input + " Parses as "); 
      Date t;
      try {
         t = fto.parse(input); 
         System.out.println(t); 
      } catch (ParseException e) { 
         System.out.println("Unparseable using " + fto); 
      }
   }
}