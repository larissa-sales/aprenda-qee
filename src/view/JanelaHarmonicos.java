package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSlider;

public class JanelaHarmonicos {

	private JFrame frame;
	private JTextField textAmpH1;
	private JTextField textAngH1;
	private GraphPanel graficoHarm1;
	private GraphPanel graficoHarm2;
	private GraphPanel graficoHarm3;
	private GraphPanel graficoHarm4;
	private GraphPanel graficoHarm5;
	private GraphPanel graficoHarm6;
	private JTextField textOrdemH1;
	private JTextField textAmpH2;
	private JTextField textAngH2;
	private JTextField textOrdemH2;
	private JTextField textAmpH3;
	private JTextField textAngH3;
	private JTextField textOrdemH3;
	private JTextField textAmpH4;
	private JTextField textAngH4;
	private JTextField textOrdemH4;
	private JTextField textAmpH5;
	private JTextField textAngH5;
	private JTextField textOrdemH5;
	private JTextField textAmpH6;
	private JTextField textAngH6;
	private JTextField textOrdemH6;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaHarmonicos window = new JanelaHarmonicos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaHarmonicos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1024, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//harmonico 1
		
		JPanel panelH1 = new JPanel();
		panelH1.setLayout(null);
		panelH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH1.setBounds(38, 39, 163, 144);
		frame.getContentPane().add(panelH1);
		
		JLabel lblAmpH1 = new JLabel("Amplitude");
		lblAmpH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH1.setBounds(6, 17, 70, 25);
		panelH1.add(lblAmpH1);
		
		JLabel lblAngH1 = new JLabel("\u00C2ngulo");
		lblAngH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngH1.setBounds(6, 52, 70, 25);
		panelH1.add(lblAngH1);
		
		textAmpH1 = new JTextField();
		textAmpH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH1.setColumns(10);
		textAmpH1.setBounds(86, 18, 70, 22);
		panelH1.add(textAmpH1);
		
		textAngH1 = new JTextField();
		textAngH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH1.setColumns(10);
		textAngH1.setBounds(86, 53, 70, 22);
		panelH1.add(textAngH1);
		
		JPanel panelOrdemH1 = new JPanel();
		panelOrdemH1.setBounds(6, 88, 150, 50);
		panelH1.add(panelOrdemH1);
		panelOrdemH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH1.setLayout(null);
		
		JSlider sliderOrdemH1 = new JSlider();
		sliderOrdemH1.setBounds(10, 19, 66, 26);
		panelOrdemH1.add(sliderOrdemH1);
		
		textOrdemH1 = new JTextField();
		textOrdemH1.setBounds(86, 22, 54, 20);
		panelOrdemH1.add(textOrdemH1);
		textOrdemH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH1.setColumns(10);
		
		
		//grafico h1
		
		JPanel panelFormaOndaH1 = new JPanel();
		panelFormaOndaH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH1.setBounds(211, 39, 278, 144);
		frame.getContentPane().add(panelFormaOndaH1);
		panelFormaOndaH1.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm1 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH1.add(graficoHarm1);
		graficoHarm1.setBounds(6, 16, 315, 135);
		graficoHarm1.setLayout(null);
		
		
		//harmonico 2
		
		JPanel panelH2 = new JPanel();
		panelH2.setLayout(null);
		panelH2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH2.setBounds(38, 194, 163, 144);
		frame.getContentPane().add(panelH2);
		
		JLabel lblAmpH2 = new JLabel("Amplitude");
		lblAmpH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH2.setBounds(6, 17, 70, 25);
		panelH2.add(lblAmpH2);
		
		JLabel lblAngH2 = new JLabel("\u00C2ngulo");
		lblAngH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngH2.setBounds(6, 52, 70, 25);
		panelH2.add(lblAngH2);
		
		textAmpH2 = new JTextField();
		textAmpH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH2.setColumns(10);
		textAmpH2.setBounds(86, 18, 70, 22);
		panelH2.add(textAmpH2);
		
		textAngH2 = new JTextField();
		textAngH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH2.setColumns(10);
		textAngH2.setBounds(86, 53, 70, 22);
		panelH2.add(textAngH2);
		
		JPanel panelOrdemH2 = new JPanel();
		panelOrdemH2.setLayout(null);
		panelOrdemH2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH2.setBounds(6, 88, 150, 50);
		panelH2.add(panelOrdemH2);
		
