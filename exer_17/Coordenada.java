package com.everton.exer_17;

public abstract class Coordenada {
	private double coordValor;

	// === CONSTRUTORES === //
	public Coordenada(double x) {
		this.coordValor = x;
	}//FIM CONSTRUTOR 01
	public Coordenada() {
		this.coordValor = 0;
	}//FIM CONSTRUTOR 02

	// === GET's and SET's === //
	public double getCoordValor() {
		return coordValor;
	}
	public void setCoordValor(double valor) {
		this.coordValor = valor;
	}
	public void setCoordValor() {
		this.coordValor = 0;
	}

	// === TOSTRING === //
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCoordenada: " + this.getCoordValor());
		return builder.toString();
	}


}
