package com.everton.exer_05;
/*
 * @author MIGOINHO - EXERCICIO 05
 */
public class Aluno {
	private String nome;
	private double nota1, nota2, media, pontos;
	static private double maxNota = 10;
	
	// QUATRO CONSTRUTORES SOBRECARREGADOS
	public Aluno (String _nome, double _nota1, double _nota2, double _pontos) throws Exception {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}// SOBRECARGA 4 ENTRADAS
	public Aluno (double _nota1, double _nota2, double _pontos) throws Exception{
		this("sem nome", _nota1, _nota2, _pontos);
	}// SOBRECARGA 3 ENTRADAS
	public Aluno (double _nota1, double _nota2) throws Exception{
		this(_nota1, _nota2, 0.0);
	}// SOBRECARGA 2 ENTRADAS
	public Aluno () throws Exception{
		this(0.0, 0.0);
	}// SOBRECARGA SEM ENTRADA
	
	// METODOS GET's e SET's
	public String getNome() {return this.nome;}
	public void setNome(String _nome) {this.nome = _nome;}
	
	/*public double getNota1() {return this.nota1;}
	public double getNota2() {return this.nota2;}
	public double getMedia() {return this.media;}
	public double getPontos() {return this.pontos;}*/
	
	
	public void setPontos(double _pontos) throws Exception {
		this.pontos = _pontos; 
		this.calculaMedia(maxNota);}
	
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getMedia() {
		return media;
	}
	public double getPontos() {
		return pontos;
	}

	// METODOS STATICOS
	public static void setMaxNota(double x) {Aluno.maxNota = x;}
	public static double getMaxNota() {return Aluno.maxNota;}
	
	public static boolean verifNota(double x) {
		if(x < 0 || x > maxNota) {return false;}
		return true;
	}
	
	// TRATAMENTO DE ERROS, ESCOPO DO PROGRAMADOR DE CLASSES (COMANDOS THROW E THROWS)
	public void setNotas (double _nota1, double _nota2, double _pontos) throws Exception {
		this.pontos = _pontos;
		if(Aluno.verifNota(_nota1) && Aluno.verifNota(_nota2)) {
			this.nota1 = _nota1;
			this.nota2 = _nota2;
			this.calculaMedia(maxNota);
		}
		else  throw new Exception("nota invalida");
	}// FIM SET NOTAS 1
	
	public void setNotas(double _nota1, double _nota2) throws Exception {
		this.setNotas(_nota1, _nota2, 0);
	}// FIM SET NOTAS 2
	
	//METODO CALCULA MEDIA
	public double calculaMedia (double maxNota) throws Exception {
		this.media = ((this.nota1 + this.nota2 + this.pontos)/2);
		if(this.media >= 0 && this.media <= maxNota){return this.media;}
		else {return this.media = maxNota;}
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("Aluno(a):\t");  info.append(this.getNome());
		info.append("\nNota 01:\t");	info.append(this.getNota1());
		info.append("\nNota 02:\t"); info.append(this.getNota2());
		info.append("\nPontos:\t\t");  info.append(this.getPontos());
		info.append("\nMedia:\t\t");   info.append(this.getMedia());
		return info.toString();
	}
	
}//FIM MAIN
