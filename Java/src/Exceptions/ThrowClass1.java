package Exceptions;

public class ThrowClass1 {

	public static void main(String[] args) {
		
		int age=19;
		
		try {
		if(age>18) {
			
			throw new Exception();
			
			
		}
		}catch(Exception e) {
			
			
			System.out.println("he is a eligible for vote");
		}
		
		if(age<18) {
		System.out.println("he is not eligible for vote");
		}
	}

}
