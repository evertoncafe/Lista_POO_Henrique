package informacoes;


import java.sql.ResultSet;

public class Produto {
	private String descricao;

	public Produto(String _descricao) {

		this.descricao = _descricao;

	}
	public Produto(ResultSet conjuntoResultados) throws Exception {
		this.descricao = conjuntoResultados.getString("descricao");

	}	


	public String getDescricao() {
		return this.descricao;
	}

	public String toString() {
		return this.getDescricao();
	}
}
