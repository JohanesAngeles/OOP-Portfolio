import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Homepage {

	 JFrame HomepageFrame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.HomepageFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Homepage() {
		initialize();
	}

	
	private void initialize() {
		HomepageFrame = new JFrame();
		HomepageFrame.setResizable(false);
		HomepageFrame.setBounds(100, 100, 900, 628);
		HomepageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HomepageFrame.getContentPane().setLayout(null);
		
		JLabel AboutMyselfButton = new JLabel("");
		AboutMyselfButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				AboutMyself aboutme = new AboutMyself();
				aboutme.AboutMyselfFrame.setVisible(true);
				HomepageFrame.dispose();
				
			}
			
		});
		
		JLabel logoutButton = new JLabel("");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			    AboutMyself myself = new AboutMyself();
			    
			    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
			    		"Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                	HomepageFrame.dispose();
                    
                }
			    
			}
		});
		
		logoutButton.setIcon(new ImageIcon(Homepage.class.getResource("/image/LogOutbutton.png")));
		logoutButton.setBounds(636, 548, 184, 26);
		HomepageFrame.getContentPane().add(logoutButton);
		AboutMyselfButton.setIcon(new ImageIcon(Homepage.class.getResource("/image/aboutmyselfButton.png")));
		AboutMyselfButton.setBounds(68, 271, 214, 266);
		HomepageFrame.getContentPane().add(AboutMyselfButton);
		
		JLabel codesButton = new JLabel("");
		codesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codesprog = new codesProgram();
				codesprog.CodesProgramFrame.setVisible(true);
				HomepageFrame.dispose();
			}
		});
		codesButton.setIcon(new ImageIcon(Homepage.class.getResource("/image/codesButton.png")));
		codesButton.setBounds(336, 271, 214, 266);
		HomepageFrame.getContentPane().add(codesButton);
		
		JLabel outsideITButton = new JLabel("");
		outsideITButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				OutsideIT outsideit = new OutsideIT();
				outsideit.OutsideITFrame.setVisible(true);
				HomepageFrame.dispose();
			}
		});
		outsideITButton.setIcon(new ImageIcon(Homepage.class.getResource("/image/outsideITButton.png")));
		outsideITButton.setBounds(616, 271, 214, 266);
		HomepageFrame.getContentPane().add(outsideITButton);
		
		JLabel HomepageBackground = new JLabel("");
		HomepageBackground.setIcon(new ImageIcon(Homepage.class.getResource("/image/HomepageBg.png")));
		HomepageBackground.setBounds(0, 0, 884, 589);
		HomepageFrame.getContentPane().add(HomepageBackground);
	}

}
