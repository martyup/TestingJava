// DebugDemo.java
// D. Thiebaut
// CSC212
import java.util.ArrayList;
import java.util.Iterator;

class Pair {
        public String name;
        public int age;
        Pair( String f, int s ) { name=f; age=s; }
        public String toString() { return name+"("+age+") "; }
}

public class DebugDemo {
        
        
        public static void main(String[] args) {
                ArrayList<Pair> A = new ArrayList<Pair>();
                int increment = 3;
                
                A.add( new Pair( "Alice", 10 ) );
                A.add( new Pair( "Bob", 7 ) );
                
                Iterator<Pair> it = A.iterator();
                while ( it.hasNext() ) {
                        Pair p = it.next();
                        p.age += increment;
                }
                
                for ( int i=0; i<3; i++ ) {
                        Pair p = A.get(  i );
                        System.out.println( A.get( i ) );
                }
        }

}