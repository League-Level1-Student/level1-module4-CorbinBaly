package extra;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel scarypanel = new JPanel();
	JPanel treatpanel = new JPanel();
	JLabel tricktext = new JLabel();
	JLabel treatext = new JLabel();

	public void createUI() {
		JLabel scary = loadImageFromWithinProject("something.jpg");
		JLabel treat = loadImageFromWithinProject("twix.jpeg");
		scarypanel.add(scary);
		treatpanel.add(treat);
		panel.add(scarypanel);
		panel.add(treatpanel);
		scarypanel.setVisible(false);
		treatpanel.setVisible(false);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(tricktext);
		panel.add(treatext);
		treatext.setText("Treat");
		tricktext.setText("Trick");
		treatext.addMouseListener(this);
		tricktext.addMouseListener(this);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel clicked = (JLabel) e.getSource();
		if (tricktext == clicked) {
			System.out.println("trick");
			treatpanel.setVisible(true);
			frame.pack();
		}
		if (treatext == clicked) {
			System.out.println("treat");
			scarypanel.setVisible(true);
			frame.pack();
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

	public JLabel loadImageFromWithinProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
