package ifexample;

public class IfExample1 {

	public static void main(String[] args) {

		int age = 15;
		
		if(age >=8 ) {
			System.out.println("학교에 다닙니다.");
			System.out.println("test");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("=====================================");
		
	   if(age<=13) {
		   System.out.println("초등학교에 다닙니다.");
	   }
	   else if(age<=16) {
		   System.out.println("중학교에 다닙니다.");
	   }
	   else if(age<=19) {
		   System.out.println("고등학교에 다닙니다.");
	   }
	   else {
		   System.out.println("학교에 다니지 않습니다.");
	   }
		
	}
}

       