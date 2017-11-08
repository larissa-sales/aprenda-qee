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
		frmAprendaQEE.setSize(1024, 768);
		frmAprendaQEE.setLocationRelativeTo(null);
		frmAprendaQEE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		calculosUC2 = new CalculosUC2();
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(880, 670, 90, 25);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {						
				frmAprendaQEE.dispose();			
			}
		});
		frmAprendaQEE.getContentPane().setLayout(null);
		
		JLabel lblFluxoPotFund = new JLabel("Fluxo de Pot\u00EAncia Fundamental");
		lblFluxoPotFund.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFluxoPotFund.setBounds(363, 50, 281, 32);
		lblFluxoPotFund.setHorizontalAlignment(SwingConstants.CENTER);
		frmAprendaQEE.getContentPane().add(lblFluxoPotFund);
		frmAprendaQEE.getContentPane().add(btnVoltar);
		
		JPanel panelTensao = new JPanel();
		panelTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelTensao.setBounds(56, 108, 189, 83);
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
		textAmpV.setFont(new Font("Tahoma", Font.PLAIN, 14));
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
		panelCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelCorrente.setBounds(56, 207, 189, 83);
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
		textAmpI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpI.setColumns(10);
		textAmpI.setBounds(97, 18, 86, 20);
		panelCorrente.add(textAmpI);
		
		textAngI = new JTextField();
		textAngI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngI.setColumns(10);
		textAngI.setBounds(97, 56, 86, 20);
		panelCorrente.add(textAngI);
		
		JPanel panelBordaGraficoTensao = new JPanel();
		panelBordaGraficoTensao.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tens\u00E3o (V)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoTensao.setBounds(303, 108, 320, 182);
		frmAprendaQEE.getContentPane().add(panelBordaGraficoTensao);
		panelBordaGraficoTensao.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoTensao = new GraphPanel(new ArrayList<>());
		panelBordaGraficoTensao.add(graficoTensao);
		
		JPanel panelBordaGraficoCorrente = new JPanel();
		panelBordaGraficoCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente (I)", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelBordaGraficoCorrente.setBounds(650, 108, 320, 182);
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
		
		JPanel panelGraficoPotInst = new JPanel();
		panelGraficoPotInst.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Potência Instantânea", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelGraficoPotInst.setBounds(303, 328, 320, 182);
		frmAprendaQEE.getContentPane().add(panelGraficoPotInst);
		panelGraficoPotInst.setLayout(new GridLayout(1, 0, 0, 0));
		
		graficoPotInst = new GraphPanel(new ArrayList<>());
		panelGraficoPotInst.add(graficoPotInst);
	}
}
