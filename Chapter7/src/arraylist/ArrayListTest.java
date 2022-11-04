package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		 
		ArrayList<String> list = new ArrayList<String>(); // ArrayList에서 String 타입을 쓰려고 한다는걸 의미
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		// 위에 있는 for 문과 같은 의미의 아래의 for문이다.
		/* for (int i; i<list.size(); i++) {
		 System.out.println(list.get(i));  <= 여기서 list[i] 이렇게는 적으면 안된다.
		 }*/                                  //ArrayList에선 인덱스 연산자를 제공하지 않기 때문이다.
	}

}

// ArrayList 클래스 : 자바에서 제공되는 객체 배열이 구현된 클래스, 여러 메서드와 속성 등을 사용하여
//                  객체 배열을 편리하게 관리할 수 있다. (가장 많이 사용하는 객체 배열 클래스)

// ArrayList 클래스 주요 메서드 
// boolean add(E e) : 요소 하나를 배열에 추가한다. E는 요소의 자료형을 의미함.
// int size() : 배열에 추가된 요소 전체 개수를 반환한다.
// E get(int index) : 배열의 index 위치에 있는 요소 값을 반환한다.
// E remove(int index) : 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환한다.
// boolean isEmpty() : 배열이 비어있는지 확인한다.

// 요소를 추가하거나 제거 할 때 각 내부에서 코드가 모두 구현되어 있으므로 배열을 직접 선언하여
// 사용하는 것보다 편리함.

// java help 보면 메서드들을 볼 수 있다.