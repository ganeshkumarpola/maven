package Encapsulstion;

public class PersonOutPut {
	
	public static void main(String[] args) {
		
		Person p =new Person();
		 p.setFname("Pola");
		 p.setLname("Ganesh");
		 p.setAge(25);
		 p.setPhno(9885292289L);
		 p.setCity("hyd");
		 p.setState("AP");
		 p.setCountry("India");
		 
		String fn = p.getFname();
		String ln = p.getLname();
		int ag = p.getAge();
		Long ph = p.getPhno();
		String ci = p.getCity();
		String st = p.getState();
		String co = p.getCountry();
		
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(ag);
		System.out.println(ph);
		System.out.println(ci);
		System.out.println(st);
		System.out.println(co);
		
	}
	
	
	
	

}
