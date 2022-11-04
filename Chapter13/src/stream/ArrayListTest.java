package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		// sList 의 element들을 하나씩 꺼내서 변수 s에 대입한다음 그 변수 s를 출력한다.
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		
		/*
		for(String s : sList) {
			System.out.println(s);
		
		}
		*/
		
	}
}
