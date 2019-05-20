package com.everton.exer_03;
//PACKAGEs
//IMPORT'S
//import java.util.Scanner;

/**
* @author Migoinho - Exercicio - 03
*/

public class Main {
	public static void main(String Args[]) {
		
		Data data01 = new Data("10-10-2010");
		Data data02 = new Data("11-10-2015");
		
		compDate(data01, data02);
		
		data01.setData("11-10-2015");
		compDate(data01, data02);
		
	/*	Scanner scanner = new Scanner (System.in);
		String valor = scanner.nextLine(); //LEITURA
		
		minhaData.lendoString(valor);
		System.out.println(minhaData);	
	*/
	}//FIM MAIN
	//FUNCOES
	public static void compDate(Data x, Data y) {
		if(x.comparaData(x, y)) {System.out.println("Datas iguais");}
		else {System.out.println("Datas diferentes");}
		
	}
}//FIM CLASS MAIN

/*	ANOTAÇÔES
 *  
 *  METODO SCANNER:
 * 	Scanner scanner = new Scanner (System.in);
 * 	scanner.nextline(); // para strings
 * 	scanner.nextInt(); // para inteiros
 *
 *	Metodo com java.io:
 * 	BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
 * 	String entrada = in.readline();
 * 	System.out.println("voce digitou: " + entrada);
 * 
 * 	String valorTxt[] = valor.split(",| |-|/");
 *	
 */
