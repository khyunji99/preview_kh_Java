package example.variable;

public class testCasting {

	public void testCasting() {
		// 형변환 테스트
		boolean bool = true;
		// bool = 1; // boolean은 형변환 불가
		
		// char->int : 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		// char에 정수값 저장 가능 (숫자에 해당하는 유니코드 문자)
		char ch = 66;
		System.out.println("ch : " + ch);
		// ch = -66; // ch에 음수 대입은 불가능
		
		// int->char : 강제 형변환
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
	}
	
	
	public void testCasting2() {
		//int와 long의 연산
		int inum = 4;
		long lnum = 8L;
		
		//1. int형으로 결과값 (강제 형변환)
		int isum = (int)(inum + lnum);
		isum = inum + (int)lnum; // 위의 isum과 같음
		System.out.println("isum : " + isum);
		
		//2. long 결과 (자동 형변환)
		long lsum = inum + lnum;
		System.out.println("lsum : " + lsum);
		
		
		// byte, short의 연산 결과 : int형 //
		byte bnum = 1;
		short snum = 2;
		
		int sum1 = bnum + snum;
		System.out.println("sum1 : " + sum1);
		
		// byte or short의 결과값을 얻기 위해 강제 형변환 해줘야 한다.
		short sum2 = (short)(bnum + snum);
		System.out.println("sum2 : " + sum2);
		
	}
	
	
	
	public void testDataLoss() {
		// 데이터 손실 테스트
		
		// 정수->실수 : 자동 형변환
		long lnum = 100;
		float fnum = lnum;
		System.out.println("fnum : " + fnum);
		
		// 실수->정수 : 강제 형변환
		// 소수점 이하를 절삭하기 때문에 데이터 손실
		double dnum = 10.5;
		int inum = (int)dnum;
		System.out.println("inum : " + inum);
		
		
		
		// 강제 형변환으로 인해 예상치 못한 데이터 손실 발생에 주의
		int num = 290;
		System.out.println("num : " + num);
		
		byte bnum = (byte)num;
		System.out.println("bnum : " + bnum);
		
	}
	
	
}
