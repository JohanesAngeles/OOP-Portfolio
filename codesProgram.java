import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class codesProgram {

	JFrame CodesProgramFrame;
	private final JLabel JavaworksButton = new JLabel("");
	private final JLabel HTMLWorksButton = new JLabel("");
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					codesProgram window = new codesProgram();
					window.CodesProgramFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public codesProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CodesProgramFrame = new JFrame();
		CodesProgramFrame.setBounds(100, 100, 900, 600);
		CodesProgramFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CodesProgramFrame.getContentPane().setLayout(null);
		
		HTMLWorksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Htmlworks html = new Htmlworks();
				html.HtmlWorksFrame.setVisible(true);
				CodesProgramFrame.dispose();
			} 
		});
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Homepage homepage = new Homepage();
				homepage.HomepageFrame.setVisible(true);
				CodesProgramFrame.dispose();
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(codesProgram.class.getResource("/image/returnButton.png")));
		lblNewLabel.setBounds(115, 464, 15, 20);
		
		CodesProgramFrame.getContentPane().add(lblNewLabel);
		HTMLWorksButton.setIcon(new ImageIcon(codesProgram.class.getResource("/image/htmlworksbutton.png")));
		HTMLWorksButton.setBounds(589, 290, 194, 194);
		
		CodesProgramFrame.getContentPane().add(HTMLWorksButton);
		JavaworksButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Javaworks java = new Javaworks();
				java.JavaworksFrame.setVisible(true);
				CodesProgramFrame.dispose();
				
			}
		});
		JavaworksButton.setIcon(new ImageIcon(codesProgram.class.getResource("/image/javaworksbutton.png")));
		JavaworksButton.setBounds(299, 290, 194, 194);
		
		CodesProgramFrame.getContentPane().add(JavaworksButton);
		
		JLabel CodesBackground = new JLabel("");
		CodesBackground.setIcon(new ImageIcon(codesProgram.class.getResource("/image/codesbg.png")));
		CodesBackground.setBounds(0, 0, 884, 561);
		CodesProgramFrame.getContentPane().add(CodesBackground);
	}

}
