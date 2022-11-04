package inheritance;

// 가시성이 제일 작은 것 : private 
// 그 다음으로 패키지 안에서만 볼 수 있는 것 : 디폴트
// 패키지가 달라도 하위클래스 상위클래스 각각끼리는 서로 볼 수 있는 것 : protected
// 모두가 다 볼 수 있는 것 : public
public class Customer /*(extends Object)*/ {

	// private하면서 상속관계에서는 가져다가 사용할 수 있게 하기 위해
	// protected 키워드를 사용한것
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; 
	protected double bonusRatio; // 포인트비율 // protected 키워드를 붙이지 않으면 접근제어자가 명시가 안되고 명시가 되지 않으면 디폴트라고 한다. 디폴트는 같은 패키지 내에서만 보인다. 
	/* 일반 고객에게는 필요없는 속성 : 할인비율 , 담당자 아이디 */
	/*
	 private int saleRatio; // 가격 할인 비율
	private int agenID; // 전담 담당자 아이디
	*/
	
	
	/* 처음 가입했을 때 고객이 되는데 그때의 고객들의 등급은 실버 */
	
	public Customer()
	{
		super(); // Customer 클래스는 object 라는 클래스에서 상속을 받았다. 
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출");
	}
	
	
	/* Customer가 생성 될때는 무조건 customerID와 customerName을 매개변수로 받겠다. 라는 의미 */
	// 이 constructor를 사용하려면 하위클래스에서 super(매개변수); 를 명시적으로 적어줘야 상위클래스를 하위클래스에서 사용할 수 있다.
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	//	System.out.println("Customer(int, String) 호출");
	}
	
	
	// 등급에 따라 다르게 구현되는 메서드가 지금은 calcPrice 하나이지만 만일 등급에 따라 다르게
	// 구현되는 메서드가 여러개가 된다면 if- else 구문이 굉장히 많이 생성이 될것이다.
	// 이렇게 되면 그냥 잘못짠 프로그램이다.
	// 내가 클래스를 하나 만들었는데 거기에 if-else구문이 그 클래스 안에있는 메서드에 너무너무 많다.
	// 그러한 상황이 생길때에는 상속방법을 사용해야한다.
	/* 가격을 계산하는 메서드 */
	public int calcPrice(int price) {
		/* 일반 고객과 vip 고객에 대한 두개의 메서드가 Customer라는 하나의 클래스 안에 다 들어있다. */
		
			bonusPoint += price * bonusRatio;
		
		/*
		else if (customerGrade == "VIP") {
			
		}
		else if (customerGrade == "GOLD") {
			
		}
		*/
		return price;
	}
	/* 고객의 정보를 보여주는 메서드 */
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
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

	
	
}
