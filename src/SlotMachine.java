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
	JLabel secondroll;
	JLabel thirdroll;
	JLabel firstroll;
	int firstone = 0;
	int firsttwo = 1;
	int firstthree = 2;
	JLabel Orange;
	JLabel Watermelon;
	JLabel Cherry;
public void start() {
	makeImages();
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
		frame.add(panel);
		panel.add(spin);
		panel.add(firstroll);
		panel.add(secondroll);
		panel.add(thirdroll);
		spin.addActionListener(this);
	}

	public void setStuff() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spin.setText("Spin");
	}

	public void makeImages() {
		try {
			Cherry = createLabelImage("Cherry.png");
			firstroll = Cherry;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Orange = createLabelImage("Orange.png");
			secondroll = Orange;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Watermelon = createLabelImage("Watermelonp.png");
			thirdroll = Watermelon;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@Override
	public void actionPerformed(ActionEvent e) {
		int valueone = randone.nextInt(2);
		int valuetwo = randone.nextInt(2);
		int valuethree = randone.nextInt(2);
		// TODO Auto-generated method stub
		System.out.println(valueone);
		System.out.println(valuetwo);
		System.out.println(valuethree);
		if (firstone == valueone) {
			firstroll = Orange;
		} else if (firstone == valuetwo) {
			firstroll = Watermelon;
		} else if (firstone == valuethree) {
			firstroll = Cherry;
		}
		if (firsttwo == valueone) {
			secondroll = Orange;
		} else if (firsttwo == valuetwo) {
			secondroll = Watermelon;
		} else if (firsttwo == valuethree) {
			secondroll = Cherry;
		}
		if (firstthree == valueone) {
			thirdroll = Orange;
		} else if (firstthree == valuetwo) {
			thirdroll = Cherry;
		} else if (firstthree == valuethree) {
			thirdroll = Watermelon;
		}
		frame.dispose();
		makeFrame();
		frame.repaint();
	}
}
