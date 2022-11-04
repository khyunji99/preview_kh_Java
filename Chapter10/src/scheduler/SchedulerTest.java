package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		// R, L, P
		System.out.println("전화 상담 배분방식을 선택하세요.(R, L, P): ");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L'|| ch == 'l') {
			scheduler = new Leastjob();
		}
		else if(ch == 'P'|| ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		/*다형성 : 똑같은 메서드를 불렀지만 각 instance가 무엇이냐에 따라서 해당되는 구현코드가 달라진다. */ 
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
