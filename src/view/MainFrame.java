package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class MainFrame implements Observer{

	private JFrame frame;
	private JPanel chessBoard;
	private JPanel operationBoard;
	
	
	public  MainFrame() {
		frame=new JFrame("Sudoku");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(350, 500);
		frame.setLocationRelativeTo(frame);
		
		
		
		
		
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
