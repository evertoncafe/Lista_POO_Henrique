package com.everton.exer_17;

public class Quadrado implements FormasGeometricas{
	private Ponto pontoA;
	private Ponto pontoB;
	private double comprimento;
	private boolean formaSolida;
	private double espessuraLinha;

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
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getEspessuraLinha() {
		return espessuraLinha;
	}
	public void setEspessuraLinha(double espessuraLinha) {
		this.espessuraLinha = espessuraLinha;
	}
	public boolean getFormaSolida() {
		return this.formaSolida;
	}
	public void setFormaSolida(boolean formaSolida) {
		this.formaSolida = formaSolida;
	}

	// === CONSTRUTORES === //
	public Quadrado(double x01, double y01,double x02, double y02, double _comp, boolean formaSolida, double espessuraLinha) {
		this.pontoA.setPontos(x01, y01);
		this.pontoB.setPontos(x02, y02);
		this.comprimento = _comp;
		this.formaSolida = formaSolida;
		this.espessuraLinha = espessuraLinha;
	}
	public Quadrado() {
		this.pontoA.setPontos();
		this.pontoB.setPontos();
		this.setComprimento(0);
		this.espessuraLinha = 1;
		this.formaSolida = false;
	}

	// === METHODOS === //
	public double area() {
		return (Math.pow(this.comprimento, 2));
	}
	public double perimetro() {
		return (4*this.comprimento);
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
		builder.append("Pontos do Quadrado:\nPonto A:\t");
		builder.append(this.getPontoA().getX()+ ", " + this.getPontoA().getY());
		builder.append("\nPonto B:\t");
		builder.append(this.getPontoB().getX()+ ", " + this.getPontoB().getY());
		builder.append("\nComprimento:\t");
		builder.append(this.getComprimento());
		builder.append("Preenchimento:\t");
		builder.append(this.getFormaSolida());
		builder.append("Espessura da linha:\t");
		builder.append(this.getEspessuraLinha());
		return builder.toString();
	}
}//FIM CLASSE QUADRADO
