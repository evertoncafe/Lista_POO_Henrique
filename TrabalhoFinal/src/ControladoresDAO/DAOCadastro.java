package ControladoresDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.*;
import informacoes.Pedido;

public class DAOCadastro extends Conexao{
	public void insertCadastro(Conexao conexao, Pedido _pedido) throws SQLException {
		// pedidos (codigo, data, usuario, produto, situacao)
				String sql = "insert into pedidos values (DEFAULT,?, ?, ?, ?, ?)";

				PreparedStatement preparando = conexao.getConnection().prepareStatement(sql);
				preparando.setInt(1, _pedido.get_item().getCodigo().getIdCodigo());
				preparando.setString(2, _pedido.get_data().toString());
				preparando.setString(3, _pedido.get_usuario().getNome());
				preparando.setString(4, _pedido.get_item().getProduto().getDescricao());
				preparando.setString(5, _pedido.get_item().getSituacao().getSolucao());
				preparando.execute();
			
	}
	/*public void insertCadastro(Pedido _pedido) throws Exception {
		/*Conexao conexao = new Conexao();
		conexao.conectar();
		Connection connection = (Connection) conexao.getConjuntoResultados();


		// pedidos (codigo, data, usuario, produto, situacao)
		String sql = "insert into cadastro values (?, ?, ?, ?, ?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, _pedido.get_item().getCodigo().getIdCodigo());
		statement.setString(2, _pedido.get_data().toString());
		statement.setString(3, _pedido.get_usuario().getNome());
		statement.setString(4, _pedido.get_item().getProduto().getDescricao());
		statement.setString(5, _pedido.get_item().getSituacao().getSolucao());
		statement.execute();
		conexao.desconectar();
		
		String query = " insert into cadastro values"
				+ " values ("
				+"'"+ pedido.get_item().getCodigo()+"',"
				+"'"+ pedido.get_data()+"',"
				+"'"+ pedido.get_usuario()+"',"
				+"'"+ pedido.get_item().getProduto()+"',"
				+"'"+ pedido.get_item().getSituacao()+"'";
		 


	
	}*/
}
