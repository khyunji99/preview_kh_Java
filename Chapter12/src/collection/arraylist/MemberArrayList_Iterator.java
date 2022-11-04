package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList_Iterator {

	private ArrayList<Member> arrayList;
	
	/* arrayList 생성 */
	public MemberArrayList_Iterator() {
		arrayList = new ArrayList<Member>();
	}
	
	/* 메서드 생성 */
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		/* Iterator : iterator 가 반환된다. (순회) */
		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempID = member.getMemberID();
			if(memberID == tempID) {
				arrayList.remove(member);
				return true;
			}
		}
		
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		
	}
	
	
	public void showAll() {
		
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println( );
		
		//System.out.println(arrayList);
	}
}
