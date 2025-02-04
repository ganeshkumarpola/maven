package practice;

public class Driver {
	
	void printMethod(Student1 s) {
		
		System.out.println(s.id+" :  "+s.salary);
		
	}
	
	public static void main(String[] args) {
		
		Driver d=new Driver();
		
		Student1 s=new Student1();
		s.id=12345;
		s.salary=40000;
		
		d.printMethod(s);
	}
	
	

}
class Student1{
	
	int id;
	int salary;
	
}
