package string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		// 문자 상수를 직접 가리키게되면 두개는 동일한 메모리를 가리킨다.
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
	}

}
