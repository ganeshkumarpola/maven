package wrapperclasses;

public class UnWrapping_ObjectTConvertToPrimitiveDataType {

	public static void main(String[] args) {
		
		Short shot=new Short((short) 5);
		short convert = shot.shortValue();
		
		System.out.println(convert);

	}

}
