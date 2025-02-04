package practice;

public class Driver3 {
	
	public static void main(String[] args) {
		
		Driver3 d=new Driver3();
		College c = d.collegeGetData();
		
		System.out.println(c.id+"  "+c.name);
	}
	
	College collegeGetData() {
		
		College c=new College();
		c.id=101;
		c.name="Ganesh";
		return c;
	}
	class College{
		
		int id;
		String name;
	}
}
