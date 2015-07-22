package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class MainFrame implements Observer{
	
	
	private static final int HEIGHT=500;
	private static final int WIDTH=360;
	
	static final int HEIGHT_OF_HEAD=50;
	static final int HEIGHT_OF_CHESSBOARD=360;
	
	
	private JFrame frame;
	private HeadPanel head;
	private ChessBoardPanel chessBoard;
	private OperationPanel operationBoard;
	
	
	public  MainFrame() {
		frame=new JFrame("Sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(frame);
		
		head=new HeadPanel();
		
		
		
		frame.add(head);
		
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MainFrame mainFrame=new MainFrame();
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
