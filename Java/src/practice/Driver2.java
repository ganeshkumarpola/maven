package practice;

public class Driver2 {
	public static void main(String[] args) {
		
		Driver2 d=new Driver2();
		person p = d.getMethod();
		System.out.println(p.id+" -- "+p.name+" -- "+p.age);
	}
	person getMethod() {
		
		person p=new person();
		p.id=210;
		p.name="Ganesh";
		p.age=25;
		
		return p;
	}
	
	class person{
		
		int id;
		String name;
		int age;
	}

}
