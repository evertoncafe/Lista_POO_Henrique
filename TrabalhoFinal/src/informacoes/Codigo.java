package informacoes;

import java.sql.ResultSet;
import java.util.Random;



public class Codigo {
	private int idCodigo;
	private Data data;
	private Usuario usuario;
	
	//gerador de numeros aleatorios pra criar o código
	Random gerador = new Random();
	int codigo = gerador.nextInt(1000);
	
	public Codigo( Data _data, Usuario _usuario) {
		this.idCodigo = codigo;
		this.data = _data;
		this.usuario = _usuario;
	}
	public Codigo(String _data, String _usuario) throws Exception {
		this.idCodigo = codigo;
		this.setData(new Data( _data));
		this.setUsuario(new Usuario(_usuario));
	}
	public Codigo(Usuario _usuario, ResultSet conjuntoResultados) throws Exception {
		this.idCodigo = conjuntoResultados.getInt("idCodigo");
		this.data = new Data(conjuntoResultados.getDate("data"));
		this.usuario = _usuario;	
	}	
	
	public int getIdCodigo() {
		return this.idCodigo;
	}
	public void setData(Data _data) {
		this.data = _data;
	}
	public Data getData() {
		return this.data;
	}
	public void setUsuario(Usuario _usuario) {
		this.usuario = _usuario;
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	public String toString() {
		return this.getIdCodigo() + " - " + this.getData() + " - " + this.getUsuario();
	}
}
