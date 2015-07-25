package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class ChessBoardPanel extends JPanel{
	static final int HEIGHT_OF_HEAD=50;
	
	static final int HEIGHT_OF_BODY=360;
	
	static final int SIZE=40;
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//背景
		Image head=Images.HEAD;
		Image background=Images.BACKGROUND;
		g.drawImage(background, 0, 0, null);
		g.drawImage(head,0,0, null);
		
		
		//操作面板
		Image oper9=Images.CHESS[5];
		g.drawImage(oper9, 0, HEIGHT_OF_HEAD+HEIGHT_OF_BODY, null);
	}
}
