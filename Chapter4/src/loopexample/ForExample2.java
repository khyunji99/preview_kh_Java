package loopexample;

public class ForExample2 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println("Hello, World");
		} // 컴퓨터에서는 이 구문을 더 선호한다. 1부터 시작하는 것보단 0부터 시작하는 것을 더 선호함. 컴퓨터는 0부터 시작하기 때문이다. 반복될 때 시작을 0부터 하는 것이 더 좋다.
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello, World");
		}
	}

}
