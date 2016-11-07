import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JComboBox;

import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Tela1 {

	private JFrame frmJogo;
	private Tela0 tela0 = new Tela0();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
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
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogo = new JFrame();
		frmJogo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477959941_puzzle.png"));
		frmJogo.setTitle("JOGO");
		frmJogo.setBounds(100, 100, 516, 422);
		frmJogo.setLocationRelativeTo(null);
		frmJogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogo.getContentPane().setLayout(null);
		
		JComboBox comboBoxAssunto = new JComboBox();
		comboBoxAssunto.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		comboBoxAssunto.setModel(new DefaultComboBoxModel(new String[] {"Assunto"}));
		comboBoxAssunto.setBounds(173, 49, 149, 50);
		frmJogo.getContentPane().add(comboBoxAssunto);
		
		JComboBox comboBoxArea = new JComboBox();
		comboBoxArea.setModel(new DefaultComboBoxModel(new String[] {"\u00C1rea"}));
		comboBoxArea.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		comboBoxArea.setBounds(173, 121, 149, 50);
		frmJogo.getContentPane().add(comboBoxArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Qtd Quest\u00F5es", "05", "10", "15", "20", "25", "30"}));
		comboBox.setBounds(173, 193, 149, 50);
		frmJogo.getContentPane().add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(88, 28, 326, 238);
		frmJogo.getContentPane().add(panel);
		
		JLabel lblplay = new JLabel("");
		lblplay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//direciona para as perguntas de acordo com a qtd escolhida//
			}
		});
		lblplay.setIcon(new ImageIcon("C:\\Users\\CarolSilva\\Documents\\eclipse\\Jogo\\img\\1477961202_Play.png"));
		lblplay.setBounds(220, 281, 64, 64);
		frmJogo.getContentPane().add(lblplay);
	}

	public JFrame getFrmJogo() {
		return frmJogo;
	}

	public void setFrmJogo(JFrame frmJogo) {
		this.frmJogo = frmJogo;
	}

}
