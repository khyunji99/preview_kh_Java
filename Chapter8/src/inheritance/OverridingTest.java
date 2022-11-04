package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(100010, "Lee");
		int price = customerLee.calcPrice(10000);
		//System.out.println(customerLee.showCustomerInfo());
		System.out.println("지불 금액은 " + price + "이고, " + customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer(100011, "Kim", 100);
		price = customerKim.calcPrice(10000);
		//System.out.println(customerKim.showCustomerInfo());
		System.out.println("지불 금액은 " + price + "이고, " + customerKim.showCustomerInfo());
		
		
		// VIPCustomer 로 생성하고 Customer 타입으로 대입함 -> 이런 경우에는 참조변수가 참조할 수 있는 내용은 타입꺼만 참조할 수 있다. 즉, Customer꺼만 참조할 수 있다. // 
		// 얘는 과연 불리는 메서드가 무엇이냐? VIPCustomer 메서드가 불린다.
		// 참조는 Customer꺼로 참조하고 불리는 것은 VIPCustomer 메서드가 불린다.
		Customer customerWho = new VIPCustomer(100012, "Who", 101);
		price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());		
		
		
		Customer customerGold = new GoldCustomer();
		
		
		
	} // VIP 고객은 지불한 가격이 1% 할인된 가격인 9천원을 지불한다는 것을 알 수 있다.

}
