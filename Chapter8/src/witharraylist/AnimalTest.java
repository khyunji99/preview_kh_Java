package witharraylist;

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
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	
	public void flying() {
		System.out.println("하늘을 날아갑니다.");
	}
}



public class AnimalTest {

	public static void main(String[] args) { // 세개의 인스턴스 생성

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		
	}
	
	// 나는 tiger의 속성을 사용하고 싶은데 
    // Animal 타입이라서 부를수가 없다.
    // 이럴때 다시 원래 타입으로 돌아가면 된다.
    // 그것이 바로 다운 캐스팅이라고 한다.
	public void moveAnimal(Animal animal) {
		
		animal.move(); 
		/* 아래와 같이 다운캐스팅을 하면 죽는다 = 에러가 난다 
		Human human = (Human)animal;
		human.readBook();
		*/
		
		
		/*다운캐스팅 instanceof*/
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		// 실행하게 되면 위의 move도 불려지고 각각의 메서드가 따로 따로 불려서 출력된다.
		
	}
	

}

// 상속 관계에서 해결할 수 있으면 오버라이딩을 사용하여 해결하는 것이 더 좋다.
// 오버라이딩으로 해결이 안된다 그러면 다운캐스팅으로 해결하기
