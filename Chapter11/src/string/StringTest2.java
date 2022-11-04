package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str1 = new String("java");
		String str2 = new String("android");
		
		System.out.println(System.identityHashCode(str1));
		
		/*str1 에 str2 를 붙여주는 함수 concat() */
		// 실제로 뒤에 붙이는 것이 아니라 새로운 메모리가 생성되고 거기에 붙여진 문자를 넣어주는 것 
		str1 = str1.concat(str2); 
		
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		
	}

}
