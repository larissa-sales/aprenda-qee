package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JanelaFluxoPotenciaHarm {

	private JFrame frmAprendaQEE;
	private JTextField textAmpV;
	private JTextField textAngV;
	private JTextField textAmpI;
	private JTextField textAngI;
	private GraphPanel graficoTensao;
	private GraphPanel graficoCorrente;
	private GraphPanel graficoPotHarmInst;
	private JTextField textPotLiq;
	private JTextField textPotDist;
	private JTextField textTpf;
	
	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFluxoPotenciaHarm window = new JanelaFluxoPotenciaHarm();
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
	public JanelaFluxoPotenciaHarm() {
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
		textAmpV.setBounds(97, 18, 86, 22);
		panelTensao.add(textAmpV);
		
		textAngV = new JTextField();
		textAngV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngV.setColumns(10);
		textAngV.setBounds(97, 53, 86, 22);
		panelTensao.add(textAngV);
		
		JPanel panelCorrente = new JPanel();
		panelCorrente.setLayout(null);
		panelCorrente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Corrente", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelCorrente.setBounds(56, 207, 189, 121);
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
		
		JLabel lblOrdemH1 = new JLabel("Ordem Harm\u00F4nica");
		lblOrdemH1.setBounds(6, 88, 130, 25);
		panelCorrente.add(lblOrdemH1);
		lblOrdemH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSpinner spinnerOrdemHarm = new JSpinner();
		spinnerOrdemHarm.setModel(new SpinnerNumberModel(0, 0, 6, 1));
		spinnerOrdemHarm.setBounds(126, 87, 57, 25);
		panelCorrente.add(spinnerOrdemHarm);
		spinnerOrdemHarm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSimular.setBounds(56, 345, 90, 25);
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
