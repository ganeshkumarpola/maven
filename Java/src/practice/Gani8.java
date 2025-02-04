package practice;

public class Gani8 {
	
	boolean check(int age) {
		
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Gani8 ga=new Gani8();
		boolean k = ga.check(17);
		System.out.println("elegible for vote   ::   "+k);
	}

}
