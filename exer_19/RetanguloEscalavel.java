package com.everton.exer_19;

public class RetanguloEscalavel implements ObjetoGeometrico, Escalavel{

	private Ponto verticeSE;
	private Ponto verticeID;
	private Ponto centro;
	private double altura;
	private double largura;
	// === CONSTRUCTOR'S === //
	public RetanguloEscalavel(Ponto _SE, Ponto _ID) throws Exception {
		this.setverticeID(_SE);
		this.setVerticeSE(_ID);
		this.setCentro();
		this.setAltura();
		this.setLargura();
	}
	public RetanguloEscalavel() throws Exception {
		this.setverticeID(new Ponto());
		this.setVerticeSE(new Ponto());
		this.setCentro();
		this.setAltura();
		this.setLargura();
	}

	// === GET'S and SET'S === //
	public Ponto getVerticeSE() {
		return verticeSE;
	}
	public Ponto getverticeID() {
		return verticeID;
	}
	public double getAltura() {
		return altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	public void setCentro() throws Exception {
		this.centro = new Ponto(this.getLargura()/2, this.getAltura()/2);
	}
	public void setAltura(Ponto a, Ponto b) {
		this.altura = Ponto.distancia(a.getX(), a.getY(), a.getX(), b.getY());
	}
	public void setLargura(Ponto a, Ponto b) {
		this.largura = Ponto.distancia(a.getX(), a.getY(), b.getX(), a.getY());
	}
	public void setAltura() {
		this.altura = Ponto.distancia(this.verticeSE.getX(), this.verticeSE.getY(), this.verticeSE.getX(), this.verticeID.getY());
	}
	public void setLargura() {
		this.largura = Ponto.distancia(this.verticeSE.getX(), this.verticeSE.getY(), this.verticeID.getX(), this.verticeSE.getY());
	}
	public void setVerticeSE(Ponto verticeSE) {
		this.verticeSE = verticeSE;
	}
	public void setverticeID(Ponto verticeID) {
		this.verticeID = verticeID;
	}

	// === METHODO'S === //
	public void amplia(double escala) {
		this.altura *= escala;
		this.largura *= escala;
	}
	public void espelha() throws Exception {
		this.verticeSE = new Ponto(this.verticeSE.getX() * (-1), this.verticeSE.getY());
		this.verticeID = new Ponto(this.verticeID.getX() * (-1), this.verticeID.getY());
	}
	public Ponto centro() {
		return this.centro;
	}
	public double calculaÁrea() {
		return this.getLargura() * this.getAltura();
	}
	public double calculaPerímetro() {
		return 2.0 * this.getAltura() + 2.0 * this.getLargura();
	}
	public String toString() {
		return verticeID + "-" + verticeSE + "-" + centro;
	}
}//CLASS RETANGULO 
