package com.everton.exer_17;

public class Ponto {
	private Coordenada x;
	private Coordenada y;


	// === CONSTRUTORES === //
	public Ponto(double valor01, double valor02) {
		this.x.setCoordValor(valor01);
		this.y.setCoordValor(valor02);
	}
	public Ponto() {
		this.setPontos(0, 0);
	}

	// === GET's and SET's === //
	public double getX() {
		return x.getCoordValor();
	}
	public void setX(Coordenada x) {
		this.x = x;
	}
	public double getY() {
		return y.getCoordValor();
	}
	public void setY(Coordenada y) {
		this.y = y;
	}

	// === METHODOS === //
	public void setPontos(double valor1, double valor2) {
		this.x.setCoordValor(valor1);
		this.y.setCoordValor(valor2);
	}
	public void setPontos() {
		this.x.setCoordValor();
		this.y.setCoordValor();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCoordenada x: " + this.x.toString());
		builder.append("\nCoordenada y: " + this.y.toString());
		return builder.toString();
	}
	public boolean isCoordinateEqual(Coordenada x, Coordenada y) {
		if(x.equals(y)) {
			return true;
		}
		return false;
	}
}//FIM CLASSE
