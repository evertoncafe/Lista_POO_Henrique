package com.everton.exer_24.src;

import java.util.LinkedList;
import java.util.List;

public class ConjuntoSorteio {
	private List<Sorteio> numerosSorteados;
	private static int numeroDeVezes;
	
	public static void setNumeroDeVezes(int _numero) {
		ConjuntoSorteio.numeroDeVezes = _numero;
	}
	public static int getNumeroDeVezes() {
		return ConjuntoSorteio.numeroDeVezes;
	}
	
	ConjuntoSorteio(){
		numerosSorteados = new LinkedList<Sorteio>();
	}
	public void insere (Sorteio _numeSorteio) {
		this.numerosSorteados.add(_numeSorteio);
	}
	
}
