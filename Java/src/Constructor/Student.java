package Constructor;

public class Student {
	
	//parameterrazed constructor
	
	String name;
	int age;
	public Student(String n, int a ) {
		
		name=n;
		age=a;
			
	}
	
	public static void main(String[] args) {
		
		Student s=new Student("ganesh",20);
		System.out.println(s.name+"  :  "+s.age);
		
	}

}
