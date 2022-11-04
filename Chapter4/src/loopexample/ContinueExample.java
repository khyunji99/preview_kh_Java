package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num<=100; num++) {
			
			if( (num % 2) == 1) {
				continue;
			} // 2로 나누었을 때의 나머지가 1인 것이니 홀수를 의미한다. 따라서 홀수들만 다 더하는 것을 의미
			total += num;
		}
		System.out.println(total);
		
		
		
		
		for(num = 1; num <=50; num++) {
			if( (num % 2) == 0) {
				continue;
			}
			total *= num;
		}
		System.out.println("1부터 50까지 짝수의 곱은 " +total+ "입니다.");
		
	}

}
