import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class Tela0 {

	private JFrame frmJogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela0 window = new Tela0();
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
	public Tela0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogo = new JFrame();
		frmJogo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		frmJogo.setTitle("JOGO");
		frmJogo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959941_puzzle.png"));
		frmJogo.setBounds(100, 100, 535, 422);
		frmJogo.setLocationRelativeTo(null);
		frmJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogo.getContentPane().setLayout(null);

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		//

		JButton btnEscolher = new JButton("Aleat\u00F3rio");
		btnEscolher.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnEscolher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEscolher.setBounds(169, 215, 182, 53);
		frmJogo.getContentPane().add(btnEscolher);

		JButton button = new JButton("Escolher");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Tela1().getFrmJogo().setVisible(true);

				frmJogo.setVisible(false);
			}
		});
		button.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		button.setBounds(169, 151, 182, 53);
		frmJogo.getContentPane().add(button);

		JButton btnBaseadoEmErros = new JButton("Baseado em erros");
		btnBaseadoEmErros.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnBaseadoEmErros.setBounds(169, 279, 182, 53);
		frmJogo.getContentPane().add(btnBaseadoEmErros);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(88, 125, 342, 234);
		frmJogo.getContentPane().add(panel);

		JLabel lbladd = new JLabel("");
		lbladd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Tela3().getFrmJogo().setVisible(true);

				frmJogo.setVisible(false);
			}
		});
		lbladd.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1478558940_new-24.png"));
		lbladd.setBounds(188, 41, 64, 62);
		frmJogo.getContentPane().add(lbladd);

		JLabel lblconfig = new JLabel("");
		lblconfig.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959027_Settings.png"));
		lblconfig.setBounds(269, 41, 64, 62);
		frmJogo.getContentPane().add(lblconfig);
	}
}
