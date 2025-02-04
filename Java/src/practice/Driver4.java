package practice;

public class Driver4 {
	
	public static void main(String[] args) {
		
		Driver4 d= new Driver4();
		Person p = d.getData(101);
		
		System.out.println(p.id+" - "+p.name+" - "+p.age);
	}
	
	Person getData(int id) {
		Person p=new Person();
		
		if(id==101) {
			
			p.id=101;
			p.name="Gani";
			p.age=25;
			
		}else if(id==201) {
			
			p.id=201;
			p.name="Kumar";
			p.age=26;
		}
		
		return p;
	}
	class Person{
		
		int id;
		String name;
		int age;
	}

}
