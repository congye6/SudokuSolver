package view;

public class BlockVO {

	DisplayBlockState dbs;
	
	private int x;
	private int y;
	
	public BlockVO(DisplayBlockState dbs, int x, int y) {
		this.dbs = dbs;
		this.x = x;
		this.y = y;
	}
	
}
