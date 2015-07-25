package view;
import java.awt.*;

import javax.swing.*;
public class Images {
	static final Image HEAD=createImage("head");
	static final Image BACKGROUND=createImage("background");
	
	static final Image[] OPERATION=new Image[10];
	static final Image[] CHESS=new Image[10];
	
	
	static {
		for(int i=1;i<=9;i++){
		OPERATION[i]=createImage("operation"+i);
		CHESS[i]=createImage("chess"+i);
		}
		CHESS[0]=createImage("blank");
	}
	
	/**
	 * 创建image
	 * @author congye6
	 * @param name 图片名字
	 */
	private static Image createImage(String name){
		Image image=new ImageIcon("image/"+name+".jpg").getImage();
		return image;
	}
	

}
