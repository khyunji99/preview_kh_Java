package scheduler;

public interface Scheduler {
	// Scheduler 에서 해야하는 일들을 정의함 // 이것을 구현하는 여러 클래스들이 있음 (R, L, P 클래스들)
	void getNextCall();
	void sendCallToAgent();
}
