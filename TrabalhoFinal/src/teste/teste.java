package teste;

import informacoes.*;
import java.sql.PreparedStatement;
import java.util.Calendar;

import conexao.Conexao;
import ControladoresDAO.*;
public class teste {
	public static void main(String[] args) throws Exception {
/*
		//DAOCadastro cadastro = new DAOCadastro();
		Pedido pedido = new Pedido("socorro", "07/07/2019", "ajuda please", "1", "1");
		
		
		//cadastro.insertCadastro(pedido);
		//System.out.println(pedido);
		
	
		Conexao conexao = new Conexao();

		conexao.conectar();
		if(conexao.isConectado()) {
			System.out.println("conectado");
		}
		else
			System.out.println("desconectado");
		
		conexao.insertCadastro(pedido);
		// create a sql date object so we can use it in our INSERT statement
		Calendar calendar = Calendar.getInstance();
		java.sql.Date DateUsed = new java.sql.Date(calendar.getTime().getTime());

		// the mysql insert statement
		// Exemple = " insert into users (first_name, last_name, date_created, is_admin, num_points) values (?, ?, ?, ?, ?)";  
		// pedidos (codigo, data, usuario, produto, situacao)
		String query = " insert into cadastro values"
				+ " values (?, ?, ?, ?, ?)";
		// create the mysql insert preparedstatement
		PreparedStatement preparedStmt = conexao.iniciaQuery(query);;
		preparedStmt.setString (1, );
		preparedStmt.setString (2, "Rubble");
		preparedStmt.setDate   (3, startDate);
		preparedStmt.setBoolean(4, false);
		preparedStmt.setInt    (5, 5000);

		// execute the preparedstatement
		preparedStmt.execute();
		conexao.desconectar();
		
*/
	}

}
