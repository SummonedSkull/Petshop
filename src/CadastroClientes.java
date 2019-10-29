import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CadastroClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroClientes frame = new CadastroClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public CadastroClientes() {
		setTitle("Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 566, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 44, 455, 273);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(51, 11, 37, 14);
		panel_1.add(lblCdigo);
		
		textField = new JTextField();
		textField.setBounds(88, 9, 59, 17);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(51, 40, 27, 14);
		panel_1.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 37, 267, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Endere\u00E7o");
		lblNewLabel.setBounds(36, 71, 45, 14);
		panel_1.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(88, 68, 267, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(51, 101, 37, 14);
		panel_1.add(lblBairro);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 99, 100, 17);
		panel_1.add(textField_3);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(198, 101, 37, 14);
		panel_1.add(lblCidade);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(245, 99, 110, 17);
		panel_1.add(textField_4);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(51, 129, 19, 14);
		panel_1.add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setBounds(88, 126, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone");
		lblNewLabel_1.setBounds(36, 160, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(88, 157, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 11, 131, 33);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDadosCadastrais = new JLabel("Dados Cadastrais");
		lblDadosCadastrais.setBounds(10, 11, 121, 14);
		panel_2.add(lblDadosCadastrais);
	}
}
