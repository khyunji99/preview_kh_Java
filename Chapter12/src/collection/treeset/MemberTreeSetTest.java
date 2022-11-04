package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
	
		MemberTreeSet memberHashSet = new MemberTreeSet();
		
		Member memberGil = new Member(1014, "길현지");
		Member memberKwon = new Member(902, "권예지");
		Member memberKim = new Member(1126, "김기연");
		
		memberHashSet.addMember(memberGil);
		memberHashSet.addMember(memberKwon);
		memberHashSet.addMember(memberKim);
		
		memberHashSet.showAll();
		
		
	}

}
