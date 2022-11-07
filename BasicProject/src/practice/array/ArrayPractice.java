package practice.array;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void method1() {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수 입력 : ");
		int odd = sc.nextInt();
		int[] arr = new int[odd];
		
		// 증가하는 for문
		for(int i = 0; i <= (arr.length / 2); i++) {
			arr[i] = i+1;
		}
		// 감소하는 for문
		for(int i = (arr.length / 2) + 1; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		// 배열 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수 입력: ");
		int[] arr = new int[sc.nextInt()];
		
		// 증가하는 for문
		int num = 1;
		for(int i = 0; i < arr.length / 2; i++) {
			arr[i] = num++;
			System.out.print(arr[i] + " ");
		}
		// 감소하는 for문
		for(int i = arr.length/2; i < arr.length; i++) {
			arr[i] = num--;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void method2() {
		/*
		Scanner sc = new Scanner(System.in);
		int size = 0;
		String str[] = new String[size];
		
		System.out.print("배열의 크기 입력: ");
		size = sc.nextInt(str.length);
		
		System.out.print("1번째 문자열 : ");
		String str1 = sc.nextLine();
		System.out.print("2번째 문자열 : ");
		String str2 = sc.nextLine();
		
		System.out.println("값을 더 입력하시겠습니까? (Y/N): " + );
		while(true) {
		if(sc.next().charAt(0) == 'N' || sc.next().charAt(0) =='n') {
			break;
		}
		else {
			System.out.print("추가할 개수: ");
			size = sc.nextInt();
		}
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력: ");
		String[] strArr = new String[sc.nextInt()];
		
		// 각각의 인덱스에 들어갈 값을 입력 받을 것이다.
		// 지금 현재는 nextInt(); 로 숫자를 입력을 받고 그 뒤에 엔터값이
		// buffer 버퍼 안에 남아있기 때문에 
		// 버퍼를 다음과 같이 한번 비워줘야 한다.
		sc.nextLine();
		
		// 사용자가 입력한 배열 크기만큼의 문자열 입력
		for(int i = 0; i< strArr.length; i++) {
			System.out.print(i+1 + "번째 문자열: ");
			strArr[i] = sc.nextLine();
		}
		
		// 더 값을 입력할 것인지 아닌지 판단하면서 무한반복
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까? (Y/N): ");
			String select = sc.nextLine();
			
			// 더 입력하겠다고 한 경우
			// 대소문자가 입력되는 상황을 커버할 수 있도록 
			// toUpperCase 메서드 사용하여
			// 소문자 y가 입력되던 대문자 Y가 입력되던 모두 다 대문자 Y로 만들어버리고
			// 그 결과값이 대문자 Y와 같은지 확인
			if(select.toUpperCase().equals("Y")) {
				System.out.print("추가할 개수: ");
				int add = sc.nextInt();
				String[] newArr = new String[strArr.length + add];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				sc.nextLine(); // 버퍼안에 남아있는 엔터값 지우기
				
				for(int i = strArr.length; i < newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				
				// 공통적으로 strArr이라는 배열을 출력해주기 위해
				// strArr 참조형 변수에 newArr 새로운 배열의 주소값을 넣어준다.
				// 즉, 새롭게 만든 newArr을 strArr이 참조하게 만든 뒤
				// 나중에 N을 선택했을 때 strArr을 출력하게 만든것
				strArr = newArr;
				
			}else if(select.toUpperCase().equals("N")) {
				//System.out.println(Arrays.toString(strArr));
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
