package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("코스모스");
		shelfQueue.enQueue("셰익스피어");
		shelfQueue.enQueue("장발장");
		
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}

}
