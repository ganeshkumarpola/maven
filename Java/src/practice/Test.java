package practice;

public class Test {

	public static void main(String[] args) {
		
		Account ac=new Account();
		ac.setName("Gani");
		ac.setAccountNum(12345);
		
		String name = ac.getName();
		int adf =ac.getAccountNum();
		
		System.out.println(name+" : "+adf);

	}

}
