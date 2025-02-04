package Exceptions;

public class ThrowClass2 {

	public static void main(String[] args) {
		
		int age=20;
		
		try {
		if(age>18) {
			
			throw new Exception("he is eligible for the vote");
		}
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		if(age<18) {
			
			System.out.println("he is not eligible for vote");
		}
	}

}
