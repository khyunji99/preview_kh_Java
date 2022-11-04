package interfaceex;
/* 타입 상속 */
public abstract class Calculator implements Calc { // 다 구현하지 않아서 추상 메서드를 갖게 된다. 즉, abstract를 붙인다.
	                                               // implements 뒤에는 여러개의 클래스가 와도 상관 없다. (여러개를 상속 받을 수 있다.)
	                                               // interface는 구현 코드를 가지고 있지 않기 때문에
	                                               // 타입만 상속받기 때문이다.
	
	/* add, sub, mul, div 중 add와 sub 만 일부 구현됨 */
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	

	
}
// 자바에서 interface implements 는 타입 상속 이라고 한다.