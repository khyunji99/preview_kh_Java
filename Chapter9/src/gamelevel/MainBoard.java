package gamelevel;

public class MainBoard {
	
	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1); // play를 부르면 Player의 play라는 메서드가 있고
		                // play에서 go를 부를 것이다.
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);
		player.play(3);
	}

}
// 일반적으로 각각의 Level 하위 클래스들을 만든 다음 상속 PlayerLevel 클래스를 만들고
// 테스트 할 수 있는 MainBoard 클래스를 만든다.
// 거꾸로 하면 먼저 MainBoard 클래스를 만들고 그다음 오류를 하나씩 고쳐나가는 방법으로
// 상속 클래스 먼저 만들고 그 다음에 하위 클래스를 만든다.