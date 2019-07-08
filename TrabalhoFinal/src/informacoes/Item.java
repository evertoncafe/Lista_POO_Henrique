package informacoes;

import java.sql.ResultSet;

public class Item {
	private Codigo codigo;
	private Produto produto;
	private int qtde;
	private Situacao situacao;

	public Item(Codigo _codigo,Produto _produto,Situacao _situacao, int _qtde) {
		this.codigo = _codigo;
		this.produto = _produto;
		this.qtde = _qtde;
		this.situacao = _situacao;
	}
	public Item(Codigo _codigo, Produto _produto,Situacao _situacao, ResultSet conjuntoResultados) throws Exception {
		this.codigo = _codigo;
		this.produto = _produto;
		this.qtde = conjuntoResultados.getInt("qtde");	
		this.situacao = _situacao;
	}
	public Item(String _data, String _usuario,Produto _produto,Situacao _situacao, int _qtde) throws Exception {
		this.setCodigo(new Codigo(_data,_usuario));
		this.produto = _produto;
		this.qtde = _qtde;
		this.situacao = _situacao;
	}
	public Situacao getSituacao() {
		return this.situacao;
	}
	public Codigo getCodigo() {
		return this.codigo;
	}
	public void setCodigo(Codigo _codigo) {
		this.codigo = _codigo;
	}
	
	public void setCodigo(Data _data, Usuario _usuario) {
		this.codigo.setData(_data);
		this.codigo.setUsuario(_usuario);
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	public int getQtde() {
		return this.qtde;
	}
	public String toString() {
		return this.getCodigo() + "-" + this.getProduto() + " - " + this.getQtde() + "-" + this.getSituacao();
	}
	
}