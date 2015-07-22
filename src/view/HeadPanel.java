package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;
/**
 * 显示页面顶部图片和背景图片
 * @author congye6
 */
public class HeadPanel extends JPanel{

	@Override
	public void paintComponent(Graphics g){
		Image head=Images.HEAD;
		Image background=Images.BACKGROUND;
		g.drawImage(background, 0, 0, null);
		g.drawImage(head,0,0, null);
	}
}
