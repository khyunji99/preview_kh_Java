package interfaceex;

public interface Calc { // interface에서 선언이 되면 다 추상 메서드가 된다. public abstract가 된다.
	
	// 아무런 키워드를 사용하지 않아도 public static final이 앞에 붙은것처럼 보이게 된다.
	// 즉, 그냥 double PI = 31.4; 로 적어도
	// public static final double PI = 3.14; 랑 같다.
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	/* 메서드 선언 */
	int add(int num1, int num2); // public abstract int add (int num1, int num2); 와 같은것으로 보이게 된다.
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	/* 디폴트 메서드 */
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	/* 정적 메서드 */
	static int total(int[] arr) {
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
		
		return total;
	}
	
}
// interface 에서는 상수와 추상 메서드가 선언된다.