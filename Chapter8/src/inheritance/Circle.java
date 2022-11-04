package inheritance;

public class Circle { // 한 점과 써클의 관계는 상속의 관계가 아니다. point 이 점을 사용하고 싶다면 Point를 함수 안에 선언하라.

	Point point; // Point 선언 <= 합성 방법 (has - a 관계 라고도 한다) 
	
	/*private int x;  // <= 앞에서 Point 선언했기에 안적어도 된다.
	private int y;*/
	
	private int radius;
	
	public Circle() {
		point = new Point(); 
	}
}
// 상속을 배우다 보면 오해하는 것이 있다. 상속은 이미 있는 클래스를 무조건 가져다 쓰는거다! 그런게 아니다.
// 객체지향에서 상속을 올바르게 사용하는 것은 일반적인, 좀 더 보편적인 클래스들이 정의가 되어있고 
// 그렇게 만들어져있는 클래스에서 내가 그 기능을 그대로 가져다가 쓰면서 좀 더 그것보다 구체적인 클래스를
// 만들 때 상속을 사용하는 것이다.