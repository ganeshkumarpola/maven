package practice;

public class Driver1 {
	
	void printMethod(Employee e) {
		
		System.out.println("name : "+e.name+"  "+"age : "+e.age+"  "+"salary : "+e.salary);
	}
	
	public static void main(String[] args) {
		
		Driver1 d=new Driver1();
		Employee e=new Employee();
		e.name="Ganesh";
		e.age=25;
		e.salary=25000;
		
		d.printMethod(e);
	}
}
class Employee{
	
	String name;
	int  age;
	int  salary;
	
}
