package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
	
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberGil = new Member(902, "길현지");
		Member memberKwon = new Member(1014, "권예지");
		Member memberKim = new Member(1126, "김기연");
		
		memberHashSet.addMember(memberGil);
		memberHashSet.addMember(memberKwon);
		memberHashSet.addMember(memberKim);
		
		memberHashSet.showAll();
		
		/* memberID 는 고유한 값이므로 이미 존재하는 ID와
		   동일한 ID 를 가지고 있는 사람이 추가 되었을 때 그 사람은 들어가면 안된다.
		   근데 지금 아래를 출력해보면 추가가 되어 출력이 된다.
		 */
		Member memberKim2 = new Member(902, "김유신");
		memberHashSet.addMember(memberKim2);
		
		memberHashSet.showAll();
	}

}
