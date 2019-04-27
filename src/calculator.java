
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculator implements MouseListener {
public void makeframe() {
	JFrame frame = new JFrame();
	frame.setName("Simple Calculator");
	JPanel addpanel = new JPanel();
	addpanel.addMouseListener(this);
	JPanel subtractpanel= new JPanel();
	subtractpanel.addMouseListener(this);
	JPanel multiplypanel = new JPanel();
	multiplypanel.addMouseListener(this);
	JPanel dividepanel = new JPanel();
	dividepanel.addMouseListener(this);
}
public void add(){

}
public void subtract() {

}
public void multiply() {

}
public void divide() {

}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JPanel clicked = (JPanel) e.getSource();
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
