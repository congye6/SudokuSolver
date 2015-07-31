package view;

import java.awt.Graphics;
import java.awt.Image;
import java.util.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class ChessBoardPanel extends JPanel implements Observer{
	static final int HEIGHT_OF_HEAD=50;
	static final int HEIGHT_OF_BODY=360;
	static final int SIZE=40;
	
	private ChessButton[][] chess;
	
	private OperationButton[] operationButtons;
    
	public ChessBoardPanel() {
		this.setLayout(null);
		
		chess=new ChessButton[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				chess[i][j]=new ChessButton(i, j);
				chess[i][j].setBounds(i*SIZE,HEIGHT_OF_HEAD+j*SIZE, SIZE, SIZE);
				chess[i][j].setIcon(Images.CHESS[0]);
				chess[i][j].addActionListener(new ChessButtonListener());
				this.add(chess[i][j]);
			}
		}
		
		operationButtons=new OperationButton[9];
		for(int i=0;i<9;i++){
			operationButtons[i]=new OperationButton(i+1);
			operationButtons[i].setBounds(i*SIZE, HEIGHT_OF_BODY+HEIGHT_OF_HEAD+20, SIZE, SIZE);
			operationButtons[i].setIcon(Images.OPERATION[i+1]);
			operationButtons[i].addActionListener(new OperationButtonListener());
			this.add(operationButtons[i]);
		}
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//背景
		Image head=Images.HEAD;
		Image background=Images.BACKGROUND;
		g.drawImage(background, 0, 0, null);
		g.drawImage(head,0,0, null);
		
		
		//操作面板
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		List<BlockVO> blockDisplayList=(ArrayList<BlockVO>)arg1;
		for(BlockVO displayBlock:blockDisplayList){
			ImageIcon image=Images.CHESS[displayBlock.getSolvedNumber()];
			chess[displayBlock.getX()][displayBlock.getY()].setIcon(image);
		}
	}
}
