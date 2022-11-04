package aaa;

public class FunctionTest {

	public static void main(String[] args) {
       int num1 = 10;
       int num2 = 30; //num1 과 num2는 main 함수에서 선언한 변수
       
       int sum = addNum(num1, num2); // 함수를 부름, sum 부분에 아래의 result 값이 들어간다.
       //System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
       System.out.println(sum);
	}

	
	public static int addNum(int n1, int n2) { //int addNum(int n1,int n2) 이 부분을 우리는 함수선언 이라고 한다. 반환데이터 타입,함수이름,매개변수 이 부분들이 함수를 선언하는 부분이다. 
		int result = n1 + n2; // n1 자리에 i1도 적어도 되고 꼭 num1이랑 일치시킬 필요가 없다. n1,n2는 addNum 이라는 함수에서 선언된 변수 -> n1,n2의 역할 : 위의 num1,num2의 값을 복사해서 받는 역할일 뿐
		return result;
	}//public static ~ 여기까지가 함수를 정의한다 라고 할 수 있다.
	
/*	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;	
	}*/
	
}
