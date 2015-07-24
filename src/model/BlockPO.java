package model;

import java.io.Serializable;
import java.util.*;

/**
 * @Class BlockPO
 * @author congye6
 * ��¼���̸��ӵ���Ϣ
 */
public class BlockPO implements Serializable{
	private int possibleNnumbers=511;
	
	private static int[] removeBins=new int[10];
	private static int[] solveBins=new int[10];
	private static Map<Integer,Integer> solveMap=new HashMap<Integer, Integer>();
	
	
	private boolean isSolved=false;
	
	private int solvedNumber;
	
	
	static{
		int maxNum=(int)(Math.pow(2, 9)-1);
		for(int i=1;i<10;i++){
			int temp=(int)Math.pow(2, i-1);
			removeBins[i]=maxNum-temp;
			solveBins[i]=temp;
			solveMap.put(temp, i);
		}
		
	}
	
	
	/**
	 * @Method remove
	 * �Ƴ���������
	 */
	public boolean remove(int i){
		possibleNnumbers=possibleNnumbers&removeBins[i];
		
		if(possibleNnumbers==0)
			return true;
		
		if((possibleNnumbers&(possibleNnumbers-1))==0)
			solvedNumber=solveMap.get((int)Long.lowestOneBit(possibleNnumbers));
	
		return false;
	}
	//@end
	/**
	 * @Method getPossibleNumbers
	 */
	public int  guessNumber(){
		return solveMap.get((int)Long.lowestOneBit(possibleNnumbers));
	}
	//@end
	/**
	 * @Method solved
	 * �����������ó�ʼ���֣����߲�һ������
	 */
	public void solved(int i){
		possibleNnumbers=solveBins[i];
		solvedNumber=i;
	}
	//@end
	/**
	 * @Method isSolved
	 * @return ��ǰ�Ƿ���
	 */
	public boolean isSolved(){
		return isSolved;
	}
	//@end
	/**
	 * �����Ѿ����
	 * @Method setSolved
	 */
	public void setSolved(){
		isSolved=true;
	}
	//@end
	
	/**
	 * �ѽ��������
	 * @Method getSolvedNumber
	 */
	public int getSolvedNumber() {
		return solvedNumber;
	}
	//@end
}
