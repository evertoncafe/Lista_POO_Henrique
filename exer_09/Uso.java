package com.everton.exer_09;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uso {
	public static void main(String args[]) {
		try {
			ArrayList<Ponto> pontos = new ArrayList<Ponto>(); //ARRAY PARA ARMAZENAR AS INSTANCIAS
			Ponto pontoUser = new Ponto();
			
			Random nAleatorios = new Random();
			
			System.out.println("Digite um ponto x, y");
			Scanner scan = new Scanner(System.in);
			String pontoIn = scan.nextLine();
			pontoUser.setPontos(pontoIn);
			scan.close();
			for(int n=0; n<100; n++) {
				double valor01 = nAleatorios.nextDouble()*Ponto.getLimitesuperior();
				double valor02 = nAleatorios.nextDouble()*Ponto.getLimitesuperior();
				pontos.add(n, new Ponto(valor01, valor02));
			}
			
			for(int n=0; n<100; n++) {
				System.out.println(n+1 + " - Distancia entre " + pontoUser.toString() + "e " + pontos.get(n).toString() + ": " + pontoUser._distancia(pontos.get(n)));
				System.out.println();
			}
			/*
			Ponto pontoA = new Ponto("1, 2");
			Ponto pontoB = new Ponto(1, 3);
			Ponto pontoC = new Ponto();
			Ponto pontoD = new Ponto();

			System.out.println("Ponto A: " + pontoA);
			System.out.println("Ponto B: " + pontoB);
			System.out.println("Ponto C: " + pontoC);

			System.out.println("Sao iguais? " + Ponto.CompareEquals(pontoA, pontoB));
			pontoB.setPontos(1, 2);
			System.out.println("Ponto B: " + pontoB);
			System.out.println("Sao iguais? " + Ponto.CompareEquals(pontoA, pontoB));

			System.out.println("Clonando pontoB:");
			pontoC = Ponto.clonar(pontoB);
			System.out.println("Ponto C: " + pontoC);

			pontoD = Ponto.criaSwap(pontoA);
			System.out.println("Ponto D: " + pontoD);

			System.out.println("============================================");
			System.out.println("Ponto D: " + pontoD);
			System.out.println("Ponto A: " + pontoA);
			System.out.println("Tem eixo comum? " + pontoD.temEixoComum(pontoA));

			System.out.println("============================================");
			System.out.println("Ponto B: " + pontoB);
			System.out.println("Ponto A: " + pontoA);
			System.out.println("Tem eixo comum? " + pontoB.temEixoComum(pontoA));

			System.out.println("============================================");
			pontoA.setPontos("3,8");
			System.out.println("Ponto A: " + pontoA);

			pontoB.setPontos("1, 8");
			System.out.println("Ponto B: " + pontoB);
			
			System.out.println("============================================");
			System.out.println("Distancia entre A e B: " + pontoA._distancia(pontoB));
			System.out.println("Distancia entre A e B: " + pontoA._distancia(1 , 8));
			System.out.println("Distancia entre A e B: " + Ponto._distancia(3, 8, 1, 8));
			System.out.println("Distancia entre A e B: " + Ponto._distancia(pontoA, pontoB));
			System.out.println("Distancia entre A e Origem: " + pontoA.distanciaDaOrigem());
			System.out.println("Distancia entre B e Origem: " + pontoB.distanciaDaOrigem());
			System.out.println("Distancia entre A e B sao iguais? " + Ponto._compareTo(pontoA, pontoB));

			System.out.println("============================================");
			pontoA.setPontos("1,8");
			System.out.println("Ponto A: " + pontoA);
			System.out.println("Ponto B: " + pontoB);
			System.out.println("Distancia entre A e B sao iguais? " + Ponto._compareTo(pontoA, pontoB));

			//pontoA.setPontos("1,2,3");
			//pontoA.setPontos(1, 3011);
			*/
		}
		catch (Exception e){
			System.out.println("Error - Valores incorretos - limite de 0 a 500.");
		}


	}
}
