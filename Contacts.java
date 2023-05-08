import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Contacts {

	 JFrame ContactsFrame;
	 private final JLabel Facebookbutton = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contacts window = new Contacts();
					window.ContactsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contacts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ContactsFrame = new JFrame();
		ContactsFrame.setResizable(false);
		ContactsFrame.setBounds(100, 100, 450, 617);
		ContactsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ContactsFrame.getContentPane().setLayout(null);
		Facebookbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://www.facebook.com/johanes.angeles").toURI());
				}
				catch (Exception E1) {
					
				}
			}
		});
		Facebookbutton.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _facebook.png")));
		Facebookbutton.setBounds(77, 301, 50, 60);
		ContactsFrame.getContentPane().add(Facebookbutton);
		
		JLabel instagramButton = new JLabel("");
		instagramButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					Desktop.getDesktop().browse(new URL("https://www.instagram.com/jpangeles_/").toURI());
				}
				catch (Exception E1) {
					
				}
			}
		});
		instagramButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _instagram.png")));
		instagramButton.setBounds(159, 301, 58, 60);
		ContactsFrame.getContentPane().add(instagramButton);
		
		JLabel twitterButton = new JLabel("");
		twitterButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://twitter.com/jpalex__").toURI());
				}
				catch (Exception E1) {
					
				}
			}
		});
		twitterButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _twitter.png")));
		twitterButton.setBounds(247, 301, 50, 60);
		ContactsFrame.getContentPane().add(twitterButton);
		
		JLabel viberButton = new JLabel("");
		viberButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/icon _Viber.png")));
		viberButton.setBounds(335, 301, 50, 60);
		ContactsFrame.getContentPane().add(viberButton);
		
		JLabel repositoryGitHubButton = new JLabel("");
		repositoryGitHubButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://github.com/JohanesAngeles").toURI());
				}
				catch (Exception E1) {
					
				}
				
			}
		});
		repositoryGitHubButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/githubIcon.png")));
		repositoryGitHubButton.setBounds(77, 449, 50, 60);
		ContactsFrame.getContentPane().add(repositoryGitHubButton);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AboutMyself aboutme = new AboutMyself();
				aboutme.AboutMyselfFrame.setVisible(true);
				ContactsFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Contacts.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(51, 530, 15, 20);
		ContactsFrame.getContentPane().add(returnButton);
		
		JLabel contactsBackground = new JLabel("");
		contactsBackground.setIcon(new ImageIcon(Contacts.class.getResource("/image/ContactsBg.png")));
		contactsBackground.setBounds(0, 0, 434, 585);
		ContactsFrame.getContentPane().add(contactsBackground);
	}

}
