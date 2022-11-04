package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberMin = new Member(248, "민인홍");
		Member memberKim = new Member(7890, "김태원");
		Member memberHan = new Member(654, "한창윤");
		
		memberHashMap.addMember(memberMin);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHan);
		
		
		// HashMap 이라서 순서 상관없이 출력
		memberHashMap.showAllMember();
		
		System.out.println();
		
		memberHashMap.removeMember(248);
		memberHashMap.showAllMember();
	}

}
