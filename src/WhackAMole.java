import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	Random rand = new Random();
	JButton molebutton;
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
		frame.setSize(200, 300);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if (clicked.getText().equals("Mole")) {
			speak("I'm so proud!");
		} else {
			speak("You're such a dissapointment!");
		}
		frame.dispose();
		makeFrame();
	}
}
