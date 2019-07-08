package ParteGrafica;
import acao.*;
import conexao.*;
import informacoes.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import ControladoresDAO.DAOCadastro;

public class Cadastramento extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtProduto;
	private JTextField txtData;
	private JTextField txtQtd;
	private JTextField txtSituacao;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastramento frame = new Cadastramento();
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
	public Cadastramento() {
		setResizable(false);
		setTitle("Cadastramento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(66, 8, 230, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setBounds(10, 46, 46, 14);
		contentPane.add(lblNewLabel_1);

		txtProduto = new JTextField();
		txtProduto.setColumns(10);
		txtProduto.setBounds(66, 43, 230, 20);
		contentPane.add(txtProduto);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 81, 46, 14);
		contentPane.add(lblData);

		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(96, 78, 200, 20);
		contentPane.add(txtData);

		txtQtd = new JTextField();
		txtQtd.setColumns(10);
		txtQtd.setBounds(96, 113, 200, 20);
		contentPane.add(txtQtd);

		JLabel lblItem = new JLabel("Quantidade");
		lblItem.setBounds(10, 116, 64, 14);
		contentPane.add(lblItem);

		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setBounds(10, 206, 46, 14);
		contentPane.add(lblNewLabel_2);

		JTextPane txtpnSeEst = new JTextPane();
		txtpnSeEst.setEditable(false);
		txtpnSeEst.setText("1- Se est\u00E1 na distribuidora\r\n2- \u00C0 caminho\r\n3- Entregue");
		txtpnSeEst.setBounds(41, 144, 230, 51);
		contentPane.add(txtpnSeEst);

		txtSituacao = new JTextField();
		txtSituacao.setBounds(66, 203, 53, 20);
		contentPane.add(txtSituacao);
		txtSituacao.setColumns(10);

		JButton btnNewButton = new JButton("Aplicar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DAOCadastro conexao = new DAOCadastro();
				try {

					conexao.conectar();
					if(!conexao.isConectado()) {
						throw new Exception ("banco de dados não conectado");
					}
					Pedido _pedido = new Pedido(txtUsuario.getText(),txtData.getText(),txtProduto.getText(),txtQtd.getText(), txtSituacao.getText());
					System.out.println(_pedido);
					conexao.insertCadastro(conexao, _pedido);
					
					/*// objetos auxiliares
					
					
					
					String query, query1, query2, query3, query4, query5, query6;
					Usuario usuario;
					Codigo codigo;
					Produto produto;
					Item item;
					Situacao situacao;

					// Cria um objeto da classe Cliente:  
					Usuario usuario1 = new Usuario(txtUsuario.getName());
					// Cria um objeto da classe Produto: 
					Produto _produto = new Produto(txtProduto.getText());
					// Cria um objeto da classe Codigo:
					Codigo _codigo = new Codigo(txtData.getText(),txtUsuario.getName());
					// Cria um objeto da classe Situacao:
					Situacao _situ = new Situacao(Integer.parseInt(txtSituacao.getText()));
					// Cria um objeto da classe Item:
					Item _item = new Item(_codigo, _produto, _situ,Integer.parseInt(txtQtd.getText()));
					 */
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally{
					try {
						conexao.desconectar();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		});

		btnNewButton.setBounds(226, 238, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 228, 46, 14);
		contentPane.add(lblId);

		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setBounds(66, 225, 53, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}
}
