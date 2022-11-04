package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		/* int numbers[] = new int[10]; <= 이렇게 적을수도 있다. */
		
		/* 초기화 : 배열의 값을 처음 놓는 것 */ // 초기화 할 때 new int [ ] 이 [ ] 블럭 안에 숫자를 적으면 안된다.
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10}; // [ ] 옆에 내가 놓고 싶은 값들을 { } 안에 나열한다.
				
				
		for(int i = 0; i<numbers.length; i++) {  // length = 초기화한 메모리 개수
			System.out.println(numbers[i]);
		}
		
		
	}

}

// Array 배열에서는 fix length 이고 연속된 자료구조들이다. 즉, 중간에 빈 메모리가 있을 수 없다
// int, double, char 형 배열은 기본형 배열이라고 한다.
// 이것과 다른 배열은 객체 배열 이라고 한다.