package lambda;

@FunctionalInterface // 함수형 interface는 메서드를 하나만 선언할 수 있다.
public interface MyNumber { 

	int getMaxNumber(int num1, int num2);
}
