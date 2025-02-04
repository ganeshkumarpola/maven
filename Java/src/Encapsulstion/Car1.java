package Encapsulstion;

public class Car1 {

	public static void main(String[] args) {
		
		Car cr=new Car();
		
		cr.setCost(800000);
		cr.setColor("red");
		cr.setModel("swift");
		
		System.out.println("the cost car is "+cr.getCost());
		System.out.println("the cost color is"+cr.getColor());
		System.out.println("the cost model is"+cr.getModel());

	}

}
