package superkeyword;

public class ClassB extends ClassA{
	
	int a=12;
	
	void methodX() {
		
		System.out.println("child method  executed");
	}
	
	void mehtodY() {
		
		super.methodX();
	}

}
