package staticex;

public class Student {
	
	// static + 자료형 + 변수이름; / static 변수 정의 : 여러개의 인스턴스가 같은 메모리의 값을 공유하기 위해 사용
	private static int serialNum = 10000;  // 기준값이 10000이다.
	                                       // serialNum 변수를 private으로 했기 때문에 변경할 수는 없고 가져가서 사용할수만 있다.
	int studentID;
	String studentName;
	
	/* constructor */
	public Student() {
		serialNum++;
		studentID = serialNum;  // serialNum 은 공유되는 값이다.
	}

	public static int getSerialNum() { // static 메서드에서는 인스턴스 변수를 쓸 수 없다. 
		int i = 10; // i : 지역변수 <- 지역변수는 메서드가 호출되면 생성이된다. 그리고 메서드가 끝나면 없어지기때문에 static 메서드에서 지역변수 사용해도 된다. /
		
		i++;
		System.out.println(i);
		
	   //studentName = "홍길동"; // studentName : 멤버변수, 인스턴스변수 는 인스턴스가 new 키워드로 생성이 된다. 근데 new 라는 키워드가 없으니 static메서드에서 인스턴스 변수를 사용하게 되면 생성되지도 않은 인스턴스 변수에 "홍길동"을 넣게 되어버리는 것이다. 이러한 위험이, 문제가 생기지 않으려면 static 메서드에서는 인스턴스 변수를 사용하면 안된다. 
		
		return serialNum; // serialNum : static 변수, 클래스 변수 / static 메서드에서 static 변수는 당연히 사용해도 된다.
	}

}

// 인스턴스 : 클래스에서 생성된 각각의 객체 / 그 각각의 인스턴스가 생성되면 각각의 메모리를 갖게 된다
// 각각의 인스턴스들이 공유해야하는 값이 생길 수 있다. 이때 그 공유해야하는 값을 static 변수(정적변수)로 선언해야한다.
// static 변수가 생성되면 메모리를 따로 쓰는데 그 메모리를 Data 영역, 상수영역, 정적 영역이라고 한다. (힙 메모리 x)
// new 키워드를 쓰면 인스턴스 변수들이 할당을 받는데 그러면 static 변수는 어떨 때 할당을 받느냐?
// 전체 프로그램이 메모리에 load 될때 데이터 영역의 메모리에 생성된다, 할당 받는다
// 상수, 리터럴, static 변수 등이 그 메모리에 같이 있다.
// 인스턴스의 생성과 관계없이 클래스 이름으로 직접 참조한다, 인스턴스 생성 관계없이 사용 가능
// 변수 특징은 메모리와 관계가 되어있다. 
// 인스턴스가 생성될때마다 쓰는 동적 메모리 = 힙 메모리
// (메서드가 호출될 때 그 메서드 안에 있는 변수)지역변수가 쓰는 메모리 = 스택 메모리
// static 이나 리터럴이 생성되는 영역 = 데이터 영역
// static 변수 = 클래스 변수