package houl;

public class Game {
	private int score = 0;
	
	
	public int score(){
		return score;
	}
	public void roll(int pin){
		score+=pin;
	}
}
