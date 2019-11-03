import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;

public class Venda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venda frame = new Venda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Venda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 408, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblVendas.setBounds(167, 11, 116, 29);
		panel.add(lblVendas);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(10, 82, 46, 14);
		contentPane.add(lblHora);
		
		textField = new JTextField();
		textField.setBounds(10, 98, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 129, 46, 14);
		contentPane.add(lblData);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 145, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 176, 46, 14);
		contentPane.add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 194, 199, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Produto");
		lblNewLabel.setBounds(10, 235, 46, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 254, 104, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblPet = new JLabel("Pet");
		lblPet.setBounds(134, 235, 46, 14);
		contentPane.add(lblPet);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(132, 254, 77, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblQted = new JLabel("Qtde");
		lblQted.setBounds(236, 235, 46, 14);
		contentPane.add(lblQted);
		
		textField_2 = new JTextField();
		textField_2.setBounds(236, 254, 50, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(313, 235, 46, 14);
		contentPane.add(lblValor);
		
		textField_3 = new JTextField();
		textField_3.setBounds(313, 254, 67, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(291, 302, 89, 23);
		contentPane.add(btnAdicionar);
		
		JList list = new JList();
		list.setBounds(20, 347, 361, 133);
		contentPane.add(list);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(291, 501, 89, 23);
		contentPane.add(btnFinalizar);
	}
}
