package practice;

public class Student {
	
	
	void javaMethod(int id,int age) {
		
		System.out.println("id is : "+id +     "age is "+age);
	}
	
	public static void main(String[] args) {
		
		Student st=new Student(); 
		st.javaMethod(123, 25);
		
	}

}
