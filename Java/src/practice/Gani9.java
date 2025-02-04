package practice;

public class Gani9 {
	
	void gani() {
		System.out.println("hi ra");
	}
	static int kumar(int a,int b) {
		
		int c=a+b;
		return c;
		
		
	}
	
	public static void main(String[] args) {
		
		Gani9 ga=new Gani9();
		ga.gani();
		int k = Gani9.kumar(30, 80);
		System.out.println(k);
	}

}
