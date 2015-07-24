package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class OperationPanel extends JPanel{
	static final int SIZE=40;
	static final int START=ChessBoardPanel.START+ChessBoardPanel.HEIGHT;
	
	public   OperationPanel() {
		this.setLocation(0, START);
		this.setSize(360, 40);
	}
	
	@Override
	public void paintComponent(Graphics g){
		Image oper9=Images.OPERATION[9];
		g.drawImage(oper9, 0, START, null);
	}
}
