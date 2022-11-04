package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		
		//for(String s : list) {
			//.out.println(s);
		//}
		
		for(int i =0; i < list.size(); i++) {
			//System.out.println(list.get(i));
			String s = list.get(i);
		}
		
	}

}
