package com.everton.exer_18;

public class Livro {

	private String titulo;
	private String autor;
	private int nPages;
	private int anoEdi;

	// === CONSTRUTORES === //
	public Livro (String titulo, String autor, int nPages, int anoEdi) {
		this.setTitulo(titulo);
		this.autor = autor;
		this.nPages = nPages;
		this.anoEdi = anoEdi;
	}//FIM CONSTRUTOR PADRAO

	// === GET's and SET's === //
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNPages() {
		return nPages;
	}
	public void setnPages(int nPages) {
		this.nPages = nPages;
	}
	public int getAnoEdi() {
		return anoEdi;
	}
	public void setAnoEdi(int anoEdi) {
		this.anoEdi = anoEdi;
	}

	// === METHODOS === //

	public String toString() {
		StringBuilder print = new StringBuilder();
		print.append("Titulo:\t\t");
		print.append(this.getTitulo() + "\n");
		print.append("Autor:\t\t");
		print.append(this.getAutor() + "\n");
		print.append("Nº Paginas:\t");
		print.append(this.getNPages() + "\n");
		print.append("Ano Edicao:\t");
		print.append(this.getAnoEdi() + "\n");
		return print.toString();
	}

}//FIM CLASS LIVRO
