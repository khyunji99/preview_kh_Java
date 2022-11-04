package assignment;

public class OperationEX4 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 +10) < 10) && ((i = i+2) > 10) );
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		int num2 = 10;
		
		
		value = ( ((num2 = num2 +10) > 10) && ((i = i+2) > 10) );
		System.out.println(value);
		System.out.println(num2);
		System.out.println(i);
		
		int num3 = 10;
		int ii =2;
		
		value = ( ((num3 = num3 +10) > 10) || ((ii = ii+2) > 10) );
		System.out.println(value);
		System.out.println(num3);
		System.out.println(ii);
		
		int num4 = 10;
		
		value = ( ((num4 = num4 +10) < 10) || ((ii = ii+2) > 10) );
		System.out.println(value);
		System.out.println(num4);
		System.out.println(ii);
		
		
	}

}
