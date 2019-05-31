import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	Random rand = new Random();
	JButton molebutton;
	int whacked = 0;
	int missed = 0;
	Date start = new Date();
	int value = rand.nextInt(23);

	public void makeFrame() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		makethegoddamnButtons();
		setStuff();
	}

	public void setStuff() {
		frame.setName("Whack-A-Mole");
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void makethegoddamnButtons() {
		for (int i = 0; i <= 23; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == value) {
				button.setText("Mole");
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		value = rand.nextInt(23);
		if (clicked.getText().equals("Mole")) {
			speak("I'm so proud!");
			whacked++;
		} else {
			speak("You're such a dissapointment!");
			missed++;
		}
		frame.dispose();
		if (whacked == 10) {
			endGame(start, whacked);
		}
		if (missed >= 5) {
			JOptionPane.showMessageDialog(null, "You lost!");
		}
		makeFrame();
	}
}
