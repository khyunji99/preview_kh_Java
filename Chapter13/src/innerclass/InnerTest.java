package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	/* instance innerclass(내부클래스) */
	// 인스턴스 내부클래스에서는 static 변수와 static 메서드는 사용할 수 없다.
	// 내부클래스는 일반적으로 외부클래스에서만 사용하니깐 private으로 적는게 맞다.
	
	private class InClass{
		int inNum = 200;
		//static int sInNum = 100; <= InClass 안에서 static 변수 선언 불가
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum); // static 변수와 메서드는 instance 생성과 상관 없이 호출할 수 있고 사용할 수 있다.
		}
	}	
	
	public void usingInTest() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//num += 10; <= OutClass에 있는 인스턴스 변수이기 때문에 사용불가
			sNum += 10; // <= sNum은 static변수이고 지금 Static 클래스에 있으니까 사용 가능 
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		static void sTest() { // 여기에선 정적변수만 가져다가 사용할 수 있다.
			System.out.println(sNum);
			//System.out.println(iNum); <= iNum 은 정적변수(static 변수)가 아니므로 사용 불가
			System.out.println(sInNum);
		}
	}
}


public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
		
		/*outClass.inClass.inTest();
		
		/* OutClass 레퍼런스가 이미 위에 있는 상태에서 이 문법을 쓸 수 있다.  
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
		*/
	}

}
