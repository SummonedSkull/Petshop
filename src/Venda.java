import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Venda extends JFrame 
{
	private JPanel contentPane;
	private JTextField FieldHora;
	private JTextField FieldData;
	private JTextField qtdField;
	private JFrame self;
	JComboBox<String> comboBoxProduto;
	JTable tabela;
	DefaultTableModel modelo;
	JScrollPane scrollPane = new JScrollPane();
	private int somaItens;
	String horaFormatada;
	SimpleDateFormat data;

	public Venda() 
	{
		DB.connect("petshop.db3");
		ResultSet res;
		somaItens = 0;
		self = this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 444, 50);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblVendas = new JLabel("VENDAS");
		lblVendas.setFont(new Font("Arial", Font.PLAIN, 16));
		lblVendas.setBounds(10, 11, 116, 28);
		panel.add(lblVendas);

		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(10, 82, 46, 14);
		contentPane.add(lblHora);

		FieldHora = new JTextField();
		FieldHora.setBounds(10, 98, 86, 20);
		contentPane.add(FieldHora);
		FieldHora.setColumns(10);

		Calendar calendar = new GregorianCalendar();
		Date trialTime = new Date();
		calendar.setTime(trialTime);
		// System.out.println("Hora: " + calendar.get(Calendar.HOUR));

		SimpleDateFormat h = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma
														// que tem
		horaFormatada = h.format(hora);

		FieldHora.setText(horaFormatada);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(139, 82, 46, 14);
		contentPane.add(lblData);

		FieldData = new JTextField();
		FieldData.setBounds(139, 98, 86, 20);
		contentPane.add(FieldData);
		FieldData.setColumns(10);

		data = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date d = new Date();
		FieldData.setText(data.format(d));

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 193, 46, 14);
		contentPane.add(lblCliente);

		JComboBox<String> comboBoxCliente = new JComboBox<String>();
		comboBoxCliente.setBounds(10, 218, 199, 20);
		contentPane.add(comboBoxCliente);
		
		comboBoxCliente.addItem("Selecione um Cliente");
		
		res = DB.query("select cli_nome from cliente;");
		try {
			while (res.next()) 
			{
				String nome = res.getString("cli_nome");
				comboBoxCliente.addItem(nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblNewLabel = new JLabel("Produto");
		lblNewLabel.setBounds(10, 249, 67, 14);
		contentPane.add(lblNewLabel);

		comboBoxProduto = new JComboBox<String>();
		comboBoxProduto.setBounds(10, 274, 162, 20);
		contentPane.add(comboBoxProduto);
		comboBoxProduto.addItem("Selecione um Produto ou serviço");
		
		DB.connect("petshop.db3");
		res = DB.query("select prod_nome,prod_preco from Prod_Serv;");
		try {
			while (res.next()) {
				String prod_nome = res.getString("prod_nome");				
				comboBoxProduto.addItem(prod_nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblPet = new JLabel("Pet");
		lblPet.setBounds(246, 249, 46, 14);
		contentPane.add(lblPet);

		final JComboBox<String> comboBoxPet = new JComboBox<String>();
		comboBoxPet.setBounds(246, 274, 162, 20);
		contentPane.add(comboBoxPet);
		comboBoxPet.addItem("Selecione um Pet");
		
		DB.connect("petshop.db3");
		res = DB.query("select ani_nome from Animal;");
		try {
			while (res.next()) {
				String ani_nome = res.getString("ani_nome");
				comboBoxPet.addItem(ani_nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblQted = new JLabel("Quantidade");
		lblQted.setBounds(10, 320, 86, 14);
		contentPane.add(lblQted);

		qtdField = new JTextField();
		qtdField.setBounds(78, 317, 50, 20);
		contentPane.add(qtdField);
		qtdField.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				somaItens += buscarPreco()*Integer.parseInt(qtdField.getText());
				listarProdutos(comboBoxProduto.getSelectedItem().toString(), qtdField.getText(),buscarPreco(),comboBoxPet.getSelectedItem().toString());
				System.out.println(somaItens);
			}
		});
		btnAdicionar.setBounds(10, 434, 95, 23);
		contentPane.add(btnAdicionar);

		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				finalizarCompra();
			}
		});
		btnFinalizar.setBounds(10, 627, 95, 23);
		contentPane.add(btnFinalizar);
		
		JComboBox<String> comboBoxFunc = new JComboBox<String>();
		comboBoxFunc.setBounds(10, 162, 199, 20);
		contentPane.add(comboBoxFunc);
		comboBoxFunc.addItem("Selecione um funcionario");
		
		DB.connect("PetShop");
		res = DB.query("select func_nome from Funcionario;");
		try {
			while (res.next()) {
				String func_nome = res.getString("func_nome");
				comboBoxFunc.addItem(func_nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(10, 137, 106, 14);
		contentPane.add(lblFuncionario);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 480, 388, 121);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		modelo = (DefaultTableModel) tabela.getModel();
		String [] colunas = {"Produto", "Quantidade", "Preço","Pet"};
		modelo.setColumnIdentifiers(colunas);
	}
	
	public void listarProdutos(String produto,String qtd,int valor,String pet) 
	{
		Object[] objects = {produto,qtd,valor,pet};			
		modelo.addRow(objects);
		
		scrollPane.setViewportView(tabela);
	}
	
	public void finalizarCompra() 
	{
		DB.connect("PetShop");
		DB.execQuery("INSERT INTO Pedido (qnt_prod,preco_total) values ("+ qtdField.getText() +","+ somaItens +");") ;
		String finalizarCompra = "O total da compra foi: " + somaItens + " reais";
		JOptionPane.showMessageDialog(null, finalizarCompra);
		self.dispose();		
	}
	
	public int buscarPreco() 
	{
		int preco=0;
		DB.connect("petshop.db3");
		ResultSet res;

		res = DB.query("select prod_preco from Prod_Serv where id_prod=" + comboBoxProduto.getSelectedIndex()+ ";");
		
		try 
		{
			preco = res.getInt("prod_preco");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preco;
	}
}
