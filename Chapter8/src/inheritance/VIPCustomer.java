package inheritance;

/* Customer 클래스의 속성과 거의 유사하다보니 Customer의 속성을 내가 가져다가 사용해야겠다!
   그럴 때 상속 방법 사용!! 
 */
public class VIPCustomer extends Customer{ // extends Customer 를 적으면 Customer의 클래스를 내가 가져다가 사용하겠다 라는 의미이다.

	/* 일반 고객에게는 필요없는 속성 : 할인비율 , 담당자 아이디 */
	double saleRatio; // 가격 할인 비율
	private int agentID; // 전담 담당자 아이디
	
	/*public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}*/
	
	
	/* 처음 가입했을 때 고객이 되는데 그때의 고객들의 등급은 실버 */
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		// super(); 는 상위클래스에서 디폴트 constructor를 호출하는 아이이므로 만일 상위클래스에 디폴트가 아닌 constructor가 있다면 super();는 오류가 난다.
		// 그런 경우에는 아래와 같이 매개변수를 적어주면 된다.
		super(customerID, customerName);  // Customer이란 상위클래스를 가리키는 참조자를 가지고 있는 키워드 // super(); 는 지금 ()안에 아무것도 없으므로 매개변수가 없는 것이다. 이런 경우는 상위클래스 Customer 클래스에서 디폴트 constructor를 호출하는 것이다.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
	//	System.out.println("VIPCustomer(int, String) 호출");
	}
	
	
	// 오버로딩 : 이름이 똑같은 메서드가 여러개 있는 것
	/* 메서드 오버라이딩 (똑같은 이름의, 같은 변환값에, 같은 매개변수를 가진 애를 재정리할 수 있다.) */
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * saleRatio);
	}
	
	
	
	// AgentID를 제공하겠다 그러면 set 메서드도 만들면 된다.
	public int getAgentID() {
		return agentID;
	}
	
	/*
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	*/
	
	// 등급에 따라 다르게 구현되는 메서드가 지금은 calcPrice 하나이지만 만일 등급에 따라 다르게
	// 구현되는 메서드가 여러개가 된다면 if- else 구문이 굉장히 많이 생성이 될것이다.
	// 이렇게 되면 그냥 잘못짠 프로그램이다.
	// 내가 클래스를 하나 만들었는데 거기에 if-else구문이 그 클래스 안에있는 메서드에 너무너무 많다.
	// 그러한 상황이 생길때에는 상속방법을 사용해야한다.
	/* 가격을 계산하는 메서드 */
	/* 이 메서드는 나중에 오버로딩할때 사용하자.
	 public int calcPrice(int price) {
	
		일반 고객과 vip 고객에 대한 두개의 메서드가 Customer라는 하나의 클래스 안에 다 들어있다.
		if (customerGrade == "SILVER") {
			bonusPoint += price * bonusRatio;
		}
		
		else if (customerGrade == "VIP") {
			
		}
		else if (customerGrade == "GOLD") {
			
		}
	
		return price;
	}
	*/
	
	/* 이것도 Customer 에 있는 것이므로 여기에 따로 또 적을 필요가 없다.
	// 고객의 정보를 보여주는 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	*/

	
	
}
