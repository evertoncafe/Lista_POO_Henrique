package com.everton.exer_10;

public class Retangulo {
	private Ponto pontoES;
	private Ponto pontoDI;
	private double comprimento;
	private double largura;
	
	// === CONSTRUCTOR's === //
	public Retangulo(double x1,double y1, double x2, double y2) throws Exception {
		this.pontoES.setPontos(x1, y1);
		this.pontoES.setPontos(x2, y2);
	}// FIM CONSTRUCTOR 01
	public Retangulo(Ponto pontoES, Ponto pontoDI) {
		super();
		this.pontoES = pontoES;
		this.pontoDI = pontoDI;
	}// FIM CONSTRUCTOR 02
	public Retangulo() {
		this.pontoES.setPontos();
		this.pontoDI.setPontos();
	}// FIM CONSTRUCTOR 03


	// === GET's and SET's === //
	public Ponto getPontoES() {
		return pontoES;
	}
	public void setPontoES(Ponto pontoES) {
		this.pontoES = pontoES;
	}
	public Ponto getPontoDI() {
		return pontoDI;
	}
	public void setPontoDI(Ponto pontoDI) {
		this.pontoDI = pontoDI;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public void setRetangulo(double x1,double y1, double x2, double y2) throws Exception {
		Ponto ponto1 = new Ponto();
		Ponto ponto2 = new Ponto();
		ponto1.setPontos(x1, y1);
		ponto2.setPontos(x2, y2);
		
		this.setPontoES(ponto1);
		this.setPontoDI(ponto2);
	}// FIM SET
	// === METHODO's === //
	public void Calc_Larg_Compr(Ponto pontoES, Ponto pontoDI) throws Exception {
		Ponto pontoEI = new Ponto();
		Ponto pontoDS = new Ponto();
		pontoEI.setPontos(pontoES.getX(), pontoDI.getY());
		pontoDS.setPontos(pontoDI.getX(), pontoES.getY());
		this.setComprimento(Ponto._distancia(pontoEI, pontoDI));
		this.setLargura(Ponto._distancia(pontoES, pontoEI));
	}
	public double calcula_Perimetro_Retangulo() throws Exception {
		return (2*(this.getComprimento()+this.getLargura()));
	}
	public double calcula_Area_Retangulo() throws Exception {
		return (this.getComprimento()*this.getLargura());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		StringBuilder novo = new StringBuilder();
		novo.append(this.pontoES.toString() + " - " + this.pontoDI.toString());
		return novo.toString();
	}

}
