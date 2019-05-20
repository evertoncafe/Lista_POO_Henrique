package com.everton.exer_17;


public class Circulo implements FormasGeometricas {
	private Ponto pontoA;
	private Ponto pontoB;
	private double raio;
	private boolean formaSolida;
	private double espessuraLinha;

	// === CONSTRUTORES === //
	public Circulo(double x01, double y01,double x02, double y02, double raio, double _tamLinha, boolean _preench) {
		this.pontoA.setPontos(x01, y01);
		this.pontoB.setPontos(x02, y02);
		this.raio = raio;
		this.espessuraLinha = _tamLinha;
		this.formaSolida = _preench;
	}
	public Circulo() {
		this.pontoA.setPontos();
		this.pontoB.setPontos();
		this.setRaio(0);
		this.espessuraLinha = 1;
		this.formaSolida = false;
	}
	// === GET's and SET's === //

	public Ponto getPontoA() {
		return pontoA;
	}
	public void setPontoA(Ponto pontoA) {
		this.pontoA = pontoA;
	}
	public Ponto getPontoB() {
		return pontoB;
	}
	public void setPontoB(Ponto pontoB) {
		this.pontoB = pontoB;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public boolean getFormaSolida() {
		return this.formaSolida;
	}
	public void setFormaSolida(boolean formaSolida) {
		this.formaSolida = formaSolida;
	}
	public double getEspessuraLinha() {
		return espessuraLinha;
	}
	public void setEspessuraLinha(double espessuraLinha) {
		this.espessuraLinha = espessuraLinha;
	}

	// === METHODOS === //
	public double perimetro() {
		return (Math.PI * 2 * this.raio);
	}
	public double area() {
		return (Math.pow(this.raio, 2) * Math.PI);
	}
	public boolean isFormaSolida() {
		if(this.formaSolida == true) {
			return true;
		}
		return false;
	}

	// === TOSTRING and EQUALS === //
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pontos do Circulo:\nPonto A:\t");
		builder.append(this.getPontoA().getX()+ ", " + this.getPontoA().getY());
		builder.append("\nPonto B:\t");
		builder.append(this.getPontoB().getX()+ ", " + this.getPontoB().getY());
		builder.append("\nRaio:\t");
		builder.append(this.getRaio());
		builder.append("Preenchimento:\t");
		builder.append(this.getFormaSolida());
		builder.append("Espessura da linha:\t");
		builder.append(this.getEspessuraLinha());
		return builder.toString();
	}
}//FIM CLASSE CIRCULO
