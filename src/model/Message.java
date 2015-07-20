package model;

import java.io.Serializable;

public class Message implements Serializable{
	BlockPO[][] blockMatrix;
	int x;
	int y;
	int num;
	int solved;
	public Message(BlockPO[][] blockMatrix,int x,int y,int num,int solved){
		this.x=x;
		this.y=y;
		this.num=num;
		this.blockMatrix=blockMatrix;
		this.solved=solved;
	}
}
