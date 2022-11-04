package loopexample;

public class NestedLoopWhileExample {

	public static void main(String[] args) {

		int dan = 2;
		int times = 1;
		
		while( dan <= 9 ) {
			if ( (dan % 2)!=0) {
				dan++;
				continue;
		    }
			times = 1; // 여기에 times = 1; 을 적어줘야 단이 증가 되었을 때 다시 times가 1로 초기화 되어 곱해질 수 있다.
			while( times<=9 ) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}
}
