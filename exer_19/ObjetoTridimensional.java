package com.everton.exer_19;

public interface ObjetoTridimensional {
	/**
	 * O m�todo centro retorna o ponto em tres dimens�es que corresponde ao centro
	 * do objeto geom�trico.
	 * @return uma inst�ncia da classe Ponto3D representando o centro do objeto
	 * geom�trico.
	 */
	Ponto3D centro();
	/**
	 * O m�todo calculaSuperficie calcula a �rea da superficie do objeto geom�trico e retorna a �rea
	 * como um valor do tipo double.
	 * @return a �rea da superficie deste objeto geom�trico.
	 */
	double calculaSuperficie();
	/**
	 * O m�todo calculaVolume calcula o volume do objeto geom�trico e retorna o
	 * volume como um valor do tipo double.
	 * @return o volume deste objeto geom�trico.
	 */
	double calculaVolume();
}
