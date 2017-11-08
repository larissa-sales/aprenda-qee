package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;

public class JanelaDistorcaoHarm {

	private JFrame frmAprendaQEE;
	private GraphPanel graficoHarm1;
	private GraphPanel graficoHarm2;
	private GraphPanel graficoHarm3;
	private GraphPanel graficoHarm4;
	private GraphPanel graficoHarm5;
	private GraphPanel graficoHarm6;
	private GraphPanel graficoFund;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAmpH1;
	private JTextField textAngH1;

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
		lblDistHarmonica.setBounds(359, 50, 290, 30);
		frmAprendaQEE.getContentPane().add(lblDistHarmonica);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
			}
		});
		btnVoltar.setBounds(880, 600, 90, 25);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
		JPanel panelBordaOrdem = new JPanel();
		panelBordaOrdem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nicos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaOrdem.setBounds(38, 91, 90, 88);
		frmAprendaQEE.getContentPane().add(panelBordaOrdem);
		panelBordaOrdem.setLayout(null);
		
		JRadioButton rdbtnPar = new JRadioButton("Par");
		rdbtnPar.setBounds(6, 24, 78, 23);
		panelBordaOrdem.add(rdbtnPar);
		buttonGroup.add(rdbtnPar);
		rdbtnPar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnImpar = new JRadioButton("\u00CDmpar");
		rdbtnImpar.setBounds(6, 52, 78, 23);
		panelBordaOrdem.add(rdbtnImpar);
		buttonGroup.add(rdbtnImpar);
		rdbtnImpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panelBordaGraficoFund = new JPanel();
		panelBordaGraficoFund.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Fundamental", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoFund.setBounds(263, 91, 327, 157);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoFund);
		panelBordaGraficoFund.setLayout(null);
		
		graficoFund = new GraphPanel(new ArrayList<>());
		graficoFund.setBounds(6, 16, 315, 135);
		panelBordaGraficoFund.add(graficoFund);
		
		JPanel panelNHarm = new JPanel();
		panelNHarm.setBounds(38, 190, 167, 25);
		frmAprendaQEE.getContentPane().add(panelNHarm);
		panelNHarm.setLayout(null);
		
		JSpinner spinnerNHarm = new JSpinner();
		spinnerNHarm.setBounds(110, 0, 57, 25);
		panelNHarm.add(spinnerNHarm);
		spinnerNHarm.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		spinnerNHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNHarmnicos = new JLabel("N\u00BA Harm\u00F4nicos");
		lblNHarmnicos.setBounds(0, 0, 100, 25);
		panelNHarm.add(lblNHarmnicos);
		lblNHarmnicos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimular.setBounds(38, 238, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(38, 304, 189, 88);
		frmAprendaQEE.getContentPane().add(panel);
		
		JLabel label = new JLabel("Amplitude");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(6, 17, 70, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u00C2ngulo");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(6, 52, 70, 25);
		panel.add(label_1);
		
		textAmpH1 = new JTextField();
		textAmpH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH1.setColumns(10);
		textAmpH1.setBounds(97, 18, 86, 22);
		panel.add(textAmpH1);
		
		textAngH1 = new JTextField();
		textAngH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH1.setColumns(10);
		textAngH1.setBounds(97, 53, 86, 22);
		panel.add(textAngH1);
	}
}
