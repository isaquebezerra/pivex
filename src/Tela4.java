import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Tela4 {

	private JFrame frmJogo;
	private JTextField textFieldResp;
	private JTextField textFieldRespIdeal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela4 window = new Tela4();
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
	public Tela4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogo = new JFrame();
		frmJogo.setTitle("JOGO");
		frmJogo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959941_puzzle.png"));
		frmJogo.setBounds(100, 100, 535, 422);
		frmJogo.setLocationRelativeTo(null);
		frmJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogo.getContentPane().setLayout(null);
		
		JLabel lblResposta = new JLabel("Sua Resposta:");
		lblResposta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblResposta.setBounds(103, 163, 120, 25);
		frmJogo.getContentPane().add(lblResposta);
		
		textFieldResp = new JTextField();
		textFieldResp.setBounds(228, 169, 155, 20);
		frmJogo.getContentPane().add(textFieldResp);
		textFieldResp.setColumns(10);
		
		JLabel lblIdentifiqueSeA = new JLabel("Identifique se a resposta dever\u00E1 ser considerada ou n\u00E3o:");
		lblIdentifiqueSeA.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblIdentifiqueSeA.setBounds(83, 75, 351, 25);
		frmJogo.getContentPane().add(lblIdentifiqueSeA);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// considerar resposta como incorreta
			}
		});
		label.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959979_No.png"));
		label.setBounds(174, 238, 64, 58);
		frmJogo.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// considerar resposta como correta
			}
		});
		label_1.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477961194_Ok.png"));
		label_1.setBounds(268, 238, 64, 58);
		frmJogo.getContentPane().add(label_1);
		
		JLabel lblRespostaIdeal = new JLabel("Resposta Ideal:");
		lblRespostaIdeal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRespostaIdeal.setBounds(103, 126, 120, 25);
		frmJogo.getContentPane().add(lblRespostaIdeal);
		
		textFieldRespIdeal = new JTextField();
		textFieldRespIdeal.setBounds(228, 132, 155, 20);
		frmJogo.getContentPane().add(textFieldRespIdeal);
		textFieldRespIdeal.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(60, 61, 393, 166);
		frmJogo.getContentPane().add(panel);
	}

		public JFrame getFrmJogo() {
			return frmJogo;
		}
	
		public void setFrmJogo(JFrame frmJogo) {
			this.frmJogo = frmJogo;
		}
	
		public JTextField getTextFieldResp() {
			return textFieldResp;
		}
	
		public void setTextFieldResp(JTextField textFieldResp) {
			this.textFieldResp = textFieldResp;
		}
	
		public JTextField getTextFieldRespIdeal() {
			return textFieldRespIdeal;
		}
	
		public void setTextFieldRespIdeal(JTextField textFieldRespIdeal) {
			this.textFieldRespIdeal = textFieldRespIdeal;
		}
	
		
}
