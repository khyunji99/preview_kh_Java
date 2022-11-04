package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum()); // static 변수를 참조할 때 클래스 이름을 참조를 해줘야 경고가 안생긴다. 
		

		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum()); // student가 생성될때마다 ID를 임의로 다 부여하는 것이 아니라 생성 될때마다 자동으로 부여가 되었으면 좋겠다.
		                                             // 그럴때 사용해야 하는 것이 공유값 static변수 이다.
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
	}
}