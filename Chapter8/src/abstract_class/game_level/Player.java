package abstract_class.game_level;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		//초보자 레벨만 생성
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	//레벨 설정(setter)
	public void setLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
}
