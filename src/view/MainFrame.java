package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class MainFrame implements Observer{
	
	
	private static final int HEIGHT=500;
	private static final int WIDTH=360;
	
	
	
	private JFrame frame;
	
	private ChessBoardPanel chessBoard;
	
	
	
	public  MainFrame() {
		frame=new JFrame("Sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(frame);
		
		
		
		chessBoard=new ChessBoardPanel();
		
		
		frame.add(chessBoard);

		
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
