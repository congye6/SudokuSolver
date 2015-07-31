package controller;

import model.ChessBoardModel;

public class GameController {
	ChessBoardModel model;
	
	public GameController(ChessBoardModel model) {
		this.model = model;
	}

	public void chessClicked(int x,int y){
		model.setPlace(x,y);
	}
	
	public void operationClicked(int num){
		model.setNumber(num);
	}
	
	public void start(){
		model.solve();
	}

}
