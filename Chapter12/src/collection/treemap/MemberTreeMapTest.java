package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member memberMin = new Member(7890, "민인홍");
		Member memberKim = new Member(248, "김태원");
		Member memberHan = new Member(654, "한창윤");
		
		memberTreeMap.addMember(memberMin);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberHan);
		
		
		// TreeMap 이라서 순서 정렬되어 출력
		memberTreeMap.showAllMember();
		
		//System.out.println();
		
		//memberTreeMap.removeMember(248);
		//memberTreeMap.showAllMember();
	}

}
