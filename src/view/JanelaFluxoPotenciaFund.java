package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JanelaFluxoPotenciaFund {

	private JFrame frmAprendaQEE;
	private JTextField textAmpV;
	private JTextField textAngV;
	private JTextField textAmpI;
	private JTextField textAngI;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFluxoPotenciaFund window = new JanelaFluxoPotenciaFund();
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
	public JanelaFluxoPotenciaFund() {
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
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(650, 500, 90, 25);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
			}
		});
		frmAprendaQEE.getContentPane().setLayout(null);
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Pot\u00EAncia Fundamental");
		lblFluxoPotFund.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFluxoPotFund.setBounds(251, 50, 281, 32);
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		frmAprendaQEE.getContentPane().add(lblFluxoPotFund);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
		JPanel panelTensao = new JPanel();
		panelTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTensao.setBounds(56, 120, 189, 83);
		frmAprendaQEE.getContentPane().add(panelTensao);
		panelTensao.setLayout(null);
		
		JLabel lblAmpV = new JLabel("Amplitude");
		lblAmpV.setBounds(6, 16, 70, 25);
		panelTensao.add(lblAmpV);
		lblAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAngV = new JLabel("\u00C2ngulo");
		lblAngV.setBounds(6, 52, 70, 25);
		panelTensao.add(lblAngV);
		lblAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textAmpV = new JTextField();
		textAmpV.setBounds(97, 18, 86, 20);
		panelTensao.add(textAmpV);
		textAmpV.setColumns(10);
		
		textAngV = new JTextField();
		textAngV.setBounds(97, 56, 86, 20);
		panelTensao.add(textAngV);
		textAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngV.setColumns(10);
		
		JPanel panelCorrente = new JPanel();
		panelCorrente.setLayout(null);
		panelCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelCorrente.setBounds(56, 228, 189, 83);
		frmAprendaQEE.getContentPane().add(panelCorrente);
		
		JLabel lblAmpI = new JLabel("Amplitude");
		lblAmpI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpI.setBounds(6, 16, 70, 25);
		panelCorrente.add(lblAmpI);
		
		JLabel lblAngI = new JLabel("\u00C2ngulo");
		lblAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngI.setBounds(6, 52, 70, 25);
		panelCorrente.add(lblAngI);
		
		textAmpI = new JTextField();
		textAmpI.setColumns(10);
		textAmpI.setBounds(97, 18, 86, 20);
		panelCorrente.add(textAmpI);
		
		textAngI = new JTextField();
		textAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngI.setColumns(10);
		textAngI.setBounds(97, 56, 86, 20);
		panelCorrente.add(textAngI);
	}
}
