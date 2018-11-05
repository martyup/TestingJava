public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("Passed name is: " + name);
	}
	public int getPuppyAge(){
		System.out.println("The puppy is: "+ puppyAge);
		return puppyAge;
	}
	
	public void setPuppyAge(int age){
		puppyAge=age;
	}
	public static void main(String []args){
		Puppy myPuppy = new Puppy("Tommy");
		
		myPuppy.setPuppyAge(2);
		
		myPuppy.getPuppyAge();
		
		System.out.println("variable value: " + myPuppy.puppyAge);
	}
}
