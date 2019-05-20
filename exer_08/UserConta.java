package com.everton.exer_08;
import java.util.ArrayList;
import java.util.Scanner;

public class UserConta {
	public static void main(String args[]) {
		boolean x = true;
		ArrayList<Conta> contas = new ArrayList<Conta>(); //ARRAY PARA ARMAZENAR AS INSTANCIAS
		Scanner operacao = new Scanner(System.in);
		while(x) {
			try {
				System.out.println("\n === MENU ===");
				System.out.println(" 01 = CRIAR CONTA");
				System.out.println(" 02 = IMPRIMIR CONTAS");
				System.out.println(" 03 = CORRIGIR JUROS");
				int n = contas.size();
				int op = operacao.nextInt();

				//DECLARANDO OS JUROS
				Conta.setTaxJu(10);
				switch(op) {
					case 1:{
						Scanner entradaName = new Scanner(System.in);
						Scanner valorSaldo = new Scanner(System.in);
						//LENDO OS VALORES A SEREM ATRIBUIDOS	
						System.out.println("NOME: ");
						String name = entradaName.nextLine();
						System.out.println("SALDO: ");
						float saldo = valorSaldo.nextFloat();
						//ARMAZENANDO NA LISTA
						contas.add(n, new Conta(name, saldo));;
						//entradaName.close();
						//valorSaldo.close();
						
						break;
					}//FIM CASE 1
					case 2:{
						imprimirContas(contas);
						break;
					}//FIM CASE 2
					case 3:{
						System.out.println("\n=== CORRIGINDO JUROS ===");
						imprimirContas(contas);
						System.out.println("SELECIONE UMA CONTA: ");

						//DECLARANDO OS JUROS
						Conta.setTaxJu(10);
						Scanner conta = new Scanner(System.in);
						n = conta.nextInt();
						Conta.corrigirJuros(contas.get(n-1));
						break;
					}//FIM CASE 3
					default:{
						break;
					}
				}//FIM SWITCH
				
			}//FIM TRY
			catch(Exception e) {

			}//FIM CATCH
		}//WHILE
		operacao.close();
	}//FIM MAIN
	public static void imprimirContas(ArrayList<?> lista) {

		System.out.println("=== IMPRIMINDO CONTAS ===");
		for(int n=0; n<lista.size(); n++) {
			System.out.println("==============================");
			System.out.println("Conta: " + (n+1));
			System.out.println(lista.get(n).toString());
		}//FIM FOR
	}
}//FIM USER CONTA



// === ANOTACOES === //
//DEMONSTRANDO OS DADOS SETADOS

/*System.out.println(conta1);
System.out.println(conta2);
//COMPARANDO OS OBJETOS
if(conta1.equals(conta2)) {
	System.out.println("\ncontas iguais\n");
}else {
	System.out.println("\nContas diferentes\n");
}
//USANDO OS JUROS
Conta.corrigirJuros(conta1);
System.out.println(conta1);
//COMPARANDO NOVAMENTE
if(conta1.equals(conta2)) {
	System.out.println("\ncontas iguais\n");
}else {
	System.out.println("\nContas diferentes\n");
}
conta1.saqueConta(100);
System.out.println(conta1);
}//FIM TRY
catch (Exception e) {
System.out.println("Dados invalidos");
x = false;
break;

}*/