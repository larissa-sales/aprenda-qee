package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

import controller.CalculosUC3;

import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JanelaHarmonicos {

	private JFrame frmHarm;
	private CalculosUC3 calculosHarm;
	private JTextField textAmpH1;
	private JTextField textAngH1;
	private GraphPanel graficoH1;
	private GraphPanel graficoH2;
	private GraphPanel graficoH3;
	private GraphPanel graficoH4;
	private GraphPanel graficoH5;
	private GraphPanel graficoH6;
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
	public void NewScreen(CalculosUC3 calculosUC3) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaHarmonicos window = new JanelaHarmonicos(calculosUC3);
					window.frmHarm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public JanelaHarmonicos(CalculosUC3 calculosUC3) {
		this.calculosHarm = calculosUC3;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHarm = new JFrame();
		frmHarm.setResizable(false);
		frmHarm.setSize(1024, 700);
		frmHarm.setLocationRelativeTo(null);
		frmHarm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmHarm.getContentPane().setLayout(null);
		
		JLabel lblHarmnicos = new JLabel("Harm\u00F4nicos");
		lblHarmnicos.setHorizontalAlignment(SwingConstants.CENTER);
		lblHarmnicos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHarmnicos.setBounds(397, 40, 214, 25);
		frmHarm.getContentPane().add(lblHarmnicos);
		
		//harmonico 1
		
		JPanel panelH1 = new JPanel();
		panelH1.setLayout(null);
		panelH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH1.setBounds(39, 103, 163, 144);
		frmHarm.getContentPane().add(panelH1);
		
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
		sliderOrdemH1.setMaximum(15);
		sliderOrdemH1.setValue(0);
		sliderOrdemH1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH1.setText(Integer.toString(sliderOrdemH1.getValue()));
			}
		});
		sliderOrdemH1.setBounds(10, 19, 66, 26);
		
		textOrdemH1 = new JTextField();
		textOrdemH1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH1.setBounds(86, 22, 54, 20);
		textOrdemH1.setColumns(10);
		textOrdemH1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH1.getText()) <= sliderOrdemH1.getMaximum()) {
						if(Integer.parseInt(textOrdemH1.getText()) >= sliderOrdemH1.getMinimum()) {
							sliderOrdemH1.setValue(Integer.parseInt(textOrdemH1.getText()));
						}
						else {
							textOrdemH1.setText("0");
							sliderOrdemH1.setValue(0);
						}
					}
					else {
						textOrdemH1.setText("0");
						sliderOrdemH1.setValue(0);					
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
		
		panelOrdemH1.add(sliderOrdemH1);		
		panelOrdemH1.add(textOrdemH1);
		
		
		//grafico h1
		
		JPanel panelFormaOndaH1 = new JPanel();
		panelFormaOndaH1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 1", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH1.setBounds(212, 103, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH1);
		panelFormaOndaH1.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH1 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH1.add(graficoH1);
		graficoH1.setBounds(6, 16, 315, 135);
		graficoH1.setLayout(null);
		
		
		//harmonico 2
		
		JPanel panelH2 = new JPanel();
		panelH2.setLayout(null);
		panelH2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH2.setBounds(39, 258, 163, 144);
		frmHarm.getContentPane().add(panelH2);
		
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
		sliderOrdemH2.setMaximum(15);
		sliderOrdemH2.setValue(0);
		sliderOrdemH2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH2.setText(Integer.toString(sliderOrdemH2.getValue()));
			}
		});
		sliderOrdemH2.setBounds(10, 19, 66, 26);
		panelOrdemH2.add(sliderOrdemH2);
		
		textOrdemH2 = new JTextField();
		textOrdemH2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH2.getText()) <= sliderOrdemH2.getMaximum()) {
						if(Integer.parseInt(textOrdemH2.getText()) >= sliderOrdemH2.getMinimum()) {
							sliderOrdemH2.setValue(Integer.parseInt(textOrdemH2.getText()));
						}
						else {
							textOrdemH2.setText("0");
							sliderOrdemH2.setValue(0);
						}
					}
					else {
						textOrdemH2.setText("0");
						sliderOrdemH2.setValue(0);					
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
		textOrdemH2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH2.setColumns(10);
		textOrdemH2.setBounds(86, 22, 54, 20);
		panelOrdemH2.add(textOrdemH2);
		
		
		//grafico h2
		
		JPanel panelFormaOndaH2 = new JPanel();
		panelFormaOndaH2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 2", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH2.setBounds(212, 258, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH2);
		panelFormaOndaH2.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH2 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH2.add(graficoH2);
		graficoH2.setBounds(6, 16, 315, 135);
		graficoH2.setLayout(null);
		
		
		//harmonico 3
		
		JPanel panelH3 = new JPanel();
		panelH3.setLayout(null);
		panelH3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 3", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH3.setBounds(39, 420, 163, 144);
		frmHarm.getContentPane().add(panelH3);
		
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
		sliderOrdemH3.setValue(0);
		sliderOrdemH3.setMaximum(15);
		sliderOrdemH3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH3.setText(Integer.toString(sliderOrdemH3.getValue()));
			}
		});		
		sliderOrdemH3.setBounds(10, 19, 66, 26);
		panelOrdemH3.add(sliderOrdemH3);
		
		textOrdemH3 = new JTextField();
		textOrdemH3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH3.getText()) <= sliderOrdemH3.getMaximum()) {
						if(Integer.parseInt(textOrdemH3.getText()) >= sliderOrdemH3.getMinimum()) {
							sliderOrdemH3.setValue(Integer.parseInt(textOrdemH3.getText()));
						}
						else {
							textOrdemH3.setText("0");
							sliderOrdemH3.setValue(0);
						}
					}
					else {
						textOrdemH3.setText("0");
						sliderOrdemH3.setValue(0);					
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
		textOrdemH3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH3.setColumns(10);
		textOrdemH3.setBounds(86, 22, 54, 20);
		panelOrdemH3.add(textOrdemH3);
		
		//grafico h3
		
		JPanel panelFormaOndaH3 = new JPanel();
		panelFormaOndaH3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 3", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH3.setBounds(212, 420, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH3);
		panelFormaOndaH3.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH3 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH3.add(graficoH3);
		graficoH3.setBounds(6, 16, 315, 135);
		graficoH3.setLayout(null);
		
		//harmonico 4
		
		JPanel panelH4 = new JPanel();
		panelH4.setLayout(null);
		panelH4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 4", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH4.setBounds(511, 103, 163, 144);
		frmHarm.getContentPane().add(panelH4);
		
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
		sliderOrdemH4.setValue(0);
		sliderOrdemH4.setMaximum(15);
		sliderOrdemH4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH4.setText(Integer.toString(sliderOrdemH4.getValue()));
			}
		});
		sliderOrdemH4.setBounds(10, 19, 66, 26);
		panelOrdemH4.add(sliderOrdemH4);
		
		textOrdemH4 = new JTextField();
		textOrdemH4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH4.getText()) <= sliderOrdemH4.getMaximum()) {
						if(Integer.parseInt(textOrdemH4.getText()) >= sliderOrdemH4.getMinimum()) {
							sliderOrdemH4.setValue(Integer.parseInt(textOrdemH4.getText()));
						}
						else {
							textOrdemH4.setText("0");
							sliderOrdemH4.setValue(0);
						}
					}
					else {
						textOrdemH4.setText("0");
						sliderOrdemH4.setValue(0);					
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
		textOrdemH4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH4.setColumns(10);
		textOrdemH4.setBounds(86, 22, 54, 20);
		panelOrdemH4.add(textOrdemH4);
		
		
		//grafico h4
		
		JPanel panelFormaOndaH4 = new JPanel();
		panelFormaOndaH4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 4", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH4.setBounds(684, 103, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH4);
		panelFormaOndaH4.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH4 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH4.add(graficoH4);
		graficoH4.setBounds(6, 16, 315, 135);
		graficoH4.setLayout(null);
		
		
		//harmonico 5
		
		JPanel panelH5 = new JPanel();
		panelH5.setLayout(null);
		panelH5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 5", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelH5.setBounds(511, 258, 163, 144);
		frmHarm.getContentPane().add(panelH5);
		
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
		sliderOrdemH5.setValue(0);
		sliderOrdemH5.setMaximum(15);
		sliderOrdemH5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH5.setText(Integer.toString(sliderOrdemH5.getValue()));
			}
		});
		sliderOrdemH5.setBounds(10, 19, 66, 26);
		panelOrdemH5.add(sliderOrdemH5);
		
		textOrdemH5 = new JTextField();
		textOrdemH5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH5.getText()) <= sliderOrdemH5.getMaximum()) {
						if(Integer.parseInt(textOrdemH5.getText()) >= sliderOrdemH5.getMinimum()) {
							sliderOrdemH5.setValue(Integer.parseInt(textOrdemH5.getText()));
						}
						else {
							textOrdemH5.setText("0");
							sliderOrdemH5.setValue(0);
						}
					}
					else {
						textOrdemH5.setText("0");
						sliderOrdemH5.setValue(0);					
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
		textOrdemH5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH5.setColumns(10);
		textOrdemH5.setBounds(86, 22, 54, 20);
		panelOrdemH5.add(textOrdemH5);
		
		
		//grafico h5
		
		JPanel panelFormaOndaH5 = new JPanel();
		panelFormaOndaH5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 5", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH5.setBounds(684, 258, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH5);
		panelFormaOndaH5.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH5 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH5.add(graficoH5);
		graficoH5.setBounds(6, 16, 315, 135);
		graficoH5.setLayout(null);
		
		
		//harmonico 6
		
		JPanel panelOrdemH6 = new JPanel();
		panelOrdemH6.setLayout(null);
		panelOrdemH6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Harm\u00F4nico 6", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelOrdemH6.setBounds(511, 420, 163, 144);
		frmHarm.getContentPane().add(panelOrdemH6);
		
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
		sliderOrdemH6.setValue(0);
		sliderOrdemH6.setMaximum(15);
		sliderOrdemH6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textOrdemH6.setText(Integer.toString(sliderOrdemH6.getValue()));
			}
		});
		sliderOrdemH6.setBounds(10, 19, 66, 26);
		panel_9.add(sliderOrdemH6);
		
		textOrdemH6 = new JTextField();
		textOrdemH6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Integer.parseInt(textOrdemH6.getText()) <= sliderOrdemH6.getMaximum()) {
						if(Integer.parseInt(textOrdemH6.getText()) >= sliderOrdemH6.getMinimum()) {
							sliderOrdemH6.setValue(Integer.parseInt(textOrdemH6.getText()));
						}
						else {
							textOrdemH6.setText("0");
							sliderOrdemH6.setValue(0);
						}
					}
					else {
						textOrdemH6.setText("0");
						sliderOrdemH6.setValue(0);					
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
		textOrdemH6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrdemH6.setColumns(10);
		textOrdemH6.setBounds(86, 22, 54, 20);
		panel_9.add(textOrdemH6);
		
		
		//grafico h6
		
		JPanel panelFormaOndaH6 = new JPanel();
		panelFormaOndaH6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma de Onda Harmônico 6", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panelFormaOndaH6.setBounds(684, 420, 278, 144);
		frmHarm.getContentPane().add(panelFormaOndaH6);
		panelFormaOndaH6.setLayout(new GridLayout(0, 1, 0, 0));
		
		graficoH6 = new GraphPanel(new ArrayList<>());
		panelFormaOndaH6.add(graficoH6);
		graficoH6.setBounds(6, 16, 315, 135);
		graficoH6.setLayout(null);
		
		
		//botão voltar
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHarm.dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVoltar.setBounds(880, 600, 90, 25);
		frmHarm.getContentPane().add(btnVoltar);
		
		
		//botão simular
		
		JButton btnSimular = new JButton("Simular");
		btnSimular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					switch (calculosHarm.getNumHarm()) {
					case 6:
						calculosHarm.setAmpH6(Double.parseDouble(textAmpH6.getText()));
						calculosHarm.setAngH6(Double.parseDouble(textAngH6.getText()));
						calculosHarm.setOrdH6(sliderOrdemH6.getValue());
						
					case 5:
						calculosHarm.setAmpH5(Double.parseDouble(textAmpH5.getText()));
						calculosHarm.setAngH5(Double.parseDouble(textAngH5.getText()));
						calculosHarm.setOrdH5(sliderOrdemH5.getValue());
					case 4:
						calculosHarm.setAmpH4(Double.parseDouble(textAmpH4.getText()));
						calculosHarm.setAngH4(Double.parseDouble(textAngH4.getText()));
						calculosHarm.setOrdH4(sliderOrdemH4.getValue());
						
					case 3:
						calculosHarm.setAmpH3(Double.parseDouble(textAmpH3.getText()));
						calculosHarm.setAngH3(Double.parseDouble(textAngH3.getText()));
						calculosHarm.setOrdH3(sliderOrdemH3.getValue());
						
					case 2:
						calculosHarm.setAmpH2(Double.parseDouble(textAmpH2.getText()));
						calculosHarm.setAngH2(Double.parseDouble(textAngH2.getText()));
						calculosHarm.setOrdH2(sliderOrdemH2.getValue());
						
					case 1:
						calculosHarm.setAmpH1(Double.parseDouble(textAmpH1.getText()));
						calculosHarm.setAngH1(Double.parseDouble(textAngH1.getText()));
						calculosHarm.setOrdH1(sliderOrdemH1.getValue());
					}
					calculosHarm.calcular();
					
					switch(calculosHarm.getNumHarm()) {
					case 6:
						graficoH6.setScores(calculosHarm.getFormaOndaH6());						
					case 5:
						graficoH5.setScores(calculosHarm.getFormaOndaH5());
					case 4:
						graficoH4.setScores(calculosHarm.getFormaOndaH4());
					case 3:
						graficoH3.setScores(calculosHarm.getFormaOndaH3());
					case 2:
						graficoH2.setScores(calculosHarm.getFormaOndaH2());
					case 1:
						graficoH1.setScores(calculosHarm.getFormaOndaH1());
					}

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
		btnSimular.setBounds(459, 600, 90, 25);
		frmHarm.getContentPane().add(btnSimular);

		textAmpH1.setEnabled(false);
		textAmpH2.setEnabled(false);
		textAmpH3.setEnabled(false);
		textAmpH4.setEnabled(false);
		textAmpH5.setEnabled(false);
		textAmpH6.setEnabled(false);
		textAngH1.setEnabled(false);
		textAngH2.setEnabled(false);
		textAngH3.setEnabled(false);
		textAngH4.setEnabled(false);
		textAngH5.setEnabled(false);
		textAngH6.setEnabled(false);
		sliderOrdemH1.setEnabled(false);
		sliderOrdemH2.setEnabled(false);
		sliderOrdemH3.setEnabled(false);
		sliderOrdemH4.setEnabled(false);
		sliderOrdemH5.setEnabled(false);
		sliderOrdemH6.setEnabled(false);
		textOrdemH1.setEnabled(false);
		textOrdemH2.setEnabled(false);
		textOrdemH3.setEnabled(false);
		textOrdemH4.setEnabled(false);
		textOrdemH5.setEnabled(false);
		textOrdemH6.setEnabled(false);
		
		//recebe número de harmônicos
		
		switch (calculosHarm.getNumHarm()) {
		case 6:
			textAmpH6.setEnabled(true);
			sliderOrdemH6.setEnabled(true);
			textOrdemH6.setEnabled(true);
			textAngH6.setEnabled(true);
		case 5:
			textAmpH5.setEnabled(true);
			sliderOrdemH5.setEnabled(true);
			textOrdemH5.setEnabled(true);
			textAngH5.setEnabled(true);
		case 4:
			textAmpH4.setEnabled(true);
			sliderOrdemH4.setEnabled(true);
			textOrdemH4.setEnabled(true);
			textAngH4.setEnabled(true);
		case 3:
			textAmpH3.setEnabled(true);
			sliderOrdemH3.setEnabled(true);
			textOrdemH3.setEnabled(true);
			textAngH3.setEnabled(true);
		case 2:
			textAmpH2.setEnabled(true);
			sliderOrdemH2.setEnabled(true);
			textOrdemH2.setEnabled(true);
			textAngH2.setEnabled(true);
		case 1:
			textAmpH1.setEnabled(true);
			sliderOrdemH1.setEnabled(true);
			textOrdemH1.setEnabled(true);
			textAngH1.setEnabled(true);		
		}
	}
}
