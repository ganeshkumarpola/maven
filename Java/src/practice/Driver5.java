package practice;

public class Driver5 {
	
	String name;
	int age;
	
	public Driver5(String s,int a) {
		
		name=s;
		age=a;
		//System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Driver5 d=new Driver5("Ganesh",25);
		
		System.out.println("age : "+d.age+"name : "+d.name);
		
	}

}
