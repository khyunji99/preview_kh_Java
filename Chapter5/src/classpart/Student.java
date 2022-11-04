package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student() {} // : 디폴트 생성자
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	} // 생성자
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	} //학생의 정보를 출력해주는 메서드
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
/*	public static void main(String[] args) {// main 함수이지만 메서드는 아니다. 클래스 안에서 사용하지만 이 클래스의 메서드는 아니다. 얘는 JVM이 불러준다. Java virtual machine 이 main 함수를 호출해서 그 main 함수 부분이 먼저 수행이 되도록 해준다.  
		Student studentLee = new Student(); // 여기서 studentLee 를 참조변수라고 한다.
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student(); // 객체 타입(참조형 타입), 메서드나 속성, property 들을 정의할 수 있다. new 를 적음으로 생성해서 사용한다. 여기서 studentLee 를 참조형 변수라고 한다.
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
   }*/
	

}