package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.GameController;

public class ChessButtonListener implements ActionListener{
	GameController game=new GameController();

	@Override
	public void actionPerformed(ActionEvent e) {
		ChessButton button=(ChessButton)e.getSource();
		game.chessClicked(button.x, button.y);
		System.out.println("clicked");
	}

}
