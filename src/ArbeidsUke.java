
public class ArbeidsUke {
	  public static void main(String []args){
		    //setter verdiene
		    double timerPerDag = 7.5;
		    int arbeidsdagerIUken = 5;
		    
		    //regner ut det totale antall arbeidstimer i uken
		    double timerIUken = timerPerDag*arbeidsdagerIUken;
		    
		    //skriver ut resultatet
		    System.out.println(timerPerDag + " arbeidstimer, " + 
		    arbeidsdagerIUken + " dager i uken blir " + 
		    timerIUken + " timer i uken.");

	  }
}
