package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	
	// 학생을 한명 생성할 때, constructor 가 하나도 없으면 컴파일러가 알아서
	// 디폴트 constructor를 생성해준다
	// 그런데 나는 이 학생을 생성할 때 constructor에 매개변수를 받겠다
	// 학생의 이름과 돈을얼마나 가지고 있는지 를 알아야겠다!
	// 이게 있어야 학생을 생성 할 수 있다 그러면 아래와 같이 constructor를 만들어야 한다.
	// 디폴트 constructor는 안된다.
	
	public Student(String studentName, int money) {
		this.studentName = studentName;  // 왼쪽 파란 studentName 은 멤버변수, 오른쪽 노란 studentName은 지역변수
		this.money = money;
	}
	// 버스를 탈건데 어떤 버스를 탈건지 매개변수로 받아줘야 한다. / 객체의 협업이 일어나는 부분 / 버스라는 객체를 받아서 버스 객체의 메서드를 호출함으로써 학생 클래스가 아닌 다른 클래스 (버스 클래스)에 영향을 주는 것 // 
	public void takeBus(Bus bus) { // Bus 는 객체이다
		bus.take(1000);  // bus 하고 . 을 하면 뒤에 bus가 쓸수 있는 멤버변수와 메서드가 나온다.
		money -= 1000;
	}
	/* 객체의 협업이 일어나는 부분 */
	public void takeSubway(Subway subway) { // 위에 버스도 그렇고 ( ) 안에는 생성된 매개변수가 들어가야 한다.
		subway.take(1500);
		money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(20000);
		money -= 20000;
	}
	
	
	/* 정보를 보여주는 메서드 */
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
	
}

