package view;
import java.awt.*;

import javax.swing.*;
public class Images {
	static final Image HEAD=createImage("head");
	static final Image BACKGROUND=createImage("background");
	
	static final ImageIcon[] OPERATION=new ImageIcon[10];
	static final ImageIcon[] CHESS=new ImageIcon[10];
	
	
	static {
		for(int i=1;i<=9;i++){
		OPERATION[i]=createImageIcon("operation"+i);
		CHESS[i]=createImageIcon("chess"+i);
		}
		CHESS[0]=createImageIcon("blank");
	}
	
	/**
	 * 创建image
	 * @author congye6
	 * @param name 图片名字
	 */
	private static ImageIcon createImageIcon(String name){
		ImageIcon image=new ImageIcon("image/"+name+".jpg");
		return image;
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
