package abstractex;

public abstract class Computer { // 추상 클래스

	/* 구현을 안하고 메서드를 선언만한것
	public void display();
	public void typing();
	*/
	
	/* abstract 적어주면 구현부가 없을것이다 라는 것을 의미한다. */
	/* 추상 메서드 : 하위 클래스가 각자 알아서 구현해야 될 메서드 */
	public abstract void display();
	public abstract void typing();
	
	// 두개의 인티저를 받아서 그 결과인 합을 반환하는 메서드
	//public abstract int add(int x, int y);
	// public int add(int x, int y) {return x+y;} 이거랑 같은 것이다.
	
	
	/* 구현하는 메서드 (공통 메서드) */
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

// 추상 클래스인 상위 클래스에 public abstract void display();와 
// public abstract void typing();를 적은 이유는
// 이 Computer 클래스에서는 전원을 켜고 끄는 기능에 대해서는 구현이 가능하지만
// 실제로 display 하고 typing 하는 것은 Computer 클래스에서 구현을 할 수가 없고
// 각각 이를 상속받은 DeskTop과 NoteBook 하위 클래스에서 어떻게 해야할지를 구체적으로
// 구현을 해야할 때 상속 클래스에서는 저렇게 추상 메서드로 적는다. 즉, 어떻게 구현을 해야할지 모르는 것
// Computer 클래스를 DeskTop이 상속을 받게 되면 저 추상적인 메서드들에 대한 구현에 대한 책임이
// 있다고 한다.
// Computer 클래스 입장에서는 저 추상적인 메서드들을 하위 클래스에게 위임시켰다 라고 얘기한다.