package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() { // 디폴트 생성자
		this("이름 없음" , 1); // this를 사용할때는 이 앞에 어떤 statement도 올 수 없다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { // 데이터 타입 -> Person (자기자신 클래스명)
		return this;
	} // 현재 인스턴스 주소값 반환
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); // this값 출력
	}

}


//생성자가 호출되는 시점은 인스턴스가 생성될 때 new 키워드를 쓰지 않는 한 생성자가 호출되지 않는데
//객체 내에서는 this를 이용하면 다른 생성자를 호출할 수 있다.
//생성자에서 다른 생성자를 호출할 때 this를 사용한다.
