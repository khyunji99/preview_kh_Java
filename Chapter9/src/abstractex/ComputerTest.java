package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
	
		// Computer 는 abstract 클래스 즉 추상 클래스 이므로 인스턴스화 할 수 없다.
		// Computer c1 = new Computer();
		// c1.display(); // 수행이 되려면 수행되어야 할 메서드가 있어야 하는데 abstract 클래스
		              // Computer 클래스에는 없다.
		              // 따라서 abstract 클래스는 생성 될 수 없다.
		Computer c2 = new DeskTop(); // DeskTop은 상위클래스 타입인 Computer로
		                             // 생성할 수 있다. (상속관계와 같음)
		// Computer c3 = new NoteBook(); // NoteBook 클래스도 abstract 클래스이므로
		                              // 생성 될 수 없다.
		
		Computer c4 = new MyNoteBook(); // Computer->NoteBook->MyNoteBook
		                                // 위와같은 상속 관계이므로
		                                // NoteBook c4 = new MyNoteBook();
		                                // 으로 적을 수도 있다.
		c2.display();
		c4.display();
		// c2.display(); 는 Computer 클래스에 있는 display 가 불리는 것이 아니라
		// c2.display(); 는 DeskTop 클래스에 구현 되어 있는 display 가
		// c4.display(); 는 NoteBook 클래스에 구현 되어 있는 display가 불려져 수행된다.
		
	}

}
// 변수의 타입에 따라간다.