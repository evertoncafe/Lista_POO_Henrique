package com.everton.exer_19;

public class Paralelepipedo implements ObjetoTridimensional {
	private Ponto3D pontoSDF;
	private Ponto3D pontoIET;
	private double altura;
	private double largura;
	private double comprimento;
	
	public Paralelepipedo(Ponto3D _pontoSDF, Ponto3D _pontoIET) {
		this.setAltura();
		this.setLargura();
		//this.comprimento = c;
		
	}
	public Ponto3D centro() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAltura() {
		this.altura = Ponto3D.distancia(this.pontoSDF.getX(), this.pontoSDF.getY(), this.pontoSDF.getZ(), this.pontoSDF.getX(), this.pontoIET.getY(), this.pontoSDF.getZ());
	}
	public void setLargura() {
		this.altura = Ponto3D.distancia(this.pontoSDF.getX(), this.pontoSDF.getY(), this.pontoSDF.getZ(), this.pontoSDF.getX(), this.pontoIET.getY(), this.pontoSDF.getZ());
	}
	public double calculaSuperficie() {
		return 2.0*(this.altura*this.largura+this.largura*this.comprimento+this.altura*this.comprimento);
	}
	public double calculaVolume() {
		return this.altura*this.largura*this.comprimento;
	}

}
