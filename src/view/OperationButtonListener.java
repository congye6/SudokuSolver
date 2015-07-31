package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.GameController;

public class OperationButtonListener implements ActionListener{
	GameController game=new GameController();

	@Override
	public void actionPerformed(ActionEvent e) {
		OperationButton op=(OperationButton)e.getSource();
		game.operationClicked(op.getNum());
	}
}
