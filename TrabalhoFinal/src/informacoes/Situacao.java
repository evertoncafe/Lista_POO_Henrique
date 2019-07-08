package informacoes;

public class Situacao {
	private String retorno;
	private int solucao;
	
	public Situacao(int _solucao) {
		this.solucao = _solucao;
	}
	public String getSolucao() {
		if(solucao == 1) {
			this.retorno = "Está na distribuidora";
		}if(solucao == 2) {
			this.retorno = "À caminho";
		}if(solucao == 3) {
			this.retorno = "Entregue";
		}
		return this.retorno;
	}
	
	
	public String toString() {
		return this.getSolucao();
	}
}
