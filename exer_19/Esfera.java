package com.everton.exer_19;

public class Esfera implements ObjetoTridimensional {
	private Ponto3D centro;
	private double raio;

	// === CONSTRUCTOR'S === //
	public Esfera(Ponto3D _centro, double _raio) {
		this.centro = _centro;
		this.raio = _raio;
	}
	// === GET'S and SET'S === //
	public Ponto3D centro() {
		return this.centro;
	}
	// === GET'S and SET'S STATIC'S=== //
	// === METHODO'S STATIC'S === //
	// === METHODO'S === //
	public double calculaSuperficie() {
		return 4.0*Math.PI*this.raio*this.raio;
	}
	public double calculaVolume() {
		return (4.0*Math.PI*this.raio*this.raio*this.raio)/3;
	}

}
