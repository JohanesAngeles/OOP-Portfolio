import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutMyself {

	 JFrame AboutMyselfFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMyself window = new AboutMyself();
					window.AboutMyselfFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutMyself() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AboutMyselfFrame = new JFrame();
		AboutMyselfFrame.setResizable(false);
		AboutMyselfFrame.setBounds(100, 100, 900, 628);
		AboutMyselfFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AboutMyselfFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Homepage homepage = new Homepage();
				homepage.HomepageFrame.setVisible(true);
				AboutMyselfFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(33, 545, 15, 20);
		AboutMyselfFrame.getContentPane().add(returnButton);
		
		JLabel proceedButton = new JLabel("");
		proceedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Contacts contacts = new Contacts();
				contacts.ContactsFrame.setVisible(true);
				AboutMyselfFrame.dispose();
			}
		});
		proceedButton.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/proceedButton.png")));
		proceedButton.setBounds(835, 545, 15, 20);
		AboutMyselfFrame.getContentPane().add(proceedButton);
		
		JLabel AboutMyselfBackground = new JLabel("New label");
		AboutMyselfBackground.setIcon(new ImageIcon(AboutMyself.class.getResource("/image/AboutmeBg.png")));
		AboutMyselfBackground.setBounds(0, -11, 884, 617);
		AboutMyselfFrame.getContentPane().add(AboutMyselfBackground);
	}

}
