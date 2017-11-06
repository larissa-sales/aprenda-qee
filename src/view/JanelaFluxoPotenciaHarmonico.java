package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FluxoPotenciaHarmonico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FluxoPotenciaHarmonico window = new FluxoPotenciaHarmonico();
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
	public FluxoPotenciaHarmonico() {
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
		
		JLabel lblFluxoPotHarmonico = new JLabel("Fluxo de Potência Harmônico");
		lblFluxoPotHarmonico.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoPotHarmonico.setBounds(80, 30, 290, 20);
		frame.getContentPane().add(lblFluxoPotHarmonico);
		
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
