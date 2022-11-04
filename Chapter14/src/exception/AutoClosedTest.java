package exception;

public class AutoClosedTest {

	public static void main(String[] args) {
		
		
		try(AutoClosedObj obj = new AutoClosedObj()){
			throw new Exception(); // Exception 강제로 시키는 것
		}catch(Exception e) {
			System.out.println("exception");
		}
	}

}
