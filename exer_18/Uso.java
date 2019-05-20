package com.everton.exer_18;

public class Uso {
	public static void main(String args[]) {
		LivroDeBiblioteca exemplar01 = new LivroDeBiblioteca("Desastre", "Everton", 10, 2010, false, "Biblioteca", "nada");
		System.out.println(exemplar01);
		
		System.out.println("O livro esta emprestado?");
		if(exemplar01.isEmprestado()) {
			System.out.println("\nEsta emprestado.\n");
		}//FIM IF
		else {
			System.out.println("\nNão emprestado.\n");
		}//FIM ELSE

	}
}
