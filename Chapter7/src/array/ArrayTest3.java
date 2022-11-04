package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		/* 문자배열 */
		char[] alphabets = new char[26];
		char ch = 'A'; //65
		
		for(int i = 0; i<alphabets.length; i++, ch++) { // ch 값이 계속 증가한 것들을 다 더한걸 구하고 싶다
			alphabets[i] = ch;
		}
		
		for(int i = 0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
	}

}
