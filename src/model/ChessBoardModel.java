package model;

import java.util.List;
import java.util.Observable;

import view.BlockVO;

public class ChessBoardModel extends Observable{
	private BlockPO[][] blockMatrix=new BlockPO[9][9];
	SudokuSolver solver;
	
	int x=10;
	int y=10;
	
	
	public ChessBoardModel() {
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				blockMatrix[i][j]=new BlockPO(i,j);
			}
		}
		solver=new SudokuSolver(blockMatrix);
	}

	
	
	/**
	 * 通知更新方法，请在子类中需要通知观察者的地方调用此方法
	 * @param data
	 */
	protected void updateChange(List<BlockVO> message){
		super.setChanged();
		super.notifyObservers(message);
	}


	public void setPlace(int x, int y) {
		this.x=x;
		this.y=y;
		
	}


	public void setNumber(int num) {
		if(x==10&&y==10)
			return;
		
	}


	public void solve() {
		solver.sudokuSolve();
		
	}
	
	
	
}