		JSlider sliderOrdemH2 = new JSlider();
		sliderOrdemH2.setBounds(10, 19, 66, 26);
		panelOrdemH2.add(sliderOrdemH2);
		
		textOrdemH2 = new JTextField();
		textOrdemH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH2.setColumns(10);
		textOrdemH2.setBounds(86, 22, 54, 20);
		panelOrdemH2.add(textOrdemH2);
		
		
		//grafico h2
		
		JPanel panelFormaOndaH2 = new JPanel();
		panelFormaOndaH2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH2.setBounds(211, 194, 278, 144);
		frame.getContentPane().add(panelFormaOndaH2);
		panelFormaOndaH2.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm2 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH2.add(graficoHarm2);
		graficoHarm2.setBounds(6, 16, 315, 135);
		graficoHarm2.setLayout(null);
		
		
		//harmonico 3
		
		JPanel panelH3 = new JPanel();
		panelH3.setLayout(null);
		panelH3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 3", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH3.setBounds(38, 356, 163, 144);
		frame.getContentPane().add(panelH3);
		
		JLabel lblAmpH3 = new JLabel("Amplitude");
		lblAmpH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH3.setBounds(6, 17, 70, 25);
		panelH3.add(lblAmpH3);
		
		JLabel lblAngH3 = new JLabel("\u00C2ngulo");
		lblAngH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngH3.setBounds(6, 52, 70, 25);
		panelH3.add(lblAngH3);
		
		textAmpH3 = new JTextField();
		textAmpH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH3.setColumns(10);
		textAmpH3.setBounds(86, 18, 70, 22);
		panelH3.add(textAmpH3);
		
		textAngH3 = new JTextField();
		textAngH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH3.setColumns(10);
		textAngH3.setBounds(86, 53, 70, 22);
		panelH3.add(textAngH3);
		
		JPanel panelOrdemH3 = new JPanel();
		panelOrdemH3.setLayout(null);
		panelOrdemH3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH3.setBounds(6, 88, 150, 50);
		panelH3.add(panelOrdemH3);
		
		JSlider sliderOrdemH3 = new JSlider();
		sliderOrdemH3.setBounds(10, 19, 66, 26);
		panelOrdemH3.add(sliderOrdemH3);
		
		textOrdemH3 = new JTextField();
		textOrdemH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH3.setColumns(10);
		textOrdemH3.setBounds(86, 22, 54, 20);
		panelOrdemH3.add(textOrdemH3);
		
		//grafico h3
		
		JPanel panelFormaOndaH3 = new JPanel();
		panelFormaOndaH3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 3", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH3.setBounds(211, 356, 278, 144);
		frame.getContentPane().add(panelFormaOndaH3);
		panelFormaOndaH3.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm3 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH3.add(graficoHarm3);
		graficoHarm3.setBounds(6, 16, 315, 135);
		graficoHarm3.setLayout(null);
		
		//harmonico 4
		
		JPanel panelH4 = new JPanel();
		panelH4.setLayout(null);
		panelH4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 4", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH4.setBounds(512, 39, 163, 144);
		frame.getContentPane().add(panelH4);
		
		JLabel lblAmpH4 = new JLabel("Amplitude");
		lblAmpH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH4.setBounds(6, 17, 70, 25);
		panelH4.add(lblAmpH4);
		
		JLabel lblAngH4 = new JLabel("\u00C2ngulo");
		lblAngH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngH4.setBounds(6, 52, 70, 25);
		panelH4.add(lblAngH4);
		
		textAmpH4 = new JTextField();
		textAmpH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH4.setColumns(10);
		textAmpH4.setBounds(86, 18, 70, 22);
		panelH4.add(textAmpH4);
		
		textAngH4 = new JTextField();
		textAngH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH4.setColumns(10);
		textAngH4.setBounds(86, 53, 70, 22);
		panelH4.add(textAngH4);
		
		JPanel panelOrdemH4 = new JPanel();
		panelOrdemH4.setLayout(null);
		panelOrdemH4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH4.setBounds(6, 88, 150, 50);
		panelH4.add(panelOrdemH4);
		
		JSlider sliderOrdemH4 = new JSlider();
		sliderOrdemH4.setBounds(10, 19, 66, 26);
		panelOrdemH4.add(sliderOrdemH4);
		
		textOrdemH4 = new JTextField();
		textOrdemH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH4.setColumns(10);
		textOrdemH4.setBounds(86, 22, 54, 20);
		panelOrdemH4.add(textOrdemH4);
		
		
		//grafico h4
		
