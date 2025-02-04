package Inheritence;

public class Child1 extends Parent1 {
		String collegename;
		
	public static void main(String[] args) {
		
		Child1 c =new Child1();
		c.name="Ganesh";
		c.num=9885;
		c.collegename="SV.university";
		
		System.out.println(c.name+" : "+c.num+" : "+c.collegename);

	}

}
