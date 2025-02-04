package Constructor;

public class Employee2 {
	
	private String name;
	private int age;
	
	public Employee2(){
		
		System.out.println("Employee2 executed");
	}
	private void m1() {
		
		System.out.println(name+" : "+age);	
	}
	
	public void m2() {
		Employee2 e=new Employee2();
		e.name="gani";
		e.age=25;
		m1();
		System.out.println(e.name+" : "+e.age);	
	}
	public static void main(String[] args) {
		Employee2 e1=new Employee2();
		e1.m1();
		e1.m2();	
	}

}
