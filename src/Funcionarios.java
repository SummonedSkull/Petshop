import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Funcionarios extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField cargoField;
	private JFrame self;

	public Funcionarios() 
	{
		self = this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		panel.setBounds(0, 0, 444, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Dados cadastrais funcionario");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 211, 27);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				DB.connect("petshop.db3");
				DB.execQuery("INSERT into Funcionario ('func_nome','func_cargo') VALUES " +
						"('"+nomeField.getText()+"','"+cargoField.getText()+"')");
				
				nomeField.setText(null);
				cargoField.setText(null);
			}
		});
		btnNewButton.setBounds(10, 287, 135, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("Nome");
		label.setBounds(10, 61, 37, 14);
		contentPane.add(label);
		
		nomeField = new JTextField();
		nomeField.setBounds(10, 85, 260, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 119, 59, 14);
		contentPane.add(lblCargo);
		
		cargoField = new JTextField();
		cargoField.setBounds(10, 144, 267, 20);
		contentPane.add(cargoField);
		cargoField.setColumns(10);
	}	
}
