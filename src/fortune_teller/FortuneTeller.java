package fortune_teller;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

	JFrame frame = new JFrame();

	int frameWidth = 500;
	int frameHeight = 500;
	JFrame framepicture = new JFrame();
	
	FortuneTeller() throws Exception {
		// 1. Choose an image for your fortune teller and put it in your default package
		fortuneTellerImage = ImageIO.read(getClass().getResource("fortune teller.png"));
		// 2. Adjust the frameWidth and frameHeight variables to fit your image nicely
		// (doesn’t need a new line of code)
		// 3. Complete the begin() method in the FortuneTellerRunner class
		// 4. add a mouse listener to the frame
		frame.addMouseListener(this);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		// 5. Print the mouseX variable
		System.out.println(mouseX + mouseY);
		// 6. Add the mouseY variable to the previous line so that it prints out too (no
		// new line)
		// 7. Adjust your secret location co-ordinates here:
		int secretLocationX = 300;
		int secretLocationY = 9;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let them ask a
		 * question.
		 */
		if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
			String question = JOptionPane.showInputDialog("Would you rather learn about the Spartans or the Dolls?");
			JLabel label;
			framepicture.setVisible(true);
			if (question.equalsIgnoreCase("Dolls")) {
				JOptionPane.showMessageDialog(null,
						"The Dolls used to be one entity, until seperated into different dolls resembling the different personalitys");
				label =loadImageFromComputer("300_Image.jpeg");
				framepicture.add(label);
			}
			else if(question.equalsIgnoreCase("Spartans")) {
				JOptionPane.showMessageDialog(null, "The Spartans were a proud clan, focused on warriors and isolating the rest. They fought to the last breath against the innumeral Persians.");
			label =loadImageFromComputer("300_Image.jpeg");
			framepicture.add(label);
			}
			else {
				JOptionPane.showMessageDialog(null, "Please input either Spartans or Dolls.");
			}
			framepicture.setVisible(false);
			// 9. Find a spooky sound and put it in your default package (freesound.org)
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
			// 10. Play the sound
			sound.play();
			// 11. Use the pause() method below to wait until your music has finished
			pause(7);
			// 12. Insert your completed Magic 8 ball code here
			// 2. Make a variable that will hold a random number and put a random number
			// into this variable using "new Random().nextInt(4)"
			int rand;
			rand = new Random().nextInt(4);
			// 3. Print out this variable
			System.out.println(rand);
			// 4. Get the user to enter a question for the 8 ball
			JOptionPane.showInputDialog("Ask a Question");
			// 5. If the random number is 0
			if (rand == 0) {
				JOptionPane.showMessageDialog(null, "Yes");

				// -- tell the user "Yes"
			}
			// 6. If the random number is 1
			else if (rand == 1) {
				JOptionPane.showMessageDialog(null, "No");
				// -- tell the user "No"
			}
			// 7. If the random number is 2
			else if (rand == 2) {
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
				// -- tell the user "Maybe you should ask Google?"
			}
			// 8. If the random number is 3
			else if (rand == 3) {
				JOptionPane.showMessageDialog(null, "You should probably ask the 8Ball next to me.");

				// -- write your own answer

			}
		}

	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**************** don't worry about the stuff under here *******************/

	BufferedImage fortuneTellerImage;

	@Override
	public void run() {
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}

// Copyright The League, 2016
