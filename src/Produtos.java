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
	private JTextField id_TextField;
	private JTextField Name_TextField;
	private JLabel lblValor;
	private JTextField Valor_TextField;
	private JTextField TipoProd_TextField;
	

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
		
		id_TextField = new JTextField();
		id_TextField.setBounds(149, 47, 108, 20);
		contentPane.add(id_TextField);
		id_TextField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(28, 75, 46, 14);
		contentPane.add(lblNome);
		
		Name_TextField = new JTextField();
		Name_TextField.setBounds(149, 72, 160, 20);
		contentPane.add(Name_TextField);
		Name_TextField.setColumns(10);
		
		lblValor = new JLabel("Valor");
		lblValor.setBounds(28, 106, 46, 14);
		contentPane.add(lblValor);
		
		Valor_TextField = new JTextField();
		Valor_TextField.setBounds(149, 103, 108, 20);
		contentPane.add(Valor_TextField);
		Valor_TextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de produto");
		lblNewLabel_1.setBounds(28, 137, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		TipoProd_TextField = new JTextField();
		TipoProd_TextField.setBounds(149, 134, 108, 20);
		contentPane.add(TipoProd_TextField);
		TipoProd_TextField.setColumns(10);
	}
}
