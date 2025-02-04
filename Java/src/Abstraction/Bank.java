package Abstraction;

public interface Bank {
	
	void methodA();
	
	default void methodB() {
		
		System.out.println("inside default methodB of bank interface");
		
	
		}
		
	static void methodC() {
		
		System.out.println("inside static method c of bank interface");
	}
		
	}


