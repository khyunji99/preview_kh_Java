package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		boolean b1 = set.add("aaa");
		System.out.println(b1);
		
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set); // 순서대로 나오지 x
		
		/* b2인 "aaa"가 안들어갔음을 의미 : 이미 앞에서 같은 "aaa"가 있기 때문에 안들어감 */
		// 중복 허용 x
		boolean b2 = set.add("aaa");
		System.out.println(b2); // false 값 출력
		
		System.out.println(set);
	}

}
