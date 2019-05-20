package com.everton.exer_18;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
	private boolean statusEmprestimo = false;
	private String localizacao;
	private String descricao;
	// === CONSTANTES === //

	public LivroDeBiblioteca (String titulo, String autor, int nPages, int anoEdi, boolean status, String _loc, String _desc) {
		super(titulo, autor, nPages, anoEdi);
		this.statusEmprestimo = status;
		this.localizacao = _loc;
		this.descricao = _desc;

	}//FIM CONSTRUTOR PADRAO + SUPER

	//// === GET's and SET's === //
	public boolean getStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public boolean setStatusEmprestimo(boolean status) {
		return this.statusEmprestimo = status;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// === METHODOS === //


	// === METHODOS IMPLEMENTS === //
	@Override
	public boolean isEmprestado() {
		if(this.getStatusEmprestimo() == true) {
			return true;
		}//FIM IF
		return false;
	}//FIM IS EMPRESTIMO

	@Override
	public void empresta() {
		this.setStatusEmprestimo(true);
	}

	@Override
	public void devolve() {
		this.setStatusEmprestimo(false);
	}

	@Override
	public void localiza() {
		System.out.println(this.getLocalizacao());
	}

	@Override
	public void apresentaDescricao() {
		System.out.println(this.getDescricao());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nEmprestimo:\t");
		if(this.getStatusEmprestimo()) {
			builder.append("Emprestado.");
		}else {
			builder.append("Não emprestado.");
		}
		builder.append("\nLocalizacao:\t");
		builder.append(this.localizacao);
		builder.append("\nDescricao:\t");
		builder.append(this.descricao);;
		return builder.toString();
	}
	

}
