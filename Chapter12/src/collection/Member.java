package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {


	private int memberID;
	private String memberName;
	
	/*디폴트 constructor*/
	public Member() {}
	
	/* constructor 생성 */
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public int hashCode() { 
		return memberID; // 아래 equals에서 memberID가 같으면 그 memberID를 반환해줌
	}

	/* 이미 존재하는 memberID와 새로 추가된 obj의 memberID가 동일한지 비교 */
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Member) {
			Member member = (Member)obj; // obj가 Object로 넘어왔으니 Member로 다운 캐스팅 해줘야 함.
			
			if(this.memberID == member.memberID) { // memberID가 같으면 같은 사람
				return true;
			}
			else
				return false;
		}
		return false;
	}


	/* 정보 출력 */
	public String toString() {
		
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}


	@Override
	public int compareTo(Member member) { // member : 넘어온 매개변수
		
		return (this.memberID - member.memberID); // 양수->오름차순
		// return (this.memberID - member.memberID) *(-1) -> 음수 -> 내림차순
		// this.memberID : 나의 아이디, member.memberID : 넘어온 매개변수의 아이디
		// this.memberID - member.memberID 가 양수가 되면 오름차순으로
		// 음수가 되면 내림차순으로 정렬되는 tree가 만들어진다.
		
		// 이름으로 비교해서 출력하고 싶다
		// return (this.memberName.compareTo(member.memberName)) -> 이름 오름차순
		// return (this.memberName.compareTo(member.memberName))*(-1) -> 이름 내림차순
	}


	@Override
	public int compare(Member member1, Member member2) { //member1 : 나, member2 : 넘어온 매개변수
		return (member1.memberID - member2.memberID);
	}
	

}
