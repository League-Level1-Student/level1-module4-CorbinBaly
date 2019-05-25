import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame;
JPanel panel;
JButton spin;
JLabel firstroll;
JLabel secondroll;
JLabel thirdroll;
	public void makeFrame() {
	frame = new JFrame();
	panel = new JPanel();
	spin = new JButton();
	addStuff();
	frame.pack();
}
	public void addStuff() {
		panel.add(spin);
		panel.add(firstroll);
		panel.add(secondroll);
		panel.add(thirdroll);
		spin.addActionListener(this);
	}
	public void setStuff() {
		
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
