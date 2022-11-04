package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		
		// CompleteCalc calc = new CompleteCalc(); 또는
		// Calculator calc = new CompleteCalc(); 로도 쓸 수 있다.
		
		Calc calc = new CompleteCalc(); // 타입 상속을 받은 것, Client code = interface를 기반으로 구현된 instance 클래스를 가져다가 사용하는 코드 
		// calc.add(num1, num2); // CompleteCalc 클래스에 구현된 add가 불려오는 것
		// calc. + Calc 타입에 종속되어 그 타입에 선언된 메서드들만 호출
		
		// 추상 클래스 이기 때문에 얘네는 사용가능하지 않다.
		//Calc calc1 = new Calc();
		//Calc calc2 = new Calculator();
		
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
	}

}
// 타입 상속, 구현 상속 둘다 상속이다.