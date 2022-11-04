package inheritance;

public class GoldCustomer extends Customer{

	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	
	@Override // annotation(주석) : 컴파일러에게 아래의 메서드가 어떤 일을 하는지 알려주는 역할 (재정의 된것이다)
	public int calcPrice(int price) {
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}

	
}
