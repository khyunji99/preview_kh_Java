package reference;

public class Student {

	int studentID;
	String studentName;
	// 참조자료형 //
	Subject korea; // 선언
	Subject math;  // 선언 // 하지만 선언한다고 클래스가 생기는 것은 아님.
	
	
	// 각 과목에 대한 instance 생성 //
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		// 여기서 이름을 적어줌으로 아래의 메서드에서
        // String name 을 안적어도 된다.
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	// 메서드 //
	public void setKorea(int score) { // Korea 함수를 부르고 그안에서 자기가 가지고 있는 멤버변수의 setSubjectName에서 name을 넣으면 된다.
		korea.setScore(score);
	}
	
	public void setMath(int score) { // Math 함수를 부르고 그안에서 자기가 가지고 있는 멤버변수의 setSubjectName에서 name을 넣으면 된다.
		math.setScore(score);
	}
	
	/* 듣는 과목들의 총점을 여기에다 출력하고 싶다! */
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}

