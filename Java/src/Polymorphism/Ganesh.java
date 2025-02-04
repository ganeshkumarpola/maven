package Polymorphism;


class Ashok{
	
	void Unicon() {
		System.out.println("ashok is executed");
	}
}

public class Ganesh extends Ashok {
	
	void Unicon(){
		
		System.out.println("ganesh is executed");
	}
	
	public static void main(String[] args) {
		
		Ganesh g=new Ganesh();
		g.Unicon();
		
		
	}

}
