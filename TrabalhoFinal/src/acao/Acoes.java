package acao;
import conexao.*;
import informacoes.*;

/**
 
	public static void main(String args[]) {
		try {
			Conexao conexao = new Conexao();
			conexao.conectar();
			if(!conexao.isConectado()) 
				throw new Exception ("banco de dados não conectado");

			// objetos auxiliares
			String query, query1, query2, query3, query4, query5, query6;
			Usuario usuario;
			Codigo codigo;
			Produto produto;
			Item item;
			Situacao situacao;
			
			
				
			}
		conexao.desconectar(); 

	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
*/