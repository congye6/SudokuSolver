package view;

public class BlockVO {

	private int x;
	

	private int y;

	private int solvedNumber;
	

	public BlockVO(int solvedNumber, int x, int y) {
		this.solvedNumber = solvedNumber;
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getSolvedNumber() {
		return solvedNumber;
	}
}
