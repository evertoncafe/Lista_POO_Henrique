package com.everton.exer_02;
//PACKAGEs
//IMPORT'S
import java.util.Scanner;

/**
* @author Migoinho - Exercicio - 02
*/

public class Main {
	public static void main(String Args[]) {
		int nDia, nMes=0, nAno, tamVetor;
		Data minhaData = new Data();
		
		Scanner scanner = new Scanner (System.in);
		String valor = scanner.nextLine(); //LEITURA
		
		minhaData.lendoString(valor);
		System.out.println(minhaData);	
	}//FIM MAIN
	//FUNCOES
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

	tamVetor = valorTxt.length; //TAMANHO VETOR
	
	if(tamVetor == 3) {
		if(minhaData.mesIsTxt(valorTxt[1])) {
			nDia = Integer.parseInt(valorTxt[0]);
			nMes = minhaData.verificaMes(valorTxt[1]); //VERIFICA O MES
			nAno = Integer.parseInt(valorTxt[2]);
			minhaData.setData(nDia,nMes,nAno);
		}//FIM IF
		else {
			nDia = Integer.parseInt(valorTxt[0]);
			nMes = Integer.parseInt(valorTxt[1]);
			nAno = Integer.parseInt(valorTxt[2]);
			minhaData.setData(nDia, nMes, nAno);
		}//FIM ELSE
	}//FIM PRIMEIRO IF
	
	else if(tamVetor == 2) {
		if(minhaData.mesIsTxt(valorTxt[0])) {
			nMes = minhaData.verificaMes(valorTxt[0]); //VERIFICA O MES
			nAno = Integer.parseInt(valorTxt[1]);
			minhaData.setData(nMes,nAno);
		}//FIM IF
		else {
			nMes = Integer.parseInt(valorTxt[0]);
			nAno = Integer.parseInt(valorTxt[1]);
			minhaData.setData(nMes, nAno);
		}//FIM ELSE
	}//FIM ELSE IF
	
	else {System.out.println("Data invalida, Set Default");}
 */
