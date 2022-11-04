package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] strArr = {"Java", "Android", "C"};
		
		//for(int i =0; i<strArr.length; i++) {
			//System.out.println(strArr[i]);
		//}
		//우리가 평소에 사용하는 for문
	
		
		for(String s : strArr) {
			System.out.println(s);
		} // 향상된 for 문 = 배열 요소의 처음부터 끝까지 모든 요소를 참조할 때 사용하면 편리함.
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) { // num = arr[i];
			System.out.println(num);
		}
    }
}
