package inheritance;

import java.util.ArrayList;

// 클래스가 하나의 파일 안에 여러개가 들어갈 수 있다.
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
}



public class AnimalTest {

	public static void main(String[] args) { // 세개의 인스턴스 생성

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		/* 배열을 사용하는 방법 */
		//Animal[] animalList = new Animal[3];
		//animalList[0] = new Human();
		//animalList[1] = new Tiger();
		//animalList[2] = new Eagle();
		
		/*다음과 같이도 배열을 적을 수 있다 */
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Human());
		animals.add(new Tiger());
		animals.add(new Eagle());
	}
	
	// 매개변수를 Animal animal 로 하면
    // 위에서 Human 을 받을 수 있다.
    // Animal animal = new Human();
    // 이렇게 매개변수로 받게 하는거나 위의 코드나 같은것이다.
	public void moveAnimal(Animal animal) {
		
		animal.move(); // 코드는 이거 한줄인데 이 코드에 대한 결과는 3개나 된다.
		               // (다양한 결과가 나온다) => 다형성
		
	}
	

}
