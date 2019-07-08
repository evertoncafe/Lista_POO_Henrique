package informacoes;

public class Pedido {
	private Usuario _usuario;
	private Item _item;
	private Data _data;

	public Pedido(String _nome, String _dataTxt, String _prod_desc, String _qtd, String _status) throws Exception {
		
		this._usuario = new Usuario(_nome);
		this._data = new Data(_dataTxt);
		//Codigo newCodigo = new Codigo(_data, _usuario);
		//Produto newProduto = new Produto(_prod_desc);
		//Situacao newStatus = new Situacao(_status);
		this._item = new Item(new Codigo(_data, _usuario), new Produto(_prod_desc), new Situacao(Integer.parseInt(_status)), Integer.parseInt(_qtd));

	}

	public Usuario get_usuario() {
		return _usuario;
	}
	public Item get_item() {
		return _item;
	}
	public Data get_data() {
		return _data;
	}
	public String toString() {
		return this._usuario.toString() + "\n"
				+ this._item.toString();
	}


}
