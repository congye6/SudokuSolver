package view;
import java.awt.*;

import javax.swing.*;
public class Images {
	static final Image HEAD=createImage("head");
	static final Image BACKGROUND=createImage("background");
	
	
	
	
	
	
	
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
