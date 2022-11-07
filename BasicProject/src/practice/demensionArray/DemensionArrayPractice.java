package practice.demensionArray;

import java.util.Scanner;

public class DemensionArrayPractice {

	public void method1() {
	
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 입력: ");
		int columm = sc.nextInt();
		
		int num = 97;
		char alphabet = (char)num;
		
		for(int i = 0; i < columm; i++) {
			System.out.print(i + "행의 열의 크기 입력: ");
			int irow = sc.nextInt();
			char arr[][] = new char[columm][irow];
			for(int j = 0; j < irow; j++) {
				arr[i][j] = alphabet++;
				
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}*/
		
		
		// 가변배열 초기화 및 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기 입력: ");
		char[][] arr = new char[sc.nextInt()][];
		
		// 열 할당
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i +"행의 열의 크기 입력: ");
			arr[i] = new char[sc.nextInt()];
		}
		
		// 초기화와 출력
		char ch = 'a';
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public void method2() {
		/*
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		char arr[][] = new char[5][5];
		System.out.print("행 인덱스 입력 >>  ");
		int columm = sc.nextInt();
		System.out.print("열 인덱스 입력 >>  ");
		int row = sc.nextInt();
		
		if((columm < 0 || columm > 4) || (row < 0 || row >4)) {
			break;
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {

				if(arr[i][j] == arr[columm][row]) {
					arr[columm][row] = 'X';
				}else {
					
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		}
		System.out.println("프로그램을 종료합니다.");*/
		
		
		//교수님이 하신 것
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][5];
		int row;
		int columm;
		
		while(true) {
			System.out.print("행 인덱스 입력 >> ");
			row = sc.nextInt();
			System.out.print("열 인덱스 입력 >> ");
			columm = sc.nextInt();
			
			if(row < 0 || row > 4 || columm < 0 || columm > 4 ) {
				break;
			}
			arr[row][columm] = 'X';
			System.out.println("\t0\t1\t2\t3\t4");  // tap을 이용해서 깔끔하게 출력
			
			// 출력
			for(int i = 0; i <arr.length; i++ ) {
				System.out.print(i + "\t");
				for(int j = 0; j <arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println(); // 개행
			}
			System.out.println(); // 개행
		}
		System.out.println("프로그램을 종료합니다. ");
		
	}
	
	
}
	

