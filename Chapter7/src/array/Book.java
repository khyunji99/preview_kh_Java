package array;

public class Book {
	
	/* Book 클래스의 속성 */
	private String bookName;
	private String author;
	// 객체
	
	/* constructor */
	public Book() {} // 디폴트 constructor
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	
	/* private 변수들을 위한 Get, Set 메서드 */
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	/* 정보를 나타내주는, 멤버변수 bookName과 author를 나타내주는 메서드 */
	public void showBookInfo() {
		System.out.println(bookName + "," + author );
	}

}
