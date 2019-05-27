package com.everton.exer_19;

public interface ObjetoTridimensional {
	/**
	 * O método centro retorna o ponto em tres dimensões que corresponde ao centro
	 * do objeto geométrico.
	 * @return uma instância da classe Ponto3D representando o centro do objeto
	 * geométrico.
	 */
	Ponto3D centro();
	/**
	 * O método calculaSuperficie calcula a área da superficie do objeto geométrico e retorna a área
	 * como um valor do tipo double.
	 * @return a área da superficie deste objeto geométrico.
	 */
	double calculaSuperficie();
	/**
	 * O método calculaVolume calcula o volume do objeto geométrico e retorna o
	 * volume como um valor do tipo double.
	 * @return o volume deste objeto geométrico.
	 */
	double calculaVolume();
}
