package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer= customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		/* 가상 메서드 */
		// 아래는 다 customer 에서의 order 가 불린다.
		customer.order();
		buyer.order();
		seller.order();
	}

}
