package practice;

public class Car1 {
	
	public Car1() {
		
		System.out.println("car1 is executed");
		
		
	}
	
	private void m1() {
		
		System.out.println("m1 method executed");
	}
	
	public void m2() {
		
		m1();
	}

}
