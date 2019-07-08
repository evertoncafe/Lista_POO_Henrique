package informacoes;

import java.sql.ResultSet;

public class Usuario {
	private String nome;
	
	public Usuario(String _nome) {
		this.nome = _nome;
	}	
	public Usuario(ResultSet conjuntoResultados) throws Exception {
		this.nome = conjuntoResultados.getString("nome");
	}
	
	public String getNome() {
		return this.nome;
	}
	public String toString() {
		return this.getNome();
	}
}

