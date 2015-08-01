package view;

import javax.swing.*;

public class ChessButton extends JButton{
	public int y;
	public int x;
	
	
	public ChessButton(int x, int y) {
		this.x = x;
		this.y = y;
		this.setContentAreaFilled(false);
		
	}
	

}
