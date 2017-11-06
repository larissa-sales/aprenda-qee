package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaFluxoPotenciaFund {

	private JFrame frmAprenderQee;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFluxoPotenciaFund window = new JanelaFluxoPotenciaFund();
					window.frmAprenderQee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaFluxoPotenciaFund() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAprenderQee = new JFrame();
		frmAprenderQee.setTitle("Aprender QEE");
		frmAprenderQee.setBounds(100, 100, 800, 600);
		frmAprenderQee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAprenderQee.getContentPane().setLayout(null);
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Potência Fundamental");
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoPotFund.setBounds(80, 30, 290, 20);
		frmAprenderQee.getContentPane().add(lblFluxoPotFund);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprenderQee.dispose();				
			}
		});
		btnVoltar.setBounds(303, 225, 117, 25);
		frmAprenderQee.getContentPane().add(btnVoltar);
	}
}
