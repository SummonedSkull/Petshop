import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class Janela extends JFrame {

	private JPanel contentPane;

	public Janela() 
	{
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 444, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PETSHOP");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 233, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 62, 444, 209);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCliente = new JButton("Clientes");
		btnCliente.setBounds(10, 33, 115, 23);
		panel_1.add(btnCliente);
		
		JButton btnNewButton = new JButton("Animais");
		btnNewButton.setBounds(10, 67, 115, 23);
		panel_1.add(btnNewButton);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(10, 101, 115, 23);
		panel_1.add(btnVendas);
		
		JButton btnFuncionrios = new JButton("Funcionarios");
		btnFuncionrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Funcionarios f = new Funcionarios();
				f.setVisible(true);
			}
		});
		btnFuncionrios.setBounds(153, 33, 115, 23);
		panel_1.add(btnFuncionrios);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Produtos p = new Produtos();
				p.setVisible(true);
			}
		});
		btnProdutos.setBounds(153, 67, 115, 23);
		panel_1.add(btnProdutos);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Venda v = new Venda();
				v.setVisible(true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NovoPet np = new NovoPet();
				np.setVisible(true);
			}
		});
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				CadastroCliente cli = new CadastroCliente();
				cli.setVisible(true);
			}
		});
	}
}
