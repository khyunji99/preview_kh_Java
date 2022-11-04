package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		
		if(hashMap.containsKey(memberID)) {
			
			hashMap.remove(memberID);
			return true;
			
		}
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
	}
	// containsKey 역할 : memberID 즉 Key 값에 대한 object가 hashMap 테이블 안에 있는지 확인

	public void showAllMember() {
		Iterator<Integer>ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next(); // key를 하나씩 가지고 온다.
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
}
