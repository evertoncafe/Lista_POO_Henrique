package com.everton.exer_17;

public class Uso {
	public static void main(String args[]){
		//CIRCULO = PONTO A (X,Y), PONTO B (X,Y), RAIO, LINHA, SOLIDO?.
		Circulo circulo = new Circulo(2.0, 2.0, 1.0, 1.0, 10, 1, false);
		//QUADRADO = PONTO A (X,Y), PONTO B (X,Y), COMPR..., SOLIDO?, LINHA.
		Quadrado quadrado = new Quadrado(2, 2, 1, 1, 10, false, 1);
		//RETANGULO = PONTO A (X,Y), PONTO B (X,Y), COMPR..., SOLIDO?, LINHA, LARGURA.
		Retangulo retangulo = new Retangulo(2, 2, 1, 1, 10, false, 1, 5);
				
		circulo.toString();
		System.out.println("Area: " + circulo.area());
		System.out.println("Perimetro: " + circulo.perimetro());
		System.out.print("Solido? ");
		if(circulo.isFormaSolida()){
			System.out.println("sim.");
		}
		else {
			System.out.println("não.");
		}
		
		quadrado.toString();
		System.out.println("Area: " + quadrado.area());
		System.out.println("Perimetro: " + quadrado.perimetro());
		System.out.print("Solido? ");
		if(quadrado.isFormaSolida()){
			System.out.println("sim");
		}
		else {
			System.out.println("não");
		}
		retangulo.toString();
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimetro());
		System.out.print("Solido? ");
		if(retangulo.isFormaSolida()){
			System.out.println("sim");
		}
		else {
			System.out.println("não");
		}
		
	}
}
