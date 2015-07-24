package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class MainFrame implements Observer{
	
	
	private static final int HEIGHT=500;
	private static final int WIDTH=360;
	
	
	
	
	
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
		frame.setLayout(null);
		
		head=new HeadPanel();
		operationBoard=new OperationPanel();
		
		
		frame.add(head);
		frame.add(operationBoard);
		
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
