package Inheritence;

public class Child2 extends Parent2{
	
	String Collegename;
	
	public Child2() {
		
		System.out.println("child constructor executed");
	}
	
	void m2() {
		
		
		System.out.println("m2 method executed : ");
		
		
	}

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		
//		c.m1();
//		c.m2();
		
		c.name="Ganesh";
		c.phno=638383;
		c.Collegename="SV univesity";
		
		System.out.println(c.name);
		System.out.println(c.phno);
		System.out.println(c.Collegename);
		
		
		

	}

}
