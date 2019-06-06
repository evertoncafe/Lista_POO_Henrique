package com.everton.exer_23;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class Uso {
	public static void main(String[] args) {
		String texto = "eu gosto de poo";
		String[] palavras = texto.split(" ");

		// === TreeSet === //
		TreeSet<String> tree = new TreeSet <String>();
		for(int i=0; i < palavras.length; i++) {
			tree.add(palavras[i]);
		}//FIM FOR
		System.out.println(tree);

		// === HASHMAP === //
		HashMap<String, Integer> tabelaHash = new HashMap<String, Integer>();
		for(int i=0; i < palavras.length; i++) {
			if(tabelaHash.containsKey(palavras[i])) {
				tabelaHash.put(palavras[i], tabelaHash.get(palavras[i]+1));
				continue;
			}
			tabelaHash.put(palavras[i], 1);
			//tabelaHash.replace(arg0, arg1)(palavras[i]);
		}//FIM FOR
		System.out.println(tabelaHash);

		// === COLLECTIONS and LINKED LIST === //
		LinkedList<Integer> linkedLista = new LinkedList<>();
		for(int i=0; i<10; i++) {
			linkedLista.add((int)(50*Math.random()));
		}
		System.out.println(linkedLista);
		Collections.sort(linkedLista);
		System.out.println(linkedLista);
		Collections.shuffle(linkedLista);
		System.out.println(linkedLista);

		// === TreeSet === //
		Random gerador = new Random();
		
		TreeSet<Integer> treeInteiros = new TreeSet <Integer>();
		for(int i=0; i <20; i++) {
			treeInteiros.add(gerador.nextInt(49));
		}//FIM FOR
		System.out.println(treeInteiros);
		

	}//FIM CLASS MAIN

}//FIM CLASS USO
