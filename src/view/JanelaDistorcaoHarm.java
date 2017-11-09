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
import java.util.List;
import java.awt.FlowLayout;

public class JanelaDistorcaoHarm {

	private JFrame frmAprendaQEE;
	private GraphPanel graficoHarm1;
	private GraphPanel graficoHarm2;
	private GraphPanel graficoHarm3;
	private GraphPanel graficoHarm4;
	private GraphPanel graficoHarm5;
	private GraphPanel graficoHarm6;
	private GraphPanel graficoFund;
	private GraphPanel graficoDistRes;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textAmpH1;
	private JTextField textAngH1;
	private JTextField textFourier;

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
		panelBordaOrdem.setBounds(59, 91, 90, 88);
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
		panelBordaGraficoFund.setBounds(284, 91, 450, 171);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoFund);
		panelBordaGraficoFund.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoFund = new GraphPanel(new ArrayList<>());
		FlowLayout flowLayout = (FlowLayout) graficoFund.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		graficoFund.setBounds(6, 16, 315, 135);
		panelBordaGraficoFund.add(graficoFund);
		
		JPanel panelNHarm = new JPanel();
		panelNHarm.setBounds(59, 190, 167, 25);
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
		btnSimular.setBounds(59, 226, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		JPanel panelH1 = new JPanel();
		panelH1.setLayout(null);
		panelH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH1.setBounds(59, 291, 189, 121);
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
		lblOrdemH1.setBounds(6, 88, 130, 25);
		panelH1.add(lblOrdemH1);
		lblOrdemH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSpinner spinnerOrdemHarm = new JSpinner();
		spinnerOrdemHarm.setBounds(126, 85, 57, 25);
		panelH1.add(spinnerOrdemHarm);
		spinnerOrdemHarm.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		spinnerOrdemHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panelOndaH1 = new JPanel();
		panelOndaH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOndaH1.setBounds(284, 291, 450, 171);
		frmAprendaQEE.getContentPane().add(panelOndaH1);
		panelOndaH1.setLayout(new GridLayout(0, 1, 0, 0));
				
		graficoHarm1 = new GraphPanel(new ArrayList<>());
		graficoHarm1.setBounds(10, 21, 323, 125);
		panelOndaH1.add(graficoHarm1);
		
		JPanel panelDistRes = new JPanel();
		panelDistRes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Distorcida Resultante", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelDistRes.setBounds(59, 481, 415, 157);
		frmAprendaQEE.getContentPane().add(panelDistRes);
		panelDistRes.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoDistRes = new GraphPanel(new ArrayList<>());
		panelDistRes.add(graficoDistRes);
		
		JPanel panelFourier = new JPanel();
		panelFourier.setBounds(484, 494, 395, 47);
		frmAprendaQEE.getContentPane().add(panelFourier);
		panelFourier.setLayout(null);
		
		JLabel lblFourier = new JLabel("Fourier");
		lblFourier.setBounds(0, 0, 70, 25);
		panelFourier.add(lblFourier);
		lblFourier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFourier = new JTextField();
		textFourier.setBounds(0, 25, 395, 22);
		panelFourier.add(textFourier);
		textFourier.setEditable(false);
		textFourier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFourier.setColumns(10);
	}
}
