package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CalculosUC2;
import controller.CalculosUC3;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import java.util.List;
import java.awt.FlowLayout;
import javax.swing.JTextArea;

public class JanelaDistorcaoHarm {

	private JFrame frmAprendaQEE;
	private GraphPanel graficoFund;
	private GraphPanel graficoHarm1;
	private GraphPanel graficoHarm2;
	private GraphPanel graficoHarm3;
	private GraphPanel graficoHarm4;
	private GraphPanel graficoHarm5;
	private GraphPanel graficoHarm6;
	private GraphPanel graficoDistRes;
	private final ButtonGroup buttonGroupHarm = new ButtonGroup();
	private JTextField textAmpH1;
	private JTextField textAngH1;
	private CalculosUC3 calculosUC3;

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
		calculosUC3 = new CalculosUC3();
		
		JLabel lblDistHarmonica = new JLabel("Distor\u00E7\u00E3o Harm\u00F4nica");
		lblDistHarmonica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDistHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistHarmonica.setBounds(359, 40, 290, 30);
		frmAprendaQEE.getContentPane().add(lblDistHarmonica);
		
		JPanel panelBordaOrdem = new JPanel();
		panelBordaOrdem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nicos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaOrdem.setBounds(148, 91, 90, 88);
		frmAprendaQEE.getContentPane().add(panelBordaOrdem);
		panelBordaOrdem.setLayout(null);
		
		JRadioButton rdbtnPar = new JRadioButton("Par");
		rdbtnPar.setBounds(6, 24, 78, 23);
		panelBordaOrdem.add(rdbtnPar);
		buttonGroupHarm.add(rdbtnPar);
		rdbtnPar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnImpar = new JRadioButton("\u00CDmpar");
		rdbtnImpar.setBounds(6, 52, 78, 23);
		panelBordaOrdem.add(rdbtnImpar);
		buttonGroupHarm.add(rdbtnImpar);
		rdbtnImpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panelNHarm = new JPanel();
		panelNHarm.setBounds(148, 190, 167, 25);
		frmAprendaQEE.getContentPane().add(panelNHarm);
		panelNHarm.setLayout(null);
		
		JSpinner spinnerNumHarm = new JSpinner();
		spinnerNumHarm.setBounds(110, 0, 57, 25);
		panelNHarm.add(spinnerNumHarm);
		spinnerNumHarm.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		spinnerNumHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNHarmnicos = new JLabel("N\u00BA Harm\u00F4nicos");
		lblNHarmnicos.setBounds(0, 0, 100, 25);
		panelNHarm.add(lblNHarmnicos);
		lblNHarmnicos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//calculosUC3.setIsHarmPar(isHarmPar);
					//calculosUC3.setNumHarm((Integer)spinnerNumHarm.getValue());
					graficoFund.setScores(calculosUC3.getFormaOndaFund());
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor deve ser numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor não informado", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimular.setBounds(148, 226, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		JPanel panelBordaGraficoFund = new JPanel();
		panelBordaGraficoFund.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Fundamental", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoFund.setBounds(373, 91, 450, 170);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoFund);
		panelBordaGraficoFund.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoFund = new GraphPanel(new ArrayList<>());
		FlowLayout flowLayout = (FlowLayout) graficoFund.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		graficoFund.setBounds(6, 16, 315, 135);
		panelBordaGraficoFund.add(graficoFund);
		
		JPanel panelH1 = new JPanel();
		panelH1.setLayout(null);
		panelH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH1.setBounds(148, 285, 189, 121);
		frmAprendaQEE.getContentPane().add(panelH1);
		
		JLabel labelAmpH1 = new JLabel("Amplitude");
		labelAmpH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAmpH1.setBounds(6, 17, 70, 25);
		panelH1.add(labelAmpH1);
		
		JLabel labelAngH1 = new JLabel("\u00C2ngulo");
		labelAngH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelAngH1.setBounds(6, 52, 70, 25);
		panelH1.add(labelAngH1);
		
		textAmpH1 = new JTextField();
		textAmpH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH1.setColumns(10);
		textAmpH1.setBounds(97, 18, 86, 22);
		panelH1.add(textAmpH1);
		
		textAngH1 = new JTextField();
		textAngH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH1.setColumns(10);
		textAngH1.setBounds(97, 53, 86, 22);
		panelH1.add(textAngH1);
		
		JLabel lblOrdemH1 = new JLabel("Ordem Harm\u00F4nica");
		lblOrdemH1.setBounds(6, 85, 130, 25);
		panelH1.add(lblOrdemH1);
		lblOrdemH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSpinner spinnerOrdemHarm = new JSpinner();
		spinnerOrdemHarm.setBounds(126, 85, 57, 25);
		panelH1.add(spinnerOrdemHarm);
		spinnerOrdemHarm.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		spinnerOrdemHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSimularH = new JButton("Simular");
		btnSimularH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimularH.setBounds(149, 417, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimularH);
		
		JPanel panelOndaH1 = new JPanel();
		panelOndaH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOndaH1.setBounds(373, 285, 450, 170);
		frmAprendaQEE.getContentPane().add(panelOndaH1);
		panelOndaH1.setLayout(new GridLayout(0, 1, 0, 0));
				
		graficoHarm1 = new GraphPanel(new ArrayList<>());
		graficoHarm1.setBounds(10, 21, 323, 125);
		panelOndaH1.add(graficoHarm1);
		
		JPanel panelDistRes = new JPanel();
		panelDistRes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Distorcida Resultante", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelDistRes.setBounds(65, 473, 415, 170);
		frmAprendaQEE.getContentPane().add(panelDistRes);
		panelDistRes.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoDistRes = new GraphPanel(new ArrayList<>());
		panelDistRes.add(graficoDistRes);
		
		JPanel panelFourier = new JPanel();
		panelFourier.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S\u00E9rie de Fourier", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFourier.setBounds(490, 473, 431, 88);
		frmAprendaQEE.getContentPane().add(panelFourier);
		panelFourier.setLayout(null);
		
		JTextArea txtrFourier = new JTextArea();
		txtrFourier.setEditable(false);
		txtrFourier.setBounds(10, 22, 411, 55);
		panelFourier.add(txtrFourier);
		txtrFourier.setLineWrap(true);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
			}
		});
		btnVoltar.setBounds(880, 600, 90, 25);
		frmAprendaQEE.getContentPane().add(btnVoltar);
	}
}
