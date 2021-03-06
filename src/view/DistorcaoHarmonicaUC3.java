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

import controller.CalculosUC3;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class DistorcaoHarmonicaUC3 {
	private final ButtonGroup buttonGroupHarm = new ButtonGroup();
	
	private JFrame frmAprendaQEE;
	private GraphPanel graficoFund;
	private GraphPanel graficoDistRes;
	private CalculosUC3 calculosUC3;
	private JTextField textAmpV;
	private JTextField textAngV;
	private JTextField textNumHarm;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistorcaoHarmonicaUC3 window = new DistorcaoHarmonicaUC3();
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
	public DistorcaoHarmonicaUC3() {
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
		frmAprendaQEE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAprendaQEE.getContentPane().setLayout(null);		
		calculosUC3 = new CalculosUC3();
		
		
		//botao que recebe valores de ordem harmonica
		
		JButton btnSimular2 = new JButton("Simular");
		btnSimular2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimular2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculosUC3.calcular();
				graficoDistRes.setScores(calculosUC3.setFormaOndaDistRes());
			}
		});
		
		
		//titulo janela
		
		JLabel lblDistHarmonica = new JLabel("Distor\u00E7\u00E3o Harm\u00F4nica");
		lblDistHarmonica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDistHarmonica.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistHarmonica.setBounds(359, 40, 290, 30);
		frmAprendaQEE.getContentPane().add(lblDistHarmonica);
		
		
		//entradas painel tensao
		
		JPanel panelTensao = new JPanel();
		panelTensao.setLayout(null);
		panelTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTensao.setBounds(148, 96, 189, 83);
		frmAprendaQEE.getContentPane().add(panelTensao);
		
		JLabel lblAmpV = new JLabel("Amplitude");
		lblAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpV.setBounds(6, 17, 70, 25);
		panelTensao.add(lblAmpV);
		
		JLabel lblAngV = new JLabel("\u00C2ngulo");
		lblAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngV.setBounds(6, 52, 70, 25);
		panelTensao.add(lblAngV);
		
		textAmpV = new JTextField();
		textAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpV.setColumns(10);
		textAmpV.setBounds(97, 18, 82, 22);
		panelTensao.add(textAmpV);
		
		textAngV = new JTextField();
		textAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngV.setColumns(10);
		textAngV.setBounds(97, 53, 82, 22);
		panelTensao.add(textAngV);
		
		//botao simular
		
		JButton btnSimular = new JButton("Simular");
		JButton btnSimularH = new JButton("Definir Harm\u00F4nicos");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calculosUC3.setAmpV(Double.parseDouble(textAmpV.getText()));
					calculosUC3.setAngV(Double.parseDouble(textAngV.getText()));
					calculosUC3.calcular();
					graficoFund.setScores(calculosUC3.getFormaOndaFund());
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor deve ser num�rico", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor n�o informado", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
				btnSimularH.setEnabled(true);
			}
		});
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimular.setBounds(148, 190, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		
		//grafico fundamental
		
		JPanel panelBordaGraficoFund = new JPanel();
		panelBordaGraficoFund.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Fundamental", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoFund.setBounds(373, 96, 450, 170);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoFund);
		panelBordaGraficoFund.setLayout(new GridLayout(0, 1, 0, 0));
					
		graficoFund = new GraphPanel(new ArrayList<>());
		panelBordaGraficoFund.add(graficoFund);
		graficoFund.setBounds(6, 16, 315, 135);
		graficoFund.setLayout(null);
		
		
		//painel numero harmonicos
				
		JPanel panelNumHarm = new JPanel();
		panelNumHarm.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "N\u00FAmero Harm\u00F4nico", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelNumHarm.setBounds(148, 366, 158, 59);
		frmAprendaQEE.getContentPane().add(panelNumHarm);
		panelNumHarm.setLayout(null);		
				
		JSlider sliderNumHarm = new JSlider();
		textNumHarm = new JTextField();
		textNumHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNumHarm.setBounds(95, 24, 50, 22);
		textNumHarm.setColumns(10);
		textNumHarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textNumHarm.getText()) <= sliderNumHarm.getMaximum()) {
						if(Integer.parseInt(textNumHarm.getText()) >= sliderNumHarm.getMinimum()) {
							sliderNumHarm.setValue(Integer.parseInt(textNumHarm.getText()));
						}
						else {
							textNumHarm.setText("0");
							sliderNumHarm.setValue(0);
						}
					}
					else {
						textNumHarm.setText("0");
						sliderNumHarm.setValue(0);					
					}
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor deve ser num�rico", "Erro!", JOptionPane.ERROR_MESSAGE);
				}

				catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor n�o informado", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JPanel panelBordaOrdem = new JPanel();
		panelBordaOrdem.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nicos", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaOrdem.setBounds(148, 296, 158, 59);
		frmAprendaQEE.getContentPane().add(panelBordaOrdem);
		panelBordaOrdem.setLayout(null);
		
		sliderNumHarm.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textNumHarm.setText(Integer.toString(sliderNumHarm.getValue()));
			}
		});
		sliderNumHarm.setValue(0);
		sliderNumHarm.setMaximum(6);
		sliderNumHarm.setBounds(6, 22, 79, 26);
		
		panelNumHarm.add(sliderNumHarm);		
		panelNumHarm.add(textNumHarm);
				
		JRadioButton rdbtnPar = new JRadioButton("Par");
		rdbtnPar.setBounds(12, 24, 66, 23);
		panelBordaOrdem.add(rdbtnPar);
		buttonGroupHarm.add(rdbtnPar);
		rdbtnPar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnImpar = new JRadioButton("\u00CDmpar");
		rdbtnImpar.setBounds(74, 24, 75, 23);
		panelBordaOrdem.add(rdbtnImpar);
		buttonGroupHarm.add(rdbtnImpar);
		rdbtnImpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		//botao simular harmonicos
		
		btnSimularH.setEnabled(false);
		btnSimularH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculosUC3.setNumHarm(Integer.parseInt(textNumHarm.getText()));
				calculosUC3.setIsHarmPar(rdbtnPar.isSelected());
				calculosUC3.calcular();
				Harmonicos janela = new Harmonicos(calculosUC3);
				janela.NewScreen(calculosUC3);
				btnSimular2.setEnabled(true);
			}
		});
		btnSimularH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimularH.setBounds(148, 444, 158, 25);
		frmAprendaQEE.getContentPane().add(btnSimularH);
		
		
		//grafico distorcida resultante
		
		JPanel panelDistRes = new JPanel();
		panelDistRes.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Distorcida Resultante", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelDistRes.setBounds(373, 304, 450, 170);
		frmAprendaQEE.getContentPane().add(panelDistRes);
		panelDistRes.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoDistRes = new GraphPanel(new ArrayList<>());
		panelDistRes.add(graficoDistRes);
		
		JPanel panelFourier = new JPanel();
		panelFourier.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "S\u00E9rie de Fourier", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFourier.setBounds(373, 496, 450, 88);
		frmAprendaQEE.getContentPane().add(panelFourier);
		panelFourier.setLayout(null);
		
		JTextArea txtrFourier = new JTextArea();
		txtrFourier.setEditable(false);
		txtrFourier.setBounds(10, 22, 430, 55);
		panelFourier.add(txtrFourier);
		txtrFourier.setLineWrap(true);
		
		
		//botao voltar
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();				
				JanelaPrincipalUC1 janela = new JanelaPrincipalUC1();
				janela.setVisible(true);
			}
		});
		btnVoltar.setBounds(880, 600, 90, 25);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
		btnSimular2.setEnabled(false);
		btnSimular2.setBounds(150, 509, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular2);
	}
}
