package abstractex;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}


}
// 이미 상위 클래스 Computer 클래스에 구현되어 있는 turnOn 메서드를
// 하위 클래스 DeskTop 클래스에서 재구현 하고 싶다면 재구현(재정의) 할 수 있다.
// 이걸 오버라이딩 이라고 한다.