		JPanel panelFormaOndaH4 = new JPanel();
		panelFormaOndaH4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 4", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH4.setBounds(685, 39, 278, 144);
		frame.getContentPane().add(panelFormaOndaH4);
		panelFormaOndaH4.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm4 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH4.add(graficoHarm4);
		graficoHarm4.setBounds(6, 16, 315, 135);
		graficoHarm4.setLayout(null);
		
		
		//harmonico 5
		
		JPanel panelH5 = new JPanel();
		panelH5.setLayout(null);
		panelH5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 5", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH5.setBounds(512, 194, 163, 144);
		frame.getContentPane().add(panelH5);
		
		JLabel lblAmpH5 = new JLabel("Amplitude");
		lblAmpH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH5.setBounds(6, 17, 70, 25);
		panelH5.add(lblAmpH5);
		
		JLabel lblAngH5 = new JLabel("\u00C2ngulo");
		lblAngH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngH5.setBounds(6, 52, 70, 25);
		panelH5.add(lblAngH5);
		
		textAmpH5 = new JTextField();
		textAmpH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH5.setColumns(10);
		textAmpH5.setBounds(86, 18, 70, 22);
		panelH5.add(textAmpH5);
		
		textAngH5 = new JTextField();
		textAngH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH5.setColumns(10);
		textAngH5.setBounds(86, 53, 70, 22);
		panelH5.add(textAngH5);
		
		JPanel panelOrdemH5 = new JPanel();
		panelOrdemH5.setLayout(null);
		panelOrdemH5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH5.setBounds(6, 88, 150, 50);
		panelH5.add(panelOrdemH5);
		
		JSlider sliderOrdemH5 = new JSlider();
		sliderOrdemH5.setBounds(10, 19, 66, 26);
		panelOrdemH5.add(sliderOrdemH5);
		
		textOrdemH5 = new JTextField();
		textOrdemH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH5.setColumns(10);
		textOrdemH5.setBounds(86, 22, 54, 20);
		panelOrdemH5.add(textOrdemH5);
		
		
		//grafico h5
		
		JPanel panelFormaOndaH5 = new JPanel();
		panelFormaOndaH5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 5", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH5.setBounds(685, 194, 278, 144);
		frame.getContentPane().add(panelFormaOndaH5);
		panelFormaOndaH5.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm5 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH5.add(graficoHarm5);
		graficoHarm5.setBounds(6, 16, 315, 135);
		graficoHarm5.setLayout(null);
		
		
		//harmonico 6
		
		JPanel panelOrdemH6 = new JPanel();
		panelOrdemH6.setLayout(null);
		panelOrdemH6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 6", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH6.setBounds(512, 356, 163, 144);
		frame.getContentPane().add(panelOrdemH6);
		
		JLabel lblAmpH6 = new JLabel("Amplitude");
		lblAmpH6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmpH6.setBounds(6, 17, 70, 25);
		panelOrdemH6.add(lblAmpH6);
		
		JLabel lblAng6 = new JLabel("\u00C2ngulo");
		lblAng6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAng6.setBounds(6, 52, 70, 25);
		panelOrdemH6.add(lblAng6);
		
		textAmpH6 = new JTextField();
		textAmpH6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAmpH6.setColumns(10);
		textAmpH6.setBounds(86, 18, 70, 22);
		panelOrdemH6.add(textAmpH6);
		
		textAngH6 = new JTextField();
		textAngH6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textAngH6.setColumns(10);
		textAngH6.setBounds(86, 53, 70, 22);
		panelOrdemH6.add(textAngH6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ordem Harm\u00F4nica", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(6, 88, 150, 50);
		panelOrdemH6.add(panel_9);
		
		JSlider sliderOrdemH6 = new JSlider();
		sliderOrdemH6.setBounds(10, 19, 66, 26);
		panel_9.add(sliderOrdemH6);
		
		textOrdemH6 = new JTextField();
		textOrdemH6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH6.setColumns(10);
		textOrdemH6.setBounds(86, 22, 54, 20);
		panel_9.add(textOrdemH6);
		
		//grafico h6
		
		JPanel panelFormaOndaH6 = new JPanel();
		panelFormaOndaH6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 6", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH6.setBounds(685, 356, 278, 144);
		frame.getContentPane().add(panelFormaOndaH6);
		panelFormaOndaH6.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoHarm6 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH6.add(graficoHarm6);
		graficoHarm6.setBounds(6, 16, 315, 135);
		graficoHarm6.setLayout(null);
	}

}
