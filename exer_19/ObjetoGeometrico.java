package com.everton.exer_19;

interface ObjetoGeometrico {
	/**
	 * O m�todo centro retorna o ponto em duas dimens�es que corresponde ao centro
	 * do objeto geom�trico.
	 * @return uma inst�ncia da classe Ponto2D representando o centro do objeto
	 * geom�trico.
	 */
	Ponto centro();
	/**
	 * O m�todo calcula�rea calcula a �rea do objeto geom�trico e retorna a �rea
	 * como um valor do tipo double.
	 * @return a �rea deste objeto geom�trico.
	 */
	double calcula�rea();
	/**
	 * O m�todo calculaPer�metro calcula o per�metro do objeto geom�trico e retorna o
	 * per�metro como um valor do tipo double.
	 * @return o per�metro deste objeto geom�trico.
	 */
	double calculaPer�metro();
}


