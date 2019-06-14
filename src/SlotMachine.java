import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

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
	Random randone = new Random();
	Random randtwo = new Random();
	Random randthree = new Random();
	JLabel secondroll;
	JLabel thirdroll;
	JLabel firstroll;
	JLabel Orange;
	JLabel Watermelon;
	JLabel Cherry;

	public void start() {
		try {
			firstroll = createLabelImage("Cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			secondroll = createLabelImage("Orange.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thirdroll = createLabelImage("Watermelonp.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		makeFrame();
	}

	public void makeFrame() {
		frame = new JFrame();
		panel = new JPanel();
		spin = new JButton();
		addStuff();
		setStuff();
		frame.pack();
	}

	public void addStuff() {
		panel.add(spin);
		panel.add(firstroll);
		panel.add(secondroll);
		panel.add(thirdroll);
		frame.add(panel);
		spin.addActionListener(this);
	}

	public void setStuff() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spin.setText("Spin");
	}

		

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	public void changeImage() {
		int valueone = randone.nextInt(3);
		int valuetwo = randone.nextInt(3);
		int valuethree = randone.nextInt(3);
		// TODO Auto-generated method stub
		System.out.println(valueone);
		System.out.println(valuetwo);
		System.out.println(valuethree);
		if (valueone == 0) {
			try {
				firstroll = createLabelImage("Orange.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valueone == 1) {
			try {
				firstroll = createLabelImage("Watermelonp.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valueone == 2) {
			try {
				firstroll = createLabelImage("Cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (valuetwo == 0) {
			try {
				secondroll = createLabelImage("Orange.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valuetwo == 1) {
			try {
				secondroll = createLabelImage("Watermelonp.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valuetwo == 2) {
			try {
				secondroll = createLabelImage("Cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (valuethree == 0) {
			try {
				thirdroll = createLabelImage("Orange.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valuethree == 1) {
			try {
				thirdroll = createLabelImage("Cherry.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (valuethree == 2) {
			try {
				thirdroll = createLabelImage("Watermelonp.png");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		changeImage();
		frame.dispose();
		makeFrame();
	}
}
