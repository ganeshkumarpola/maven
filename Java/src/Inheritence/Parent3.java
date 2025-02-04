package Inheritence;

public class Parent3 {
	
	void m1() {
		System.out.println("parent m1 executed");
	}
	void m2() {
		System.out.println("parent m2 is executed");
	}
}
	
	class Child3 extends Parent3{
		
		void m1() {
			System.out.println("child m1 is executed");
			super.m1();
		}
		
		void m2() {
			System.out.println("child m2 is executed");
		}
	}



class Test{
	
	public static void main(String[] args) {
		
		Child3 p= new Child3();
		p.m1();
		p.m2();
		System.out.println(p.hashCode());
	}
}
