package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // 여기서 this. 을 붙이지 않으면 같은 값을 의미하기에 꼭 this. 을 붙여줘야 한다.
	}
	
	public void printThis() {
		System.out.println(this); // 현재 자기 인스턴스의 주소값
	}
}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday(); // 이것의 인스턴스와 아래의 인스턴스는 다른 것이다. 다른 주소값을 가진다.
		Birthday b2 = new Birthday();
		
		System.out.println(b1); // b1.printThis(); 의 값과 같다. (출력)
		b1.printThis(); // b1의 this 값
		
		System.out.println(b2);
		b2.printThis();
	}

}
