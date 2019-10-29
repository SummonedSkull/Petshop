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

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	public Janela() {
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 51, 153));
		panel.setBounds(0, 0, 434, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PETSHOP DA LU");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblNewLabel.setBounds(121, 11, 233, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 102));
		panel_1.setBounds(0, 62, 434, 199);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCliente = new JButton("Clientes");
		btnCliente.setBounds(10, 33, 89, 23);
		panel_1.add(btnCliente);
		
		JButton btnNewButton = new JButton("Animais");
		btnNewButton.setBounds(10, 67, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(10, 101, 89, 23);
		panel_1.add(btnVendas);
		
		JButton btnFuncionrios = new JButton("Funcionarios");
		btnFuncionrios.setBounds(153, 33, 93, 23);
		panel_1.add(btnFuncionrios);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setBounds(153, 67, 93, 23);
		panel_1.add(btnProdutos);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
