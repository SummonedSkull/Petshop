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

public class NovoPet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovoPet frame = new NovoPet();
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
	public NovoPet() {
		setTitle("Novo Pet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 294, 79);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNovoPet = new JLabel("Novo Pet");
		lblNovoPet.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNovoPet.setBounds(96, 11, 116, 40);
		panel.add(lblNovoPet);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 77, 294, 227);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(21, 31, 46, 14);
		panel_1.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(21, 50, 233, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(21, 101, 46, 14);
		panel_1.add(lblCliente);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(21, 118, 247, 20);
		panel_1.add(comboBox);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(179, 179, 89, 23);
		panel_1.add(btnCadastrar);
	}

}
