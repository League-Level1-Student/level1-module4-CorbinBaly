
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements MouseListener {
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JFrame frame = new JFrame();
	JLabel result= new JLabel();
	String numb = "";
	int resultnumber = 0;
	JTextField fieldone;
	JTextField fieldtwo;
	int firstnumb;
	int secondnumb;

	public void makeframe() {
		frame.setName("Simple Calculator");
		frame.add(panel);
		basicallyspamcode();
		frame.pack();
	}

	public void basicallyspamcode() {
		fieldone = new JTextField(9);
		fieldtwo = new JTextField(9);
		panel.add(result);
		result.setText(""+resultnumber);
		result.setSize(6, 6);
		panel.add(fieldone);
		panel.add(fieldtwo);
		add.setText("add");
		sub.setText("sub");
		mul.setText("mul");
		div.setText("div");
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(result);
		panel.setVisible(true);
		frame.setVisible(true);
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mul.addMouseListener(this);
		div.addMouseListener(this);
		frame.pack();
	}

	public void add() {
		resultnumber = firstnumb + secondnumb;
	}

	public void subtract() {
		resultnumber = firstnumb - secondnumb;
	}

	public void multiply() {
		resultnumber = firstnumb * secondnumb;
	}

	public void divide() {
		resultnumber = firstnumb - secondnumb;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		firstnumb = Integer.parseInt(fieldone.getText());
		secondnumb = Integer.parseInt(fieldtwo.getText());
		//System.out.println(firstnumb);
		//System.out.println(secondnumb);
		System.out.println(resultnumber);
		result.setText(""+resultnumber);
if(clicked==add) {
	add();
}
else if(clicked==sub) {
	subtract();
}
else if(clicked==mul) {
	multiply();
}
else if(clicked==div) {
	divide();
}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
