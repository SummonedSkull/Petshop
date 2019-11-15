import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame 
{
	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField endField;
	private JTextField telField;
	
	public CadastroCliente() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 444, 50);
		contentPane.add(panel);
		
		JLabel lblDadosCadastraisCliente = new JLabel("Dados cadastrais cliente");
		lblDadosCadastraisCliente.setBounds(10, 11, 221, 28);
		panel.add(lblDadosCadastraisCliente);
		lblDadosCadastraisCliente.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 60, 68, 14);
		contentPane.add(lblNome);
		
		nomeField = new JTextField();
		nomeField.setBounds(10, 85, 260, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 116, 68, 14);
		contentPane.add(lblEndereo);
		
		endField = new JTextField();
		endField.setBounds(10, 141, 260, 20);
		contentPane.add(endField);
		endField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 184, 68, 14);
		contentPane.add(lblTelefone);
		
		telField = new JTextField();
		telField.setBounds(10, 209, 120, 20);
		contentPane.add(telField);
		telField.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				inserirBanco();
			}
		});
		btnConfirmar.setBounds(10, 287, 89, 23);
		contentPane.add(btnConfirmar);
	}
	
	public void inserirBanco()
	{  		
		DB.connect("petshop.db3");
		DB.execQuery("INSERT into cliente ('cli_nome','cli_endereco','cli_telefone') VALUES " +
				"('"+nomeField.getText()+"','"+endField.getText()+"','"+telField.getText()+"')");
		
		nomeField.setText(null);
		endField.setText(null);
		telField.setText(null);
		
	}
}
