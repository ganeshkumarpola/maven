package Constructor;

public class Employee1 {
	
	//using this keyword in constructor
	
	String name;
	double salary;
	
	public Employee1(String name,int salary) {
		
		this.name=name;
		this.salary=salary;
		
		System.out.println(this.name+"   :  "+this.salary);	
	}
	
	public static void main(String[] args) {
		
		Employee1 e=new Employee1("Ganesh",250000);
	}

}
