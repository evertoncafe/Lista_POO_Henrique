package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import informacoes.Pedido;



public class Conexao {
	public static final String PREFIX 		= "jdbc:mysql:";
	public static final String HOSTNAME 	= "localhost";
	public static final String DATABASE 	= "cadastro"; //"driver"
	public static final String TIMEZONE 	= "useTimezone=true&serverTimezone=UTC";
	public static final String USER 		= "root";
	public static final String PASSWORD 	= "";

	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;

	public Conexao() {
		this.connection = null;
		this.statement = null;
		this.resultSet = null;
	}
	public void conectar() throws Exception {
		// monta a url do banco (exemplo: jdbc:mysql://localhost:3306/compras?useTimezone=true&serverTimezone=UTC) 
		String url = Conexao.PREFIX + "//" + Conexao.HOSTNAME + "/" + Conexao.DATABASE + "?" + Conexao.TIMEZONE;
		// estabele uma conexão com o banco de dados em 'url' 
		this.connection = DriverManager.getConnection(url,  Conexao.USER, Conexao.PASSWORD);
		this.statement = this.connection.createStatement();
	}
	public boolean isConectado() {
		if(this.connection != null)
			return true;
		else
			return false;
	}
	public void iniciaQuery(String query) throws Exception {
		this.resultSet = this.statement.executeQuery(query);
		this.statement = this.connection.createStatement();
	}
	public ResultSet getConjuntoResultados() {
		return this.resultSet;
	}
	public void atualiza(String query) throws Exception {
		this.statement.executeUpdate(query);
	}
	public void desconectar() throws Exception {
		this.connection.close();
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	/*public void insertCadastro(Pedido _pedido) throws Exception {
		
		// pedidos (codigo, data, usuario, produto, situacao)
		String sql = "insert into pedidos values (DEFAULT,?, ?, ?, ?, ?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, _pedido.get_item().getCodigo().getIdCodigo());
		statement.setString(2, _pedido.get_data().toString());
		statement.setString(3, _pedido.get_usuario().getNome());
		statement.setString(4, _pedido.get_item().getProduto().getDescricao());
		statement.setString(5, _pedido.get_item().getSituacao().getSolucao());
		statement.execute();
	
	}*/
}