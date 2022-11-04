package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	/* Equals 재정의 */
	@Override
	public boolean equals(Object obj) {
		/* 다운 캐스팅 */
		if(obj instanceof Student) {
			Student student = (Student)obj;
			
			if(studentID == student.studentID)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID; // Equals를 재정의할 때 쓰인 멤버변수들을 가져다가 만들면 된다. 
	}
	
}


public class EqualsTest {

	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		/* str1 과 str2의 address 가 같은지 물어보는 출력문 */
		System.out.println(str1 == str2); // false
		
		/* str1 과 str2의 문자열이 같은지 물어보는 출력문 */
		System.out.println(str1.equals(str2)); // true
		
		
		System.out.println("==================");
		
		Student student1 = new Student(10001, "Tomas");
		Student student2 = new Student(10001, "Tomas");
		
		System.out.println(student1 == student2); // false
		System.out.println(student1.equals(student2)); //false
		
		System.out.println("==================");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println("==================");
		// str1 과 str2를 서로 생성을 다르게 했으니 힙 address가 다를텐데 왜 hashCode 출력값이 같을까?
		// hashCode가 재정의 되어 있기 때문이다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("==================");
		// str1과 str2의 실제 힙 메모리 address 값 출력 System.identityHashCode() 사용
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}

}