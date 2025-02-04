package Polymorphism;



	class Test{
		
		void m1() {
			
			System.out.println("m1 method executed");
		}
		
		
	}
	
	public class OverRiding extends Test {
		
		void m1() {
			System.out.println("m2 method executed");
		}
		
		public static void main(String[] args) {
			
			OverRiding r=new OverRiding();
			r.m1();
		}
		
	}	
	

