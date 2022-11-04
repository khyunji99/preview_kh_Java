package cooperation;

public class Subway {

	/* 지하철의 속성 */
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은" + passengerCount + "명이고, 수입은"
				+ money + "입니다.");
	}

	}

