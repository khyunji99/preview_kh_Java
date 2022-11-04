package gamelevel;

public class Player {

	private PlayerLevel level; // level 이라는 변수를 가지고 있는데 얘는 여러 타입이 될 수 있다.
	                           // BeginnerLevel, AdvancedLevel, SuperLevel 로 여러 타입이 될 수 있다.
	                           // 그래서 이 level 변수를 상위클래스인 PlayerLevel 타입으로 선언해준다 (참조해준다).
	                           // 그런데 level 변수는 함부로 가져다 쓰이면 안되니깐 private으로

	/*디폴트 constructor*/
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) { // setLevel 을 upgradeLevel 로 변경
		this.level = level;                       // 상위클래스인 PlayerLevel 타입이면
		level.showLevelMessage();                 // 어느것이든지 들어올 수 있다.(AdvancedLevel 이든 SuperLevel 이든 다 들어올 수 있다.)
	}
	
	public void play(int count) {
		level.go(count);
	}


}
