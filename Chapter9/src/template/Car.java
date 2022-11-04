package template;
// 프레임 워크에서 많이 사용되는 설계 패턴
public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	/* 구현을 했지만 구현코드가 없는 것 (훅 메서드?)*/
	public void washCar() {} // 구현코드가 없지만
	                         // 필요에 의해 하위 클래스에서 재정의하여 사용하면
	                         // 구현이 추가가 된다. (final run 구현에 추가되어 실행결과값이 나온다.)
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	/* template method */
	public final void run() { // 얘네 시나리오는 항상 똑같다. 바뀌면 안된다. 그럴때 final 키워드를 사용한다.
		startCar();
		drive();
		wiper();
		stop();
		washCar(); // 실행해도 결과값으로 나오지 않음
		turnOff();
	}
}
// 각각 메서드에 대한 구현은 나름대로 할 수 있지만 run 시나리오는 변할 수 없다.
// 그럴 때 변할 수 없는 메서드에 final 키워드를 적어 선언하면
// 하위 클래스에서 그 메서드를 재정의 할 수 없다.
// 이러한 메서드를 템플릿 메서드라고 한다.
// 일련의 과정을 시나리오로 만들어 놓은 메서드라고 생각하면 된다.
// 근데 그 시나리오는 변경하면 안되기 때문에 final 키워드를 적어서 바꿀 수 없게 만들어 준다.
