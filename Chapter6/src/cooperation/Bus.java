package cooperation;

public class Bus {
	
	/* 버스의 속성 */
	int busNumber;
	int passengerCount;
	int money;
	
	/* 버스를 생성하는 constructor */
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
    /* 승객을 태울 때 승객이 낸 돈에 대한 메서드 */
	public void take(int money) {  // take 는 승객 한명을 호출하는 메서드
		this.money += money;
		passengerCount++;
	}

	/* 버스 정보를 보여주는 메서드 */
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은"
				+ money + "입니다.");
	}
	
}

