package practice;

public class Driver6 {
	
	String name;
	int age;
	
	
	public Driver6(String s,int n) {
		
		name=s;
		age=n;	
	}
	
	public Driver6(String d) {
		
		name=d;	
	}
	
	public static void main(String[] args) {
		
		Driver6 d1= new Driver6("Gani",25);
		
		System.out.println(d1.name);
		System.out.println(d1.age);
		
		Driver6 d2= new Driver6("Ashok");
		System.out.println(d2.name);
		System.out.println(d2.age);
		
	}

}
