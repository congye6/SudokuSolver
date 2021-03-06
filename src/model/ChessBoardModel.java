package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import view.BlockVO;

public class ChessBoardModel extends Observable{
	private BlockPO[][] blockMatrix=new BlockPO[9][9];
	private SudokuSolver solver;
	

	
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
	private void updateChange(List<BlockVO> message){
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
		blockMatrix[x][y].solved(num);
		List<BlockVO> blockDisplayList=new ArrayList<>();
		blockDisplayList.add(blockMatrix[x][y].getDisplayBlock());
		this.updateChange(blockDisplayList);
	}


	public void solve() {
		blockMatrix=solver.sudokuSolve();
		List<BlockVO> blockDisplayList=new ArrayList<>();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.println(blockMatrix[i][j].getSolvedNumber());
				blockDisplayList.add(blockMatrix[i][j].getDisplayBlock());
			}
		}
		this.updateChange(blockDisplayList);
	}
	
	
	
}
