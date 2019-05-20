package com.everton.exer_10;

public class Ponto {
	private double x;
	private double y;
	private static double _valorInfInicial = 0;
	private static double _valorSupInicial = 500;
	private static final double _limiteInferior = _valorInfInicial;
	private static final double _limiteSuperior = _valorSupInicial;

	// === GET's and SET's === //
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	// === GET's and SET's STATICS === //

	public static double getLimiteinferior() {
		return _limiteInferior;
	}
	public static double getLimitesuperior() {
		return _limiteSuperior;
	}
	public static double get_valorInfInicial() {
		return _valorInfInicial;
	}
	public static void set_valorInfInicial(double _valorInfInicial) {
		Ponto._valorInfInicial = _valorInfInicial;
	}
	public static double get_valorSupInicial() {
		return _valorSupInicial;
	}
	public static void set_valorSupInicial(double _valorSupInicial) {
		Ponto._valorSupInicial = _valorSupInicial;
	}
	// === CONSTRUTORES === //
	public Ponto(double x, double y) throws Exception{
		if(_verifLimites(x) && _verifLimites(y)) {
			this.x = x;
			this.y = y;
		}
		else {
			throw new Exception();
		}
	}
	public Ponto(){
		this.x = 0;
		this.y = 0;
	}
	public Ponto(String coord) throws Exception{
		this.setPontos(coord);
	}
	// === METHODOS === //
	public void setPontos(double x, double y) throws Exception{
		if(this._verifLimites(x) && this._verifLimites(y)) {
			this.setX(x);
			this.setY(y);
		}
		else {
			throw new Exception();
		}
	}//FIM SET PONTOS 01
	public void setPontos(String value) throws Exception{
		double dados[] = this.convertString(value);
		if(this._verifLimites(dados[0]) && this._verifLimites(dados[1])) {
			this.setX(dados[0]);
			this.setY(dados[1]);

		}

	}//FIM SET PONTOS 02
	public void setPontos(){
		this.x = 0;
		this.y = 0;
	}//FIM SET PONTOS 03
	public double[] convertString(String coord) {
		String valorTxt[] = coord.split(",|, | ");
		int tamVetor = valorTxt.length; //TAMANHO VETOR
		double[] valorCoord = new double[tamVetor];
		if(tamVetor == 2) {
			valorCoord[0] = Double.parseDouble(valorTxt[0]);
			valorCoord[1] = Double.parseDouble(valorTxt[1]);
			return valorCoord;
		}
		return null;
	}//FIM CONVERTE STRING
	public boolean _verifLimites(double value) {
		if(_limiteInferior <= value && value <= _limiteSuperior) {
			return true;
		}
		return false;
	}//FIM VERIFICA LIMITES
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(" + this.x + ", " + this.y + ")");
		return builder.toString();
	}//FIM TO STRING
	public boolean temEixoComum(Ponto pontoComp) {
		if(this.getX() == pontoComp.getX() || this.getY() == pontoComp.getY()) {
			return true;
		}
		return false;
	}
	public double _distancia(Ponto pCalc) {
		double result;
		result = Math.sqrt(Math.pow(this.getX() - pCalc.getX(), 2) + Math.pow(this.getY() - pCalc.getY(), 2));
		return result;
	}//FIM _DISTANCIA
	public double _distancia(double x2, double y2) {
		double result;
		result = Math.sqrt(Math.pow(this.getX() - x2, 2) + Math.pow(this.getY() - y2, 2));
		return result;
	}//FIM _DISTANCIA
	public double distanciaDaOrigem() {
		double result;
		result = Math.sqrt(Math.pow(this.getX() - 0, 2) + Math.pow(this.getY() - 0, 2));
		return result;
	}
	// === METHODOS STATICS === //
	public void setNewInfConst(double value) {
		Ponto.set_valorInfInicial(value);
	}
	public void setNewSupConst(double value) {
		Ponto.set_valorSupInicial(value);
	}
	public static boolean equals(Ponto pontoA, Ponto pontoB) {
		if(pontoA.toString().equals(pontoB.toString())) {
			return true;
		}
		return false;
	}//FIM COMPARE EQUALS
	public static Ponto clonar(Ponto clone) throws Exception {
		Ponto newClone = new Ponto(clone.getX(), clone.getY());
		return newClone;
	}
	public static Ponto criaSwap(Ponto ponto) throws Exception {
		Ponto swapPonto = new Ponto(ponto.getY(), ponto.getX());
		return swapPonto;
	}
	public static double _distancia(double x1, double y1, double x2, double y2) {
		double result;
		result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return result;
	}//FIM _DISTANCIA
	public static double _distancia(Ponto p1, Ponto p2) {
		double result;
		result = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
		return result;
	}//FIM _DISTANCIA
	public static boolean _compareTo(Ponto pontoA, Ponto pontoB) {
		String a = String.valueOf(pontoA.distanciaDaOrigem());
		String b = String.valueOf(pontoB.distanciaDaOrigem());
		if(a.compareTo(b) == 0) {
			return true;
		}
		return false;
	}
}
