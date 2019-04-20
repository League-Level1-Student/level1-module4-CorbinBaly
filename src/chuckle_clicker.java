import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener {

	public static void main(String[] args) {
		chuckle_clicker clicker = new chuckle_clicker();
		clicker.makeButtons();
	}

	JButton joke = new JButton();
	JButton punchline = new JButton();

	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		joke.setText("Joke");
		punchline.setText("Punchline");
		punchline.addActionListener(this);
		joke.addActionListener(this);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.pack();
		frame.setDefaultCloseOperation(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (punchline == buttonPressed) {
			JOptionPane.showMessageDialog(null, "Captain Vietnam");
		} else if (joke == buttonPressed) {
			JOptionPane.showMessageDialog(null, "Who's the only one who can beat Captain America?");
		}
	}
}
