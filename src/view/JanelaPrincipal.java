package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Frame;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Aprenda QEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaUmaSimulao = new JLabel("Escolha uma simula\u00E7\u00E3o:");
		lblEscolhaUmaSimulao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEscolhaUmaSimulao.setBounds(97, 52, 290, 25);
		lblEscolhaUmaSimulao.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEscolhaUmaSimulao);
		
		JButton btnDistorcaoHarmonica = new JButton("Distor\u00E7\u00E3o Harm\u00F4nica");
		btnDistorcaoHarmonica.setBounds(127, 206, 230, 25);
		btnDistorcaoHarmonica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaDistorcaoHarm janela = new JanelaDistorcaoHarm();
				janela.NewScreen();
			}
		});
		
		JButton btnPotenciaFundamental = new JButton("Fluxo de Pot\u00EAncia Fundamental");
		btnPotenciaFundamental.setBounds(127, 129, 230, 25);
		btnPotenciaFundamental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaFluxoPotenciaFund janela = new JanelaFluxoPotenciaFund();
				janela.NewScreen();
			}
		});
		contentPane.add(btnPotenciaFundamental);
		contentPane.add(btnDistorcaoHarmonica);
		
		JButton btnPotenciaHarmonica = new JButton("Fluxo de Pot\u00EAncia Harm\u00F4nica");
		btnPotenciaHarmonica.setBounds(127, 283, 230, 25);
		btnPotenciaHarmonica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JanelaFluxoPotenciaHarm janela = new JanelaFluxoPotenciaHarm();
				janela.NewScreen();
			}
		});
		contentPane.add(btnPotenciaHarmonica);
		
	}
	

}
