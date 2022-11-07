package practice.conditional;

import java.util.Scanner;

public class ConditionalPractice {
	
	public void method1() {
		// 문제 1 : if문 두개의 정수의 짝홀 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		/*
		if((num1 % 2 == 0) && (num2 % 2 == 0)) { // 두 수 모두 짝수인 경우
			System.out.println("두 수 모두 짝수입니다.");
		}else if ((num1 % 2 == 1) && (num2 % 2 == 1)) { // 두 수 모두 홀수인 경우
			System.out.println("두 수 모두 홀수입니다.");
		}else {
			System.out.println("하나는 홀수이고 하나는 짝수입니다.");
		}
		*/
		
		String result = "";
		if((num1 % 2 == 0)&&(num2 % 2 ==0)) {
			result = "두 수 모두 짝수이다.";
		}else if((num1 % 2 == 0)||(num2 % 2 == 0)) {
			result = "하나는 홀수이고 하나는 짝수이다.";
		}else {
			result = "두 수 모두 홀수이다.";
		}
		System.out.println(result);
		
	}
	
	
	public void method2() {
		// 문제 2 : 두 정수와 연산자 입력 받아 연산 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산 기호 입력: ");
		char op = sc.next().charAt(0);
		/*
		if(op == '+') {
			System.out.println("수행 결과: " + (num1 + num2));
		}
		else if(op == '-') {
			System.out.println("수행 결과: " + (num1 - num2));
		}
		else if(op == '*') {
			System.out.println("수행 결과 :" + (num1 * num2));
		}
		else if(op == '/') {
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 결과 값 : 0");
			}else {
				System.out.println("수행 결과: "+ (num1 / num2));
			}
		}
		else if(op == '%') {
			System.out.println("수행 결과: "+ (num1 % num2));
		}
		else {
			System.out.println("입력하신 연산은 없습니다. 프로그램 종료합니다.");
		}
		*/
		
		int result = 0;
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
			return; // return을 하면 이 메서드가 종료된다. 이 아래에 있는 코드는 진행하지 않게 된다.
			// break; 라고 적게 되면 이 아래에 있는 수행코드까지 프린트가 되기때문에
			// 그러면 안되고 이 메서드가 종료되어야 하기에 return을 적어준다.
		}
		System.out.println("수행 결과 : "+ num1 + " " +op + " " +num2 +  " = " + result );
		
	}
	

}
