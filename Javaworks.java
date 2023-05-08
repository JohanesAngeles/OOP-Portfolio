import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Javaworks {

	 JFrame JavaworksFrame;
	 private final JLabel javaworkscompilation = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Javaworks window = new Javaworks();
					window.JavaworksFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Javaworks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JavaworksFrame = new JFrame();
		JavaworksFrame.setBounds(100, 100, 912, 640);
		JavaworksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JavaworksFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				codesProgram codes = new codesProgram();
				codes.CodesProgramFrame.setVisible(true);
				JavaworksFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(Javaworks.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(795, 22, 15, 20);
		JavaworksFrame.getContentPane().add(returnButton);
		javaworkscompilation.setIcon(new ImageIcon(Javaworks.class.getResource("/image/javaworkscompilation.png")));
		javaworkscompilation.setBounds(0, 0, 908, 601);
		JavaworksFrame.getContentPane().add(javaworkscompilation);
	}

}
