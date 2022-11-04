package reference;

public class Circle {
	
	Point point; // 선언 // 다른 클래스를 가져다가 사용하는 것이다.
	int radius;
		
	
	// constructor에서 참조 객체를 생성을 한다.
	public Circle() {
		point = new Point();
	}
}