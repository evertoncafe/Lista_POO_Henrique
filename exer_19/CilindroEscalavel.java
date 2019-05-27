package com.everton.exer_19;

public class CilindroEscalavel implements ObjetoTridimensional, Escalavel {
	private Ponto3D centro;
	private double raio;
	private double altura;
	// === CONSTRUCTOR'S === //
	public CilindroEscalavel(Ponto3D _centro, double _raio, double _altura) {
		this.centro = _centro;
		this.raio = _raio;
		this.altura = _altura;
	}
	// === GET'S and SET'S === //
	public Ponto3D getCentro() {
		return centro;
	}
	public double getRaio() {
		return raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setCentro(Ponto3D centro) {
		this.centro = centro;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	// === GET'S and SET'S STATIC'S=== //
	// === METHODO'S STATIC'S === //
	// === METHODO'S === //
	public void amplia(double escala) {
		this.raio *= escala;
		this.altura *= escala;
	}
	public void espelha() throws Exception {
		this.centro = new Ponto3D(this.centro.getX()*(-1),this.centro.getY(), this.centro.getZ());
	}
	public Ponto3D centro() {
		return this.centro;
	}
	public double calculaSuperficie() {
		return (2.0*(Math.PI*this.raio*this.raio))+(2.0*Math.PI*this.raio*this.altura);
	}
	public double calculaVolume() {
		return Math.PI*this.raio*this.raio*this.altura;
	}
	public String toString() {
		// Retorna diretamente uma string criada com os valores dos campos. O método
		// toString da classe Ponto3D é chamado implicitamente.
		return centro + "-" + this.raio+ "-" + this.altura;
	}

}
