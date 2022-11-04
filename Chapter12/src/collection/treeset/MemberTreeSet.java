package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet <Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); // new Member() 적은 이유 : Comparator를 implements 해줬기 때문
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempID = member.getMemberID();
			if(memberID == tempID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
