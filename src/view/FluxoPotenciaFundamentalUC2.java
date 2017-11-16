package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CalculosUC2;

import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class FluxoPotenciaFundamentalUC2 {

	private JFrame frmAprendaQEE;
	private JTextField textAmpV;
	private JTextField textAngV;
	private JTextField textAmpI;
	private JTextField textAngI;
	private GraphPanel graficoTensao;
	private GraphPanel graficoCorrente;
	private GraphPanel graficoPotInst;
	private CalculosUC2 calculosUC2;
	private JTextField textPotAt;
	private JTextField textPotRt;
	private JTextField textPotAp;
	private JTextField textFatorPot;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FluxoPotenciaFundamentalUC2 window = new FluxoPotenciaFundamentalUC2();
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
	public FluxoPotenciaFundamentalUC2() {
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
		calculosUC2 = new CalculosUC2();
		
		//título janela
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Pot\u00EAncia Fundamental");
		lblFluxoPotFund.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFluxoPotFund.setBounds(344, 50, 320, 32);
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		frmAprendaQEE.getContentPane().add(lblFluxoPotFund);
		
		//painel de tensao
		
		JPanel panelTensao = new JPanel();
		panelTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTensao.setBounds(56, 108, 189, 83);
		frmAprendaQEE.getContentPane().add(panelTensao);
		panelTensao.setLayout(null);
		
		JLabel lblAmpV = new JLabel("Amplitude");
		lblAmpV.setBounds(6, 17, 70, 25);
		panelTensao.add(lblAmpV);
		lblAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAngV = new JLabel("\u00C2ngulo");
		lblAngV.setBounds(6, 52, 70, 25);
		panelTensao.add(lblAngV);
		lblAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textAmpV = new JTextField();
		textAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpV.setBounds(97, 18, 86, 22);
		panelTensao.add(textAmpV);
		textAmpV.setColumns(10);
		
		textAngV = new JTextField();
		textAngV.setBounds(97, 53, 86, 22);
		panelTensao.add(textAngV);
		textAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngV.setColumns(10);
		
		
		//painel de corrente
		
		JPanel panelCorrente = new JPanel();
		panelCorrente.setLayout(null);
		panelCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelCorrente.setBounds(56, 207, 189, 83);
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
		textAmpI.setBounds(97, 18, 86, 22);
		panelCorrente.add(textAmpI);
		
		textAngI = new JTextField();
		textAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngI.setColumns(10);
		textAngI.setBounds(97, 54, 86, 22);
		panelCorrente.add(textAngI);
		
		
		//grafico de tensão
		
		JPanel panelBordaGraficoTensao = new JPanel();
		panelBordaGraficoTensao.setBounds(255, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoTensao);
		panelBordaGraficoTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o (V)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoTensao = new GraphPanel(new ArrayList<>());
		panelBordaGraficoTensao.add(graficoTensao);
		
		
		//grafico de corrente
		
		JPanel panelBordaGraficoCorrente = new JPanel();
		panelBordaGraficoCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente (I)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoCorrente.setBounds(609, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoCorrente);
		panelBordaGraficoCorrente.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoCorrente = new GraphPanel(new ArrayList<>());
		panelBordaGraficoCorrente.add(graficoCorrente);
		
		
		//botão simular
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calculosUC2.setAmpV(Double.parseDouble(textAmpV.getText()));
					calculosUC2.setAngV(Double.parseDouble(textAngV.getText()));
					calculosUC2.setAmpI(Double.parseDouble(textAmpI.getText()));
					calculosUC2.setAngI(Double.parseDouble(textAngI.getText()));
					calculosUC2.calcular();
					textPotAt.setText(String.format("%.2f", calculosUC2.getPotAtiva()));
					textPotRt.setText(String.format("%.2f", calculosUC2.getPotReativa()));
					textPotAp.setText(String.format("%.2f", calculosUC2.getPotAparente()));
					textFatorPot.setText(String.format("%.2f", calculosUC2.getFatorPot()));
					graficoTensao.setScores(calculosUC2.getFormaOndaTensao());
					graficoCorrente.setScores(calculosUC2.getFormaOndaCorrente());
					graficoPotInst.setScores(calculosUC2.getFormaOndaPotInst());
					
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
		btnSimular.setBounds(56, 301, 90, 25);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		//painel dados de saida
		
		JPanel panelDados = new JPanel();
		panelDados.setBounds(56, 379, 278, 133);
		frmAprendaQEE.getContentPane().add(panelDados);
		panelDados.setLayout(null);
		
		JLabel lblPotAtiva = new JLabel("Pot\u00EAncia Ativa");
		lblPotAtiva.setBounds(0, 0, 130, 25);
		panelDados.add(lblPotAtiva);
		lblPotAtiva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblWatt = new JLabel("Watt");
		lblWatt.setBounds(226, 1, 46, 22);
		panelDados.add(lblWatt);
		
		JLabel lblPotReativa = new JLabel("Pot\u00EAncia Reativa");
		lblPotReativa.setBounds(0, 36, 130, 25);
		panelDados.add(lblPotReativa);
		lblPotReativa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblVar = new JLabel("VAR");
		lblVar.setBounds(226, 39, 38, 22);
		panelDados.add(lblVar);
		
		JLabel lblPotAparente = new JLabel("Pot\u00EAncia Aparente");
		lblPotAparente.setBounds(0, 72, 130, 25);
		panelDados.add(lblPotAparente);
		lblPotAparente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblVa = new JLabel("VA");
		lblVa.setBounds(226, 76, 38, 22);
		panelDados.add(lblVa);
		
		JLabel lblFatorPot = new JLabel("Fator de Pot\u00EAncia");
		lblFatorPot.setBounds(0, 108, 130, 25);
		panelDados.add(lblFatorPot);
		lblFatorPot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textPotAt = new JTextField();
		textPotAt.setEditable(false);
		textPotAt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPotAt.setBounds(136, 2, 86, 20);
		panelDados.add(textPotAt);
		textPotAt.setColumns(10);
		
		textPotRt = new JTextField();
		textPotRt.setEditable(false);
		textPotRt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPotRt.setBounds(136, 40, 86, 20);
		panelDados.add(textPotRt);
		textPotRt.setText("");
		textPotRt.setColumns(10);
		
		textPotAp = new JTextField();
		textPotAp.setEditable(false);
		textPotAp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textPotAp.setBounds(136, 77, 86, 20);
		panelDados.add(textPotAp);
		textPotAp.setColumns(10);
		
		textFatorPot = new JTextField();
		textFatorPot.setEditable(false);
		textFatorPot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFatorPot.setBounds(136, 112, 86, 20);
		panelDados.add(textFatorPot);
		textFatorPot.setColumns(10);
		
		
		//grafico potencia instantanea
		
		JPanel panelBordaGraficoPotInst = new JPanel();
		panelBordaGraficoPotInst.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Potência Instantânea", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoPotInst.setBounds(344, 344, 344, 203);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoPotInst);
		panelBordaGraficoPotInst.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoPotInst = new GraphPanel(new ArrayList<>());
		panelBordaGraficoPotInst.add(graficoPotInst);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVoltar.setBounds(880, 600, 90, 25);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();			
			}
		});
		
		frmAprendaQEE.getContentPane().add(btnVoltar);
	}
}
