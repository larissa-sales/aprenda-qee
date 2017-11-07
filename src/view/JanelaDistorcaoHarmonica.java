package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class JanelaDistorcaoHarmonica {

	private JFrame frmAprendaQEE;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDistorcaoHarmonica window = new JanelaDistorcaoHarmonica();
					window.frmAprendaQEE.setVisible(true);
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
		frmAprendaQEE = new JFrame();
		frmAprendaQEE.setTitle("Aprenda QEE");
		frmAprendaQEE.setSize(800, 600);
		frmAprendaQEE.setLocationRelativeTo(null);
		frmAprendaQEE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAprendaQEE.getContentPane().setLayout(null);
		
		JLabel lblDistHarmonica = new JLabel("Distor\u00E7\u00E3o Harm\u00F4nica");
		lblDistHarmonica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDistHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistHarmonica.setBounds(247, 30, 290, 20);
		frmAprendaQEE.getContentPane().add(lblDistHarmonica);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
			}
		});
		btnVoltar.setBounds(650, 500, 90, 25);
		frmAprendaQEE.getContentPane().add(btnVoltar);
	}
}
