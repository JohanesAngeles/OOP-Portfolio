import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OutsideIT {

	 JFrame OutsideITFrame;
	 private final JLabel outsideITCompilation = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OutsideIT window = new OutsideIT();
					window.OutsideITFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OutsideIT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		OutsideITFrame = new JFrame();
		OutsideITFrame.setBounds(100, 100, 914, 640);
		OutsideITFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OutsideITFrame.getContentPane().setLayout(null);
		
		JLabel returnButton = new JLabel("New label");
		returnButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Homepage home = new Homepage();
				home.HomepageFrame.setVisible(true);
				OutsideITFrame.dispose();
			}
		});
		returnButton.setIcon(new ImageIcon(OutsideIT.class.getResource("/image/returnButton.png")));
		returnButton.setBounds(824, 21, 15, 20);
		OutsideITFrame.getContentPane().add(returnButton);
		outsideITCompilation.setIcon(new ImageIcon(OutsideIT.class.getResource("/image/outsideITCompilation.png")));
		outsideITCompilation.setBounds(0, 0, 908, 601);
		OutsideITFrame.getContentPane().add(outsideITCompilation);
	}

}
