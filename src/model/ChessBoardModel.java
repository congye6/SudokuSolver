package model;

import java.util.Observable;

public class ChessBoardModel extends Observable{
	private BlockPO[][] blockMatrix=new BlockPO[9][9];
	SudokuSolver solver;
	
	
	public ChessBoardModel() {
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				blockMatrix[i][j]=new BlockPO();
			}
		}
		solver=new SudokuSolver(blockMatrix);
	}

	
	
	
	
	
	/**
	 * 通知更新方法，请在子类中需要通知观察者的地方调用此方法
	 * @param data
	 */
	protected void updateChange(UpdateMessage message){
		
		super.setChanged();
		super.notifyObservers(message);
		
	}
	
	
	
}
