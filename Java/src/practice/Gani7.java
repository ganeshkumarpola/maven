package practice;

public class Gani7 {
	
	String fullName(String fname,String sname) {
		
		String name=fname+sname;
		
		return name;
		
	}
	
	public static void main(String[] args) {
		
		Gani7 ga=new Gani7();
		String k = ga.fullName("Ganesh", "Kumar");
		System.out.println("Name   ::  "+k);
	}

}
