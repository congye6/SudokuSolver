package view;
import javax.swing.*;

public class MainFrame {
	
	
	private static final int HEIGHT=500;
	private static final int WIDTH=360;
	
	
	
	private JFrame frame;
	
	public ChessBoardPanel getChessBoard() {
		return chessBoard;
	}



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
	
	
	
	
}
