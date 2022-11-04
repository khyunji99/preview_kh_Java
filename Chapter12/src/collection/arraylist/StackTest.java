package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	/* 데이터 추가 */
	public void push(String data) {
		arrayStack.add(data);
	}
	
	/* 데이터 제거 */
	public String pop() {
		/* stack 이 없을 때 */
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len - 1);
	}
	
	/* 맨위의 stack 꺼내보기 */
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.get(len - 1);
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
	}

}
