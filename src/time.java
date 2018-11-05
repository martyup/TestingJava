
public class time {
	public static void main(String[]args){
		timeClass timeObject= new timeClass();
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toRegular());
		timeObject.setTime(13, 24, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toRegular());
		
	}

}
