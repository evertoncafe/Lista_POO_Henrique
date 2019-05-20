package com.everton.exer_05;
/*
 * @author MIGOINHO - EXERCICIO 05
 */
public class Uso {
	public static void main(String args[]) {
		while(true){
			try {
				System.out.println("nota maxima: " + Aluno.getMaxNota() + "\n");
				Aluno x = new Aluno("Astolfo", 8, 11, 5);
				System.out.println(x);
				
				//x.setNotas( 8, 11, 5);
				//System.out.println("\nnota maxima: " + Aluno.getMaxNota() + "\n");
				//System.out.println(x);
				break;
			}
			catch (Exception e){
				System.out.println("Nota imvalida, valor permitido de 0 a " + Aluno.getMaxNota()+"\n");
				System.out.println("Alterando a nota maxima para 11.");
				Aluno.setMaxNota(11);
			}//FIM CATCH 1
		}//FIM WHILE
	}//FIM MAIN
}//FIM USO
