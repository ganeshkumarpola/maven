package Polymorphism;

public class Overloding {
	
	void m1(int i,int j) {
		
		System.out.println(i+j);
	}
	
	void m1(int i,int j,int k) {
		
		System.out.println(i+j+k);
	}
	
	public static void main(String[] args) {
		
		Overloding o= new Overloding();
		o.m1(10, 20);
		o.m1(10, 20,30);
	}

}
