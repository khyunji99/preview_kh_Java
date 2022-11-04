package inheritance;

// 하위 클래스가 생성이 될땐 항상 상위 클래스가 먼저 생성이 된다.
public class CustomerTest1 {

	public static void main(String[] args) {

	/*	Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
	*/	
		
		// Customer customerKim = new VIPCustomer(10101, "Kim"); // 얘는 아래의 식과 동일하다.
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
		// customerKim.setCustomerID(10101);
		// customerKim.setCustomerName("Kim");
		
		customerKim.bonusPoint = 1000;
		
	//	System.out.println(customerLee.showCustomerInfo());
	//	System.out.println(customerKim.showCustomerInfo());
	
	}

}

// 하위 클래스가 생성이 될 때 상위클래스가 먼저 생성이된다.
// 하위클래스가 상위클래스의 타입을 내포하고 있기 때문에
// VIPCustomer customerKim = new VIPCustomer(); 라고 적는 것 대신
// Customer customerKim = new VIPCustomer(); 로 적어도 된다.
// 이런것을 상위 클래스로의 묵시적 형변환 (업캐스팅)이라고 한다.
// 디파일 컴파일을 하면 상위클래스가 어느 클래스인지 등의 정보들이 들어 있다.