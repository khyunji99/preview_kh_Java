package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		
		if(treeMap.containsKey(memberID)) {
			
			treeMap.remove(memberID);
			return true;
			
		}
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
	}
	// containsKey 역할 : memberID 즉 Key 값에 대한 object가 hashMap 테이블 안에 있는지 확인

	public void showAllMember() {
		Iterator<Integer>ir = treeMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next(); // key를 하나씩 가지고 온다.
			
			Member member = treeMap.get(key);
			System.out.println(member);
		}
	}
	
}
