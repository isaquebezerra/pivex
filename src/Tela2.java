import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;


public class Tela2 {

	private JFrame frmJogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frmJogo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogo = new JFrame();
		frmJogo.setTitle("JOGO");
		frmJogo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959941_puzzle.png"));
		frmJogo.setBounds(100, 100, 535, 408);
		frmJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogo.getContentPane().setLayout(null);
	}

}
