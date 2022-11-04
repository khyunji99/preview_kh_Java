package array;

public class BookArray {

	public static void main(String[] args) {
		/* 객체자료형 */
		Book[] library = new Book[5]; // 이건 나중에 만들어질 책의 주소의 자리 5개를 만들어준것뿐 책을 5권 생성한것이 아니다.
		                              // Book 은 따로 하나씩 인스턴스 생성해서 넣어줘야 한다.
		
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i<library.length; i++) {
			library[i].showBookInfo(); // return 타입이 void 라서 바로 출력문으로 만들어준것.
		}
		
	}

}

/* 기본자료형 */
// int[] arr = new int[5]; // 얘는 intger 사이즈가 4바이트고 4바이트 짜리가 5개가 만들어진다. 이게 정해져 있는 것이다.
                        // 그래서 총 4 x 5 = 20바이트가 만들어진다.
