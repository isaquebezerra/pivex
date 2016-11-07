import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Tela3 {

	private JFrame frmJogo;
	private JTextField textFieldP;
	private JTextField textFieldR;
	private JLabel lblok;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 window = new Tela3();
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
	public Tela3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogo = new JFrame();
		frmJogo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959941_puzzle.png"));
		frmJogo.setTitle("JOGO");
		frmJogo.setBounds(100, 100, 534, 422);
		frmJogo.setLocationRelativeTo(null);
		frmJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogo.getContentPane().setLayout(null);
		
		JLabel lblPergunta = new JLabel("Pergunta:");
		lblPergunta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblPergunta.setBounds(138, 112, 92, 25);
		frmJogo.getContentPane().add(lblPergunta);
		
		JLabel lblResposta = new JLabel("Resposta:");
		lblResposta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblResposta.setBounds(138, 158, 92, 25);
		frmJogo.getContentPane().add(lblResposta);
		
		textFieldP = new JTextField();
		textFieldP.setBounds(224, 118, 160, 20);
		frmJogo.getContentPane().add(textFieldP);
		textFieldP.setColumns(10);
		
		textFieldR = new JTextField();
		textFieldR.setColumns(10);
		textFieldR.setBounds(224, 164, 160, 20);
		frmJogo.getContentPane().add(textFieldR);
		
		JLabel lblx = new JLabel("");
		lblx.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//voltar para a tela anterior?
			}
		});
		lblx.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959656_No.png"));
		lblx.setBounds(177, 256, 64, 47);
		frmJogo.getContentPane().add(lblx);
		
		lblok = new JLabel("");
		lblok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//add pergunta e resposta no BD
			}
		});
		lblok.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477961194_Ok.png"));
		lblok.setBounds(284, 250, 64, 53);
		frmJogo.getContentPane().add(lblok);
		
		panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panel.setBounds(82, 77, 358, 151);
		frmJogo.getContentPane().add(panel);
	}

	public JFrame getFrmJogo() {
		return frmJogo;
	}

	public void setFrmJogo(JFrame frmJogo) {
		this.frmJogo = frmJogo;
		}
	
		public JTextField getTextFieldP() {
			return textFieldP;
		}
	
		public void setTextFieldP(JTextField textFieldP) {
			this.textFieldP = textFieldP;
		}
	
		public JTextField getTextFieldR() {
			return textFieldR;
		}
	
		public void setTextFieldR(JTextField textFieldR) {
			this.textFieldR = textFieldR;
		}
	
		public JLabel getLblok() {
			return lblok;
		}
	
		public void setLblok(JLabel lblok) {
			this.lblok = lblok;
		}
	
		public JPanel getPanel() {
			return panel;
		}
	
		public void setPanel(JPanel panel) {
			this.panel = panel;
		}
	
		
}
