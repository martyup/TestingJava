
public class Test2 {
	
	
	
	private String girlName;
	
	public void setName(String name){
		girlName = name;
	}

	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first bestfriend was %s", girlName);
	}
}
