package com.everton.exer_06;
/*
 * @author MIGOINHO - EXERCICIO 06
 */

public class Uso {
	public static void main(String Args[]) {
		try {
			Data data01 = new Data("29 02 2012");
			System.out.println(data01);
			
			
			/*	Scanner scanner = new Scanner (System.in);
				String valor = scanner.nextLine(); //LEITURA
				
				minhaData.lendoString(valor);
				System.out.println(minhaData);	
			*/
		}//FIM TRY
		catch(Exception e) {
			System.out.println("Data invalida");
		}//FIM CATCH
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
