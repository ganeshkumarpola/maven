package thisconstructorcalling;

public class ClassA {
	
	ClassA(){
		
		this(3);
		System.out.println("zero is called");
	}
	
	ClassA(int a){
		
		this(5,6);
		System.out.println("single parameter is called");
	}
	ClassA(int a,int b){
		
		System.out.println("double parameter is called");
	}

}
