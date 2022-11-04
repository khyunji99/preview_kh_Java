package hiding;

// 하난의 패키지 안에 클래스 두개 있을 수 있다. 하지만 public class는 하나뿐. 
// 가능한 하나의 패키지에는 하나의 클래스만 있게 만든다.


// 모든 멤버변수를 private으로 할 필요는 없다.
// 하지만 필요한 경우 이 변수가 오픈되어서 아무렇게나 쓰이는 경우에
// 데이타 무결성에 문제가 생길 수 있다. 이 클래스에 반드시 오류가 생길 수 있다. 라고 한다면
// 그럴 때는 반드시 private을 사용해야한다. 그리고 getter, setter를 제공해서 그 값을
// 가져가거나 저장할 수 있게 한다.

class BirthDay {
	
	private int day;
	private int month;
	private int year;
	
	// 메서드 //
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day >28) {
				System.out.println("날짜 오류입니다.");
			}	
		}
		else { 
		      this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}


/* public 클래스는 하나여야한다. public class 의 이름은 파일 이름과 동일해야한다. */
public class BirthDayTest {
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		
		day.setMonth(2);
		day.setYear(2018);
		day.setDay(30);
	}
	
}
