package model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Observable;
import java.util.Scanner;


/**
 * @Class	SudokuSolver
 * @author congye6
 */
public class SudokuSolver {
	private BlockPO[][] blockMatrix;
	private int solvedNumber=0;
	private boolean hasNew=false;
	
	private List<Message> messageList=new ArrayList<>();
	
	public SudokuSolver(BlockPO[][] blockMatrix){
		this.blockMatrix=blockMatrix;
	}
	
	
	/**
	 * @Method sudokuSolver
	 */
	public BlockPO[][] sudokuSolve(){
		boolean guessWrong;
		
		
		while(true){
			guessWrong=false;
			hasNew=false;
			while(solvedNumber<81&&!guessWrong){
				guessWrong=search();
				if(!hasNew)
				break;
			}
			
			if(guessWrong){
				recover();
				continue;
			}
				
			
			if(solvedNumber>=81)
				break;
			
			
			if(!hasNew)
				guessNumber();
		}
		
		print();
		
			
		return blockMatrix;	
		
	}
	
	/**
	 * 出现无解时恢复
	 * @Method
	 */
	public void recover(){
		
		Message message=null;
		
		
		
		message=messageList.get(messageList.size()-1);
		messageList.remove(messageList.size()-1);
		
		
		blockMatrix=message.blockMatrix;
		solvedNumber=message.solved;
		
		
		
		blockMatrix[message.x][message.y].remove(message.num);
		
		
		
	}
	//@end
	
	/**
	 * @Method guessNumber
	 */
	private void guessNumber(){
		int x=0;
		int y=0;
		int num=0;
		
		//猜数字
		a:for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(!blockMatrix[i][j].isSolved()){
					x=i;
					y=j;
					num=blockMatrix[x][y].guessNumber();
					break a;
				}	
			}
		}
		BlockPO[][] blockMatrixCopy=(BlockPO[][])deepCopy(blockMatrix);
		Message save=new Message(blockMatrixCopy, x, y, num,solvedNumber);
		messageList.add(save);
		
		blockMatrix[x][y].solved(num);
		
	}
	//@end
	
	/**
	 * 出现无解时返回true
	 * @Method search
	 * @return
	 */
	private boolean search(){
		boolean guessWrong=false;
		hasNew=false;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				BlockPO po=blockMatrix[i][j];
				if(po.isSolved())
					continue;
				
				if(po.getSolvedNumber()!=0){
					guessWrong=solveNumber(i, j);
					
					solvedNumber++;
					
					po.setSolved();
					hasNew=true;
				}
				
				if(guessWrong)
					return true;
				
			}
		}
		
		return guessWrong;
	}
	//@end
	/**
	 * @Method solve
	 * @return ���޽⣬����true
	 */
	private boolean solveNumber (int x,int y){
		int num=blockMatrix[x][y].getSolvedNumber();
		boolean guessWrong=false;
		
		//�ų�ͬһ�е�
		for(int i=0;i<9;i++){
			if(i==x)
				continue;
			guessWrong=blockMatrix[i][y].remove(num);
			if(guessWrong)
				return guessWrong;
		}
		//�ų�ͬһ�е�
		for(int i=0;i<9;i++){
			if(i==y)
				continue;
			guessWrong=blockMatrix[x][i].remove(num);
			if(guessWrong)
				return guessWrong;
		}

		return guessWrong;
	}
	//@end
	
	
	
	private Object deepCopy(Object a){
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos;
		Object b=null;
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(a);
			ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois=new ObjectInputStream(bis);
			b= ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	
	
	
	private void print(){
		System.out.println("n="+solvedNumber);
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				System.out.printf("%d\t",blockMatrix[i][j].getSolvedNumber());
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
