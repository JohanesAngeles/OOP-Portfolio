import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Htmlworks {

	 JFrame HtmlWorksFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Htmlworks window = new Htmlworks();
					window.HtmlWorksFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Htmlworks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		HtmlWorksFrame = new JFrame();
		HtmlWorksFrame.setBounds(100, 100, 916, 622);
		HtmlWorksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HtmlWorksFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("\r\n");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codes = new codesProgram();
				codes.CodesProgramFrame.setVisible(true);
				HtmlWorksFrame.dispose();
			     
			}
		});
		returnButton.setIcon(new ImageIcon(Htmlworks.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(792, 28, 15, 20);
		HtmlWorksFrame.getContentPane().add(returnButton);
		
		JLabel HTMLCompilation = new JLabel("");
		HTMLCompilation.setIcon(new ImageIcon(Htmlworks.class.getResource("/image/HTMLCSScompilation.png")));
		HTMLCompilation.setBounds(0, 0, 900, 583);
		HtmlWorksFrame.getContentPane().add(HTMLCompilation);
	}

}
