import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class get_latest_tweet implements MouseListener, ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field;
	JButton search;
	String tweet;
	String tweetgotten;

	public void makeFrame() {
		field = new JTextField(9);
		search = new JButton();
		tweet = field.getText();
		frame.setVisible(true);
		panel.add(field);
		frame.add(panel);
		panel.add(search);
		search.addActionListener(this);
		search.setText("Search The Twitterverse");
		frame.setName("The Amazing Twitter Retriever");
		frame.setDefaultCloseOperation(0);
		frame.pack();
	}

	private String getLatestTweet(String searchingFor) {
		System.out.println("It's working");
		Twitter twitter = new TwitterFactory().getInstance();

		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if (search == clicked) {
			tweetgotten = getLatestTweet(tweet);
			System.out.println("tweet tweet");
			System.out.println(tweetgotten);
		}
	}
}
