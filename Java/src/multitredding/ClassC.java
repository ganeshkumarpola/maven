package multitredding;


class ClassA extends Thread{
	
	public void run() {
		
		for(int i=1; i<10; i++) {
			
			System.out.println("hii");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
		}
	}
	
}
class ClassB extends Thread{
	
	public void run() {
		
		for(int i=1; i<10; i++) {
			
			System.out.println("hello");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}


public class ClassC {
	
	public static void main(String[] args) {
		
		ClassA c1=new ClassA();
		c1.start();
		ClassB c2=new ClassB();
		c2.start();
	}

}
