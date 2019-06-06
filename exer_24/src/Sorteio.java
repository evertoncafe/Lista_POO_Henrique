package com.everton.exer_24.src;
import java.util.Random;
import java.util.TreeSet;

public class Sorteio {

	private Data data;
	private TreeSet<Integer> treeInteiros = new TreeSet <Integer>();
	private int qtd_numeros;
	// === CONSTRUCTOR's === //
	public Sorteio(String data, int qtd) {
		this.data = new Data(data);
		this.setQtdNumero(qtd);
		this.setTreeInteiros(treeInteiros);
	}
	// === GET's and SET's === //
	public TreeSet<Integer> getTreeInteiros() {
		return treeInteiros;
	}
	public void setTreeInteiros(TreeSet<Integer> treeInteiros) {
		this.treeInteiros = treeInteiros;
	}
	// === GET's and SET's STATICS === //
	public void setQtdNumero (int _new_valor) {
		this.qtd_numeros = _new_valor;
	}
	public int getQtdNumero() {
		return this.qtd_numeros;
	}
	// === TreeSet === //
	public void setTreeSet(TreeSet<Integer> _tipoTree) {
		Random gerador = new Random();
		for(int i=0; i <qtd_numeros; i++) {
			treeInteiros.add(gerador.nextInt(49));
		}//FIM FOR
	}//FIM FUNCAO SET TREE SET
	public String toString() {
		StringBuilder _newString = new StringBuilder();
		_newString.append(data.toString());
		_newString.append(treeInteiros.toString());
		return _newString.toString();
	}
	
}//FIM CLASS SORTEIO

