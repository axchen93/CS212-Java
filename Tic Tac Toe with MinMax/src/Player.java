package application;

public class Player {
	private String userName;
	private int winCount;
	private int loseCount;
	private int drawCount;
	
	public Player(String name) {
		userName = name;
		winCount=0;
		loseCount=0;
		drawCount =0;
	}
	
	public void setWin() {
		winCount++;
	}
	public void setLose() {
		loseCount++;
	}
	public void setDraw() {
		drawCount++;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getWin() {
		return winCount;
	}
	public int getLost() {
		return loseCount;
	}
	public int getDraw() {
		return drawCount;
	}
	
}
