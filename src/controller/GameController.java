package controller;

import model.ChessBoardModel;

public class GameController {
	static ChessBoardModel model;

	public void chessClicked(int x,int y){
		model.setPlace(x,y);
	}
	
	public void operationClicked(int num){
		model.setNumber(num);
	}
	
	public void start(){
		model.solve();
	}
	
	static public void setModel(ChessBoardModel models){
		model=models;
	}

}
