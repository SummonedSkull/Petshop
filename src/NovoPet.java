import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class NovoPet extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	JComboBox<String> comboBoxCli = new JComboBox<String>();
	private JTextField racaField;
	private JTextField idadeField;

	public void BuscaCliente() 
	{
		comboBoxCli.addItem("Selecione um Cliente");
		DB.connect("petshop.db3");
		ResultSet res;
		res = DB.query("select cli_nome from cliente;");
		try {
			while (res.next()) {
				String nome = res.getString("cli_nome");
				comboBoxCli.addItem(nome);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public NovoPet() 
	{
		setTitle("Novo Pet");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 304, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BuscaCliente();

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 294, 391);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 58, 46, 14);
		panel_1.add(lblNome);

		nomeField = new JTextField();
		nomeField.setBounds(10, 83, 233, 20);
		panel_1.add(nomeField);
		nomeField.setColumns(10);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 253, 46, 14);
		panel_1.add(lblCliente);

		comboBoxCli.setBounds(10, 280, 247, 20);
		panel_1.add(comboBoxCli);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				DB.connect("petshop.db3");
				ResultSet res;
				res = DB.query(
						"select id_cli from cliente where cli_nome = '" + comboBoxCli.getSelectedItem() + "'" + ";");
				System.out.println(comboBoxCli.getSelectedItem());
				try {
					String id_cli = res.getString("id_cli");
					System.out.println(id_cli);

					DB.execQuery("INSERT into Animal ('ani_nome','ani_raca','ani_idade','id_cli') VALUES " + "('"
							+ nomeField.getText() + "','" + racaField.getText() + "','" + idadeField.getText() + "','"
							+ id_cli + "')");

					System.out.println("INSERT into Animal ('ani_nome','ani_raca','ani_idade','id_cli') VALUES " + "('"
							+ nomeField.getText() + "','" + racaField.getText() + "','" + idadeField.getText() + "','"
							+ id_cli + "')");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btnCadastrar.setBounds(10, 357, 105, 23);
		panel_1.add(btnCadastrar);

		JLabel lblRaa = new JLabel("Ra\u00E7a");
		lblRaa.setBounds(10, 121, 46, 14);
		panel_1.add(lblRaa);

		racaField = new JTextField();
		racaField.setBounds(10, 146, 233, 20);
		panel_1.add(racaField);
		racaField.setColumns(10);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 188, 46, 14);
		panel_1.add(lblIdade);

		idadeField = new JTextField();
		idadeField.setBounds(10, 211, 86, 20);
		panel_1.add(idadeField);
		idadeField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 294, 50);
		panel_1.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);

		JLabel lblNovoPet = new JLabel("Novo Pet");
		lblNovoPet.setBounds(10, 11, 123, 28);
		panel.add(lblNovoPet);
		lblNovoPet.setFont(new Font("Arial", Font.PLAIN, 16));
	}
}
