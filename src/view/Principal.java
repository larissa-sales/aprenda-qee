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

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Aprenda QEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPotenciaFundamental = new JButton("Fluxo de Potência Fundamental");
		btnPotenciaFundamental.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FluxoPotenciaFund test = new FluxoPotenciaFund();
				test.NewScreen();
			}
		});
		btnPotenciaFundamental.setBounds(90, 88, 270, 25);
		contentPane.add(btnPotenciaFundamental);
		
		JButton btnDistorcaoHarmonica = new JButton("Distorção Harmônica");
		btnDistorcaoHarmonica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DistorcaoHarmonica test = new DistorcaoHarmonica();
				test.NewScreen();
			}
		});
		btnDistorcaoHarmonica.setBounds(90, 128, 270, 25);
		contentPane.add(btnDistorcaoHarmonica);
		
		JButton btnPotenciaHarmonica = new JButton("Fluxo de Potência Harmônica");
		btnPotenciaHarmonica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FluxoPotenciaHarmonico test = new FluxoPotenciaHarmonico();
				test.NewScreen();
			}
		});
		btnPotenciaHarmonica.setBounds(90, 168, 270, 25);
		contentPane.add(btnPotenciaHarmonica);
		
		JLabel lblEscolhaUmaSimulao = new JLabel("Escolha uma simulação");
		lblEscolhaUmaSimulao.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaUmaSimulao.setBounds(90, 48, 270, 25);
		contentPane.add(lblEscolhaUmaSimulao);
		
	}
	
	
}
