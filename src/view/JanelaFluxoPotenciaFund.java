package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FluxoPotenciaFund {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FluxoPotenciaFund window = new FluxoPotenciaFund();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FluxoPotenciaFund() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Potência Fundamental");
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoPotFund.setBounds(80, 30, 290, 20);
		frame.getContentPane().add(lblFluxoPotFund);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frame.setVisible(false);				
			}
		});
		btnVoltar.setBounds(303, 225, 117, 25);
		frame.getContentPane().add(btnVoltar);
	}
}
