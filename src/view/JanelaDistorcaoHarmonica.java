package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JanelaDistorcaoHarmonica {

	private JFrame frmAprenderQee;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDistorcaoHarmonica window = new JanelaDistorcaoHarmonica();
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
	public JanelaDistorcaoHarmonica() {
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
		
		JLabel lblDistHarmonica = new JLabel("Distorção Harmônica");
		lblDistHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistHarmonica.setBounds(80, 30, 290, 20);
		frmAprenderQee.getContentPane().add(lblDistHarmonica);
		
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
