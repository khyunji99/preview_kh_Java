package witharraylist;

public class VIPCustomer extends Customer{ // extends Customer 를 적으면 Customer의 클래스를 내가 가져다가 사용하겠다 라는 의미이다.

	
	double saleRatio; 
	private int agentID; 
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	//	System.out.println("VIPCustomer() 생성자 호출");
	}
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
	//	System.out.println("VIPCustomer(int, String) 호출");
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * saleRatio);
	}
	
	
	public int getAgentID() {
		return agentID;
	}


	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다."; // 상위클래스의 정보를 불러오는 것
	}
	
	
	
}
