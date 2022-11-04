package cooperation;

public class Taxi {

	
	int TaxiNumber;
	int PassengerCount;
	int money;
	
	public Taxi(int TaxiNumber) {
		this.TaxiNumber = TaxiNumber; 
	}
	
	public void take(int money) {
		this.money += money;
		PassengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시" + TaxiNumber + "의 승객은" + PassengerCount + "명이고, 수입은" + money + "입니다.");
	}
}
