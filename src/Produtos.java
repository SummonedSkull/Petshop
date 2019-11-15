import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Produtos extends JFrame 
{
	private JPanel contentPane;
	private JTextField idProdField;
	private JTextField nomeProdField;
	private JLabel lblValor;
	private JTextField valorProdField;
	private JTextField tipoProdField;
	

	public Produtos() 
	{
		setTitle("Cadastro de Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 347);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Produto");
		lblNewLabel.setBounds(28, 50, 76, 14);
		contentPane.add(lblNewLabel);
		
		idProdField = new JTextField();
		idProdField.setBounds(149, 47, 108, 20);
		contentPane.add(idProdField);
		idProdField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(28, 75, 46, 14);
		contentPane.add(lblNome);
		
		nomeProdField = new JTextField();
		nomeProdField.setBounds(149, 72, 160, 20);
		contentPane.add(nomeProdField);
		nomeProdField.setColumns(10);
		
		lblValor = new JLabel("Valor");
		lblValor.setBounds(28, 106, 46, 14);
		contentPane.add(lblValor);
		
		valorProdField = new JTextField();
		valorProdField.setBounds(149, 103, 108, 20);
		contentPane.add(valorProdField);
		valorProdField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de produto");
		lblNewLabel_1.setBounds(28, 137, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		tipoProdField = new JTextField();
		tipoProdField.setBounds(149, 134, 108, 20);
		contentPane.add(tipoProdField);
		tipoProdField.setColumns(10);
		
		JButton btnConfirmarCadProdutos = new JButton("Confirmar");
		btnConfirmarCadProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DB.connect("petshop.db3");
				DB.execQuery("INSERT into Prod_Serv ('id_prod','prod_nome','prod_preco','prod_tipo') VALUES " +
						"('"+idProdField.getText()+"','"+nomeProdField.getText()+"','"+valorProdField.getText()+"','"+tipoProdField.getText()+"')");
				
				idProdField.setText(null);
				nomeProdField.setText(null);
				valorProdField.setText(null);
				tipoProdField.setText(null);
			}
		});

		btnConfirmarCadProdutos.setBounds(28, 255, 137, 23);
		contentPane.add(btnConfirmarCadProdutos);
	}
}
