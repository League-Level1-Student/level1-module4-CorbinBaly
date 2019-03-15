package extra;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel trick = new JLabel();
	JLabel treat = new JLabel();	
		public void run() {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(trick);
	panel.add(treat);
	treat.setText("Treat");
	trick.setText("Trick");
	treat.addMouseListener(this);
	trick.addMouseListener(this);
	}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
