package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class OperationButton extends JButton{
	private int num;

	public OperationButton(int num) {
		this.num = num;
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
		this.setBorder(BorderFactory.createRaisedBevelBorder());
	}

	public int getNum() {
		return num;
	}
}
