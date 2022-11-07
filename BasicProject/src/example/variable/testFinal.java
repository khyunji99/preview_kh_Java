package example.variable;

public class testFinal {

	public void testFinal() {
		// 상수 테스트
		int size; // 변수
		final int SIZE; // 상수
		
		size = 10;
		SIZE = 10;
		
		
		System.out.println("==== 값 변경 전 =====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
		
		// 변수의 값 변경
		size = 20;
		//SIZE = 20; // 상수는 초기화 후 다른 데이터 대입 불가
		
		System.out.println("==== 값 변경 후 =====");
		System.out.println("size : " + size);
		System.out.println("SIZE : " + SIZE);
	}
}
