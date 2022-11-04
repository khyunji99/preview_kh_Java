package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		//int[][] arr = new int[2][3];
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length); // arr.length(배열의 길이)는 행의 전체 길이를 의미한다. 
		System.out.println(arr[0].length); // arr[0].length는 0번째 행인 1차원 element의 길이를 의미한다
		System.out.println(arr[1].length); // arr[1].length는 1번째 행인 1차원 element의 길이를 의미한다
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) { // i : 행
			for(int j = 0; j < arr[i].length; j++) { // j : 열
				System.out.println(arr[i][j]); // 0,0 ~ 0,2 + 1,0 ~ 1,2
			}
		}
		
		
		char[][]alphabets = new char[13][2];
		
	}

}
/* 다차원 배열 : 2차원 이상의 배열 ex.) 지도, 게임 등 평면이나 공간을 구현할 때 많이 사용된다. */
// 이차원 배열의 선언과 구조 ; 자료형 [][]배열이름 = new 자료형 [행 개수][열 개수];
// 예시 : int [][]arr = new int [2][3]; //