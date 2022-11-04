package abstractex;

public abstract class NoteBook extends Computer{

	@Override
	public void display() { // display와 typing 두개의 추상 메서드 중 하나만 구현함.
		System.out.println("NoteBook display()");
	}

	
	
}
