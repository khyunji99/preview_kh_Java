package practice.variable;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		// 문제 1 : 초기화 및 값 변경
		
		int inum = 100;
		double dnum = 234.567;
		char ch = 'A';
		String str = "Hellow World";
		boolean bool = true;
		
		System.out.println("초기화 후 : " + inum + ", " + dnum + ", " 
		                     + ch + ", " + str + ", " + bool);
		
		inum = 10000;
		dnum = 567.123456789; // float 형의 유효자리수 7자리
		ch = 'B';
		str = "Welcome to JAVA";
		bool = false;
		
		System.out.println("값 변경 후 : " + inum + ", " + dnum + ", "
				             + ch + ", " + str + ", " + bool);
		
	}
	
	
	public void method2() {
		// 문제 2 : 원의 둘레와 면적 구하기
		/*
		int rd = 5;
		float circle;
		circle = 2 * rd * 3.14f;
		float area;
		area = rd * rd * 3.14f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요: ");
		rd = sc.nextInt();
		
		System.out.println("반지름: " + rd);
		System.out.println("반지름이 " + rd + "인 원의 둘레: " + circle);
		System.out.println("반지름이 " + rd + "인 원의 면적: " + area);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름 입력: ");
		int rad = sc.nextInt();
		double pi = 3.14;
		
		//System.out.println("반지름이 " + rad + "인 원의 둘레 : " + 2 * rad * pi);
		//System.out.println("반지름이 " + rad + "인 원의 넓이 : " + rad * rad * pi);
		
		// 소수점 아래 한자리까지
		System.out.printf("반지름이 %d인 원의 둘레 : %.1f\n", rad, 2*rad*pi);
		System.out.printf("반지름이 %d인 원의 면적 : %.1f\n", rad, rad*rad*pi);
		
	}
	
	
	public void method3() {
		// 문제 3 : 학생들의 키(실수)의 평균(정수) 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 학생의 키 입력 : ");
		double height1 = sc.nextDouble();
		System.out.print("두 번째 학생의 키 입력 : ");
		double height2 = sc.nextDouble();
		System.out.print("세 번째 학생의 키 입력 : ");
		double height3 = sc.nextDouble();
		
		int avg = (int)(height1 + height2 + height3)/3;
		
		System.out.println("키의 평균 : " + avg);
		
		
		/*
		System.out.println("첫번째 학생의 키 입력: ");
		float height1 = sc.nextFloat();
		System.out.println("두번째 학생의 키 입력: ");
		float height2 = sc.nextFloat();
		System.out.println("세번째 학생의 키 입력: ");
		float height3 = sc.nextFloat();
		
		System.out.printf("키의 평균: %d\n", (int)(height1 + height2 + height3)/3 );
		*/
		
	}
	
	
	public void method4() {
		// 문제 4 : 문자열 입력받아 각각의 문자의 유니코드 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char str0 = str.charAt(0);
		int inum0 = str0;
		System.out.printf("%c : %d\n ", str0, inum0);
		
		char str1 = str.charAt(1);
		int inum1 = str1;
		System.out.printf("%c : %d\n ", str1, inum1);
		
		char str2 = str.charAt(2);
		int inum2 = str2;
		System.out.printf("%c : %d\n", str2, inum2);
		
		char str3 = str.charAt(3);
		int inum3 = str3;
		System.out.printf("%c : %d\n ", str3, inum3);
		
		char str4 = str.charAt(4);
		int inum4 = str4;
		System.out.printf("%c : %d\n ", str4, inum4);
		
		
		/* 한번에 출력하는 방법 */
		System.out.println(str.charAt(0) + " : " + (int)str.charAt(0));
		System.out.println(str.charAt(1) + " : " + (int)str.charAt(1));
		System.out.println(str.charAt(2) + " : " + (int)str.charAt(2));
		System.out.println(str.charAt(3) + " : " + (int)str.charAt(3));
		System.out.println(str.charAt(4) + " : " + (int)str.charAt(4));
		
	}
	
	
	
}
