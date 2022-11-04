package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConcatImp1 sImp1 = new StringConcatImp1();
		sImp1.makeString("hello", "java");
		
		/* 란다식 */
		StringConcat concat = (s1, s2)->System.out.println(s1 + " " + s2); // 구현부
		concat.makeString("hello", "java");
		
		/* 익명 내부 클래스 */
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}

}
