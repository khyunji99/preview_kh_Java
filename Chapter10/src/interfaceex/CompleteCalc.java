package interfaceex;
/* 구현 상속 */
public class CompleteCalc extends Calculator { // extends 다음에는 하나의 클래스밖에 못온다고 했다.
	                                           // 자바에서는 즉 하나만 상속 받을 수 있게 한다.

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		
		return ERROR;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override
	public void description() {
		System.out.println("완벽한 계산기 입니다.");
		
	}
	
	
	
	
}
// 자바에서 class extends 는 구현 상속 이라고 한다.