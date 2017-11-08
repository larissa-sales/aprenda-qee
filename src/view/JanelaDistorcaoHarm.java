package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class JanelaDistorcaoHarm {

	private JFrame frmAprendaQEE;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaDistorcaoHarm window = new JanelaDistorcaoHarm();
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
	public JanelaDistorcaoHarm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAprendaQEE = new JFrame();
		frmAprendaQEE.setResizable(false);
		frmAprendaQEE.setTitle("Aprenda QEE");
		frmAprendaQEE.setSize(1024, 700);
		frmAprendaQEE.setLocationRelativeTo(null);
		frmAprendaQEE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAprendaQEE.getContentPane().setLayout(null);
		
		JLabel lblDistHarmonica = new JLabel("Distor\u00E7\u00E3o Harm\u00F4nica");
		lblDistHarmonica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDistHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistHarmonica.setBounds(359, 30, 290, 20);
		frmAprendaQEE.getContentPane().add(lblDistHarmonica);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
			}
		});
		btnVoltar.setBounds(880, 600, 90, 25);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
		JRadioButton rdbtnPar = new JRadioButton("Par");
		buttonGroup.add(rdbtnPar);
		rdbtnPar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnPar.setBounds(64, 389, 78, 23);
		frmAprendaQEE.getContentPane().add(rdbtnPar);
		
		JRadioButton rdbtnImpar = new JRadioButton("\u00CDmpar");
		buttonGroup.add(rdbtnImpar);
		rdbtnImpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnImpar.setBounds(64, 417, 78, 23);
		frmAprendaQEE.getContentPane().add(rdbtnImpar);
	}
}
