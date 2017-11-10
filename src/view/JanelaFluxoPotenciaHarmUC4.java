package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CalculosUC2;
import controller.CalculosUC4;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JanelaFluxoPotenciaHarmUC4 {

	private JFrame frmAprendaQEE;
	private JTextField textAmpV;
	private JTextField textAngV;
	private JTextField textAmpI;
	private JTextField textAngI;
	private JSpinner spinnerOrdemH;
	private GraphPanel graficoTensao;
	private GraphPanel graficoCorrente;
	private GraphPanel graficoPotHarmInst;
	private CalculosUC4 calculosUC4;
	private JTextField textPotLiq;
	private JTextField textPotDist;
	private JTextField textTpf;
	private JTextField textOH;
	
	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFluxoPotenciaHarmUC4 window = new JanelaFluxoPotenciaHarmUC4();
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
	public JanelaFluxoPotenciaHarmUC4() {
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
		calculosUC4 = new CalculosUC4();
		
		JLabel lblFluxoPotHarmonico = new JLabel("Fluxo de Pot\u00EAncia Harm\u00F4nico");
		lblFluxoPotHarmonico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFluxoPotHarmonico.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoPotHarmonico.setBounds(359, 50, 330, 25);
		frmAprendaQEE.getContentPane().add(lblFluxoPotHarmonico);
		
		JPanel panelTensao = new JPanel();
		panelTensao.setLayout(null);
		panelTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTensao.setBounds(56, 108, 189, 83);
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
		
		JPanel panelCorrente = new JPanel();
		panelCorrente.setLayout(null);
		panelCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelCorrente.setBounds(56, 207, 189, 135);
		frmAprendaQEE.getContentPane().add(panelCorrente);
		
		JLabel lblAmpI = new JLabel("Amplitude");
		lblAmpI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpI.setBounds(6, 17, 70, 25);
		panelCorrente.add(lblAmpI);
		
		JLabel lblAngI = new JLabel("\u00C2ngulo");
		lblAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngI.setBounds(6, 52, 70, 25);
		panelCorrente.add(lblAngI);
		
		textAmpI = new JTextField();
		textAmpI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpI.setColumns(10);
		textAmpI.setBounds(97, 18, 82, 22);
		panelCorrente.add(textAmpI);
		
		textAngI = new JTextField();
		textAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngI.setColumns(10);
		textAngI.setBounds(97, 54, 82, 22);
		panelCorrente.add(textAngI);
		
		JSlider sliderOH = new JSlider();
		textOH = new JTextField();
		textOH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOH.getText()) <= sliderOH.getMaximum()) {
						if(Integer.parseInt(textOH.getText()) >= sliderOH.getMinimum()) {
							sliderOH.setValue(Integer.parseInt(textOH.getText()));
						}
						else {
							textOH.setText("0");
							sliderOH.setValue(0);
						}
					}
					else {
						textOH.setText("0");
						sliderOH.setValue(0);					
					}
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor deve ser numérico", "Erro!", JOptionPane.ERROR_MESSAGE);
				}

				catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Valor não informado", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		JPanel panelOrdemH = new JPanel();
		panelOrdemH.setBounds(6, 87, 177, 48);
		panelCorrente.add(panelOrdemH);
		panelOrdemH.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelOrdemH.setLayout(null);
		
		
		sliderOH.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOH.setText(Integer.toString(sliderOH.getValue()));
			}
		});
		sliderOH.setValue(0);
		sliderOH.setMaximum(15);
		sliderOH.setBounds(6, 16, 107, 26);
		panelOrdemH.add(sliderOH);
		
		textOH.setBounds(120, 18, 47, 22);
		panelOrdemH.add(textOH);
		textOH.setColumns(10);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calculosUC4.setAmpV(Double.parseDouble(textAmpV.getText()));
					calculosUC4.setAngV(Double.parseDouble(textAngV.getText()));
					calculosUC4.setAmpI(Double.parseDouble(textAmpI.getText()));
					calculosUC4.setAngI(Double.parseDouble(textAngI.getText()));
					calculosUC4.setOrdemH(sliderOH.getValue());
					calculosUC4.calcular();
					textPotLiq.setText(String.format("%.2f", calculosUC4.getPotLiq()));
					textPotDist.setText(String.format("%.2f", calculosUC4.getPotDist()));
					textTpf.setText(String.format("%.2f", calculosUC4.getTpf()));
					graficoTensao.setScores(calculosUC4.getFormaOndaTensaoFund());
					graficoCorrente.setScores(calculosUC4.getFormaOndaCorrenteHarm());
					graficoPotHarmInst.setScores(calculosUC4.getFormaOndaPotHarmInst());
										
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
		btnSimular.setBounds(56, 364, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		JPanel panelBordaGraficoTensao = new JPanel();
		panelBordaGraficoTensao.setBounds(255, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoTensao);
		panelBordaGraficoTensao.setBorder(new TitledBorder(null, "Tens\u00E3o Fundamental (V)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panelBordaGraficoTensao.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoTensao = new GraphPanel(new ArrayList<>());
		panelBordaGraficoTensao.add(graficoTensao);
		
		JPanel panelBordaGraficoCorrente = new JPanel();
		panelBordaGraficoCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente Harm\u00F4nica (I)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoCorrente.setBounds(609, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoCorrente);
		panelBordaGraficoCorrente.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoCorrente = new GraphPanel(new ArrayList<>());
		panelBordaGraficoCorrente.add(graficoCorrente);
		
		JPanel panelDados = new JPanel();
		panelDados.setLayout(null);
		panelDados.setBounds(56, 400, 330, 101);
		frmAprendaQEE.getContentPane().add(panelDados);
		
		JLabel lblPotLiq = new JLabel("Pot\u00EAncia L\u00EDquida");
		lblPotLiq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPotLiq.setBounds(0, 0, 130, 25);
		panelDados.add(lblPotLiq);
		
		JLabel lblWatt = new JLabel("Watt");
		lblWatt.setBounds(241, 1, 46, 22);
		panelDados.add(lblWatt);
		
		JLabel lblPotDist = new JLabel("Pot\u00EAncia de Distor\u00E7\u00E3o");
		lblPotDist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPotDist.setBounds(0, 36, 142, 25);
		panelDados.add(lblPotDist);
		
		JLabel lblTpf = new JLabel("TPF");
		lblTpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTpf.setBounds(0, 72, 130, 25);
		panelDados.add(lblTpf);
		
		textPotLiq = new JTextField();
		textPotLiq.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPotLiq.setEditable(false);
		textPotLiq.setColumns(10);
		textPotLiq.setBounds(152, 2, 86, 20);
		panelDados.add(textPotLiq);
		
		textPotDist = new JTextField();
		textPotDist.setText("");
		textPotDist.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPotDist.setEditable(false);
		textPotDist.setColumns(10);
		textPotDist.setBounds(152, 40, 86, 20);
		panelDados.add(textPotDist);
		
		textTpf = new JTextField();
		textTpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textTpf.setEditable(false);
		textTpf.setColumns(10);
		textTpf.setBounds(152, 77, 86, 20);
		panelDados.add(textTpf);
		
		JLabel lblVoltAmpre = new JLabel("Volt - Amp\u00E9re");
		lblVoltAmpre.setBounds(241, 39, 82, 22);
		panelDados.add(lblVoltAmpre);
		
		JPanel panelBordaGraficoPotHarmInst = new JPanel();
		panelBordaGraficoPotHarmInst.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pot\u00EAncia Harm\u00F4nica Instant\u00E2nea", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoPotHarmInst.setBounds(403, 349, 550, 203);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoPotHarmInst);
		panelBordaGraficoPotHarmInst.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoPotHarmInst = new GraphPanel(new ArrayList<>());
		panelBordaGraficoPotHarmInst.add(graficoPotHarmInst);
		
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
