package classpart;

public class StudentTest {

	public static void main(String[] args) { // main 메서드
/*		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();*/
		
		
		Student studentLee = new Student(100, "이순신"); // 이렇게 new 를 적는게 생성한다는 것을 말한다.
		//studentLee.studentName = "이순신";
		//studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
			
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
			
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee); // @ 뒤에 나오는 아이가 힙 메모리의 주소값이다. 즉, 인스턴스가 생성되는 힙 메모리 주소 = 참조값 이다.
		System.out.println(studentKim);
	}
}
