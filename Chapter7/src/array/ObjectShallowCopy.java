package array;

public class ObjectShallowCopy {

	public static void main(String[] args) {
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
				
		/* 배열 복사 */
		// bookArray1 의 0번째부터 3개를 복사해서 bookArray2의 0번에서부터 넣는다.
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); //이것 자체로 출력문이다. // 출력문으로 메서드를 만들었기 때문에 println 으로 적지 않아도 된다.
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i =0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=============");
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}


// 객체 복사를 할때 이런 경우가 있다. 나는 분명히 값을 복사했다고 했는데 값이 복사된것이 아니고
// 결국은 뭐냐면 값이 복사가 된것이 아니고 주소가 복사된 것이다.
// 이것을 얕은 복사 라고 한다.
// 내가 복사하려는 배열의 일부분을 바꾼다면 복사된 값에서도 똑같이 변경된 것으로 복사가 된다.
// 즉, 두 배열이 같은 인스턴스를 가리키고 있는 것이다. (같은 주소를 가리키고 있다.)
