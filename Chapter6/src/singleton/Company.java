package singleton;

// static 응용 : singleton 패턴
// 인스턴스는 여러개가 생성될 수 있다. 하지만 어떤 프로그램을 하다 보면 그 프로그램 안에서 이 객체는 여러개이면 안되는 것이라면, 하나의 인스턴스만 만들어야 한다면 singleton 패턴을 사용한다. 
// 즉 인스턴스가 여러개 생성될 수 없을 때 singleton 패턴을 사용한다.  // singleton 패턴 : 객체가 단 하나만 생성되도록 하자.
public class Company {
	
	private static Company instance = new Company();  // private 을 적음으로써 외부에서 이 constructor를 호출하지 못한다. // 이 instance가 되는 얘는 단 한개로 생성이 되어있고 내부에서만 생성이 된다. 단 한개다
	
	private Company(){}

	/* 위에서 생성된 instance 객체를 외부에서 가져다가 사용할 수 있게 하는 것 */
	public static Company getInstance() { // static 을 적음으로 객체를 생성하지 않고 이 메서드를 사용할 수 있다.
		if(instance == null)
			instance = new Company();
		return instance;
	}
}

/* 위에 있는게 바로 singleton 패턴이다. */
// constructor 를 private 으로 한 다음 유일하게 생성되는 객체를 private으로 하나 만들어서 
// 그 객체를 가져갈 수 있는 public한 메서드를 static으로 제공해줘야 객체를 생성하지 않고
// 클래스 이름으로 참조해서 그 객체를 사용할 수 있다.