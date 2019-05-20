package com.everton.exer_17;

public class Retangulo extends Quadrado{
	private double largura;

	// === GET's and SET's === //
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}

	// === CONSTRUTORES === //
	public Retangulo(double x01, double y01, double x02, double y02, double _comp, boolean formaSolida, double espessuraLinha, double largura) {
		super(x01, y01, x02, y02, _comp, formaSolida, espessuraLinha);
		this.largura = largura;
	}
	public Retangulo() {
		super(0, 0, 0, 0, 0, false, 1);
		this.largura = 0;
	}

	// === METHODOS === //
	public double area() {
		return (super.getComprimento() * this.largura);
	}
	public double perimetro() {
		return (2*(super.getComprimento() + this.largura));
	}
	public boolean isFormaSolida() {
		if(super.getFormaSolida() == true) {
			return true;
		}
		return false;
	}

	// === TOSTRING and EQUALS === //
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pontos do Retangulo:\nPonto A:\t");
		builder.append(super.getPontoA().getX()+ ", " + super.getPontoA().getY());
		builder.append("\nPonto B:\t");
		builder.append(super.getPontoB().getX()+ ", " + super.getPontoB().getY());
		builder.append("\nComprimento:\t");
		builder.append(super.getComprimento());
		builder.append("\nLargura:\t");
		builder.append(this.getLargura());
		builder.append("Preenchimento:\t");
		builder.append(super.getFormaSolida());
		builder.append("Espessura da linha:\t");
		builder.append(super.getEspessuraLinha());
		return builder.toString();
	}

}//FIM CLASS RETANGULO
