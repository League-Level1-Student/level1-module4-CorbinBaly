
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class typingtutor implements KeyListener {
	static char currentLetter;
	static int score = 0;
	JLabel letterlabel = new JLabel();
	public void makeFrame() {
		JFrame frame = new JFrame();
		currentLetter = generateRandomLetter();
		frame.add(letterlabel);
		letterlabel.setVisible(true);
		frame.setVisible(true);
		frame.setName("Typing Tutor");
		letterlabel.setText(currentLetter + "");
		letterlabel.setFont(letterlabel.getFont().deriveFont(28.0f));
		letterlabel.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		frame.pack();
		makePointFrame();
	}
	public void makePointFrame() {
		JFrame pointframe = new JFrame();
		JLabel pointlabel = new JLabel();
		pointframe.add(pointlabel);
		pointframe.setVisible(true);
		pointlabel.setVisible(true);
		pointlabel.setText(score+"");
		pointframe.pack();
	}
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyChar();
	if(keyCode != currentLetter) {
		System.out.println((char)keyCode);
		JOptionPane.showMessageDialog(null, "Incorrect Letter.");
		currentLetter = generateRandomLetter();
		letterlabel.setText(currentLetter + "");
	}
	else if(keyCode==currentLetter) {
		System.out.println((char)keyCode);
		JOptionPane.showMessageDialog(null, "Correct!");
		currentLetter = generateRandomLetter();
		letterlabel.setText(currentLetter + "");
		score++;
	}
	}
}
