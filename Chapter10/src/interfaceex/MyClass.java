package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

	
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
		
		/* MyClass 를 X의 interface 타입에 제공 */
		X xClass = myClass;
		xClass.x(); // xClass 변수가 사용할 수 있는건 x 메서드밖에 없다.
		// Class 인스턴스가 생성이 되었다고 해도 그 인스턴스가 어떤 타입에 
		// 대입이 되었는지에 따라 사용할 수 있는 메서드는 한정적일 수 있다.
	}
}
