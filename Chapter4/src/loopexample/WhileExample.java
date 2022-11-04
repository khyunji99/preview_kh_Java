package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			
		  sum += num;
		  num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	    
		
		
		int num2 = 1;
		int multy = 1;
		
		while( num2 <= 5 ) {
			multy *= num2;
			num2++;
		}
		System.out.println("1부터 5까지의 곱은 " + multy + "입니다.");
		
	}

}
