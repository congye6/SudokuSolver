package main;

import controller.GameController;
import model.ChessBoardModel;
import view.MainFrame;

public class Sudoku {
	public static void main(String[] args) {
		ChessBoardModel model=new ChessBoardModel();
		GameController.setModel(model);
		MainFrame ui=new MainFrame();
		model.addObserver(ui.getChessBoard());
	}
}
