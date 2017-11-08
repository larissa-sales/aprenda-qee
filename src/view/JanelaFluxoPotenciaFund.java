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
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.CalculosUC2;

import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JanelaFluxoPotenciaFund {

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
		frmAprendaQEE.setResizable(false);
		frmAprendaQEE.setTitle("Aprenda QEE");
		frmAprendaQEE.setSize(1024, 700);
		frmAprendaQEE.setLocationRelativeTo(null);
		frmAprendaQEE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		calculosUC2 = new CalculosUC2();
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(880, 600, 90, 25);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();			
			}
		});
		frmAprendaQEE.getContentPane().setLayout(null);
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Pot\u00EAncia Fundamental");
		lblFluxoPotFund.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFluxoPotFund.setBounds(344, 50, 320, 32);
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		frmAprendaQEE.getContentPane().add(lblFluxoPotFund);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
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
		
		JPanel panelBordaGraficoCorrente = new JPanel();
		panelBordaGraficoCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente (I)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoCorrente.setBounds(609, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoCorrente);
		panelBordaGraficoCorrente.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoCorrente = new GraphPanel(new ArrayList<>());
		panelBordaGraficoCorrente.add(graficoCorrente);
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					calculosUC2.setAmpV(Double.parseDouble(textAmpV.getText()));
					calculosUC2.setAngV(Double.parseDouble(textAngV.getText()));
					calculosUC2.setAmpI(Double.parseDouble(textAmpI.getText()));
					calculosUC2.setAngI(Double.parseDouble(textAngI.getText()));
				}catch(IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSimular.setBounds(56, 301, 89, 23);
		frmAprendaQEE.getContentPane().add(btnSimular);
		
		JPanel panelBordaGraficoPotInst = new JPanel();
		panelBordaGraficoPotInst.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Potência Instantânea", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoPotInst.setBounds(313, 337, 344, 203);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoPotInst);
		panelBordaGraficoPotInst.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoPotInst = new GraphPanel(new ArrayList<>());
		panelBordaGraficoPotInst.add(graficoPotInst);
		
		JPanel panelBordaGraficoTensao = new JPanel();
		panelBordaGraficoTensao.setBounds(255, 108, 344, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoTensao);
		panelBordaGraficoTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o (V)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoTensao = new GraphPanel(new ArrayList<>());
		panelBordaGraficoTensao.add(graficoTensao);
		
		JLabel lblPotnciaAtiva = new JLabel("Pot\u00EAncia Ativa");
		lblPotnciaAtiva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPotnciaAtiva.setBounds(56, 379, 130, 25);
		frmAprendaQEE.getContentPane().add(lblPotnciaAtiva);
		
		JLabel lblPotnciaReativa = new JLabel("Pot\u00EAncia Reativa");
		lblPotnciaReativa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPotnciaReativa.setBounds(56, 415, 130, 25);
		frmAprendaQEE.getContentPane().add(lblPotnciaReativa);
		
		JLabel lblPotnciaAparente = new JLabel("Pot\u00EAncia Aparente");
		lblPotnciaAparente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPotnciaAparente.setBounds(56, 451, 130, 25);
		frmAprendaQEE.getContentPane().add(lblPotnciaAparente);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Pot\u00EAncia");
		lblFatorDePotncia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFatorDePotncia.setBounds(56, 487, 130, 25);
		frmAprendaQEE.getContentPane().add(lblFatorDePotncia);
		
		textPotAt = new JTextField();
		textPotAt.setBounds(192, 381, 86, 20);
		frmAprendaQEE.getContentPane().add(textPotAt);
		textPotAt.setColumns(10);
		
		textPotRt = new JTextField();
		textPotRt.setText("");
		textPotRt.setBounds(192, 419, 86, 20);
		frmAprendaQEE.getContentPane().add(textPotRt);
		textPotRt.setColumns(10);
		
		textPotAp = new JTextField();
		textPotAp.setBounds(192, 456, 86, 20);
		frmAprendaQEE.getContentPane().add(textPotAp);
		textPotAp.setColumns(10);
		
		textFatorPot = new JTextField();
		textFatorPot.setBounds(192, 491, 86, 20);
		frmAprendaQEE.getContentPane().add(textFatorPot);
		textFatorPot.setColumns(10);
	}
}
