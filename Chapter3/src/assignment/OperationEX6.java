package assignment;

public class OperationEX6 {

	public static void main(String[] args) {

		int num1 = 5; //00000101
		int num2 = 10;//00001010
		
		int result = num1 & num2; //00000000
		System.out.println(result);
		
		result = num1 | num2; //00001111
		System.out.println(result);
		
		
		
		
		int num3 = 5; // 00000101;
		System.out.println(num3 << 1); //00001010
		System.out.println(num3 << 2); //00010100
		System.out.println(num3 << 3); //00101000
		System.out.println(num3);
		
		System.out.println(num3 <<= 1); //00001010
		System.out.println(num3); //00001010;
		
		
		num3 = 5;
		System.out.println(num3 >> 1); // 00000010;
		
		
		
	}

}
