package com.everton.exer_24.src;
//import java.io.*;

/**
 * 
 * @author Migoinho - Exercicio - 04
 *
 */
public class Data {
	//DADOS DA CLASSE
	private int dia, mes, ano;
	private String mesTxt;

	//CONSTRUTOR
	public Data() {setData();}
	public Data(String x) {setData(x);}
	//public Data () {this.dia = 1; this.mes = 1; this.ano = 1900; this.mesTxt = "Janeiro";}

	//Get's and Set's
	public int getDia() {return dia;}
	public void setDia(int x) {this.dia = x;}

	public int getMes() {return mes;}
	public void setMes(int x) {this.mes = x;}

	public int getAno() {return ano;}
	public void setAno(int x) {this.ano = x;}

	public String getMesTxt() {return mesTxt;}
	public void setMesTxt(String x) {this.mesTxt = x;}

	// === METODOS === //
	//SET DATA DEFAULT
	public void setData() {this.dia = 1; this.mes = 1; this.ano = 1900; this.mesTxt = "Janeiro";}	
	//SET DATA COM 3 TERMOS
	public void setData(int a, int b, int c) {
		if(isDataValida(a, b, c)) {this.dia = a; this.mes = b; this.ano = c;}
		else {invalida(a, b, c); setData();}
	}//FIM SET DATA
	//SET DATA COM DOIS TERMOS MES E ANO
	public void setData(int b, int c) {
		if(isDataValida(1, b, c)) {this.dia = 1; this.mes = b; this.ano = c;}
		else {invalida(1, b, c); setData();}
	}//FIM SET DATA
	//SET DATA COM UM TERMO STRING UNICO
	public void setData(String x) {lendoString(x);}
	//VERIFICA SE A DATA EH VALIDA
	@SuppressWarnings("finally")
	public boolean isDataValida(int dia, int mes, int ano) {
		int nDia;
		boolean x = false;
		try{
			if(dia >= 0 && dia <= 31) {
				if(mes >= 1 && mes <= 12) {
					if(!(dia >29 && mes==2)) {
						if(ano > 1582) {
							switch(mes) {
							case 1:{nDia = 31; this.mesTxt = "Janeiro"; x = true;}

							case 2:{
								if (dia < 29){this.mesTxt = "Fevereiro"; x = true;}
								else if(isBissexto(ano)) {if(dia <= 29) {this.mesTxt = "Fevereiro"; x = true;}}
								else {x = false;}}

							case 3:{nDia = 31; this.mesTxt = "Março"; x = true;}

							case 4:{nDia = 30; if(dia <= nDia) {this.mesTxt = "Abril"; x = true;} else x = false;}

							case 5:{nDia = 31; this.mesTxt = "Maio"; x = true;}

							case 6:{nDia = 30; if(dia <= nDia) {this.mesTxt = "Junho"; x = true;} else x = false;}

							case 7:{nDia = 31; this.mesTxt = "Julho"; x = true;}

							case 8:{nDia = 31; this.mesTxt = "Agosto"; x = true;}

							case 9:{nDia = 30; if(dia <= nDia) {this.mesTxt = "Setembro"; x = true;} else x = false;}

							case 10:{nDia = 31; this.mesTxt = "Outubro"; x = true;}

							case 11:{nDia = 30; if(dia <= nDia) {this.mesTxt = "Novembro"; x = true;} else x = false;}

							case 12:{nDia = 31; this.mesTxt = "Dezembro"; x = true;}

							default: break;
							}//FIM SWITCH
						}//else return false; //ANO INVALIDO
					}//else return false;//MES INVALIDO
				}//else return false; //MES INVALIDO
			}//return false; //DIA INVALIDO
		}//FIM TRY
		catch(Exception e){System.out.println("Catch: Erro, Data invalida"); x = false;}
		finally {return x;}
	}//FIM IS DATA VALIDA
	//VERIFICA SE O ANO EH BISSEXTO
	public boolean isBissexto(int ano) {
		if(ano%4 == 0 && ano%100 != 0) {return true;}
		return false;
	}//FIM IS BISSEXTO
	//IMPRIMI A DATA FORMATADA
	public void incrementaData() {
		if(this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10  || this.mes == 12) {
			if(this.dia < 31) {
				this.dia++;
			}
			else if(this.dia == 31 && this.mes == 12) {
				this.setDia(1);
				this.setMes(1);
				this.ano++;
			}
			else {
				this.setDia(1);
				this.mes++;
			}
		}//FIM PRIMEIRO IF DE DATAS
		else if(this.mes == 2) {
			if(this.isBissexto(ano)) {
				if(this.dia < 29) {
					this.dia++;
				}
				else if(dia == 29) {
					this.setDia(1);
					this.mes++;
				}
			}
			else if(this.dia < 28) {
				this.dia++;
			}
			else if(this.dia == 28) {
				this.setDia(1);
				this.mes++;
			}
		}
		else {
			if(this.dia < 30) {
				this.dia++;
			}
			else if (this.dia == 30) {
				this.setDia(1);
				this.mes++;
			}
		}


	}//FIM FUNCAO INCREMENTA DATA
	public String toString() {
		StringBuilder dataEscrita = new StringBuilder();
		//ESCRITA NUMERICA
		dataEscrita.append(String.format("%02d", this.getDia()));
		dataEscrita.append("/");
		dataEscrita.append(String.format("%02d", this.getMes()));
		dataEscrita.append("/");
		dataEscrita.append(this.getAno());
		//ESCRITA POR EXTENSO
		dataEscrita.append("\n");
		dataEscrita.append(String.format("%02d",this.getDia()));
		dataEscrita.append(" de ");
		dataEscrita.append(this.getMesTxt());
		dataEscrita.append(" de ");
		dataEscrita.append(this.getAno());
		return dataEscrita.toString();
	}//FIM TOSTRING
	//VERIFICA SE O MES EH STRING OU NUMERICO
	public boolean mesIsTxt(String x) {
		int i=0; //n; // n = tamanho da string
		//n = x.length(); //tamanho da string
		//for(i=0; i<1; i++) {
		//COMPARA SE EH POR EXTENSO O MES
		if(x.charAt(i) >= 'A' && x.charAt(i) <= 'Z' || x.charAt(i) >= 'a' && x.charAt(i) <= 'z') {
			return true;}//FIM IF
		//}//FIM FOR
		return false;
	}//FIM mes Is Txt
	//CONVERTE A STRING EM INT
	public void lendoString(String x) {
		String valorTxt[] = x.split(",| |-|/");
		int tamVetor = valorTxt.length; //TAMANHO VETOR
		int nDia, nMes, nAno;
		try {
			if(tamVetor == 3) {
				if(mesIsTxt(valorTxt[1])) {
					nDia = Integer.parseInt(valorTxt[0]);
					nMes = verificaMes(valorTxt[1]); //VERIFICA O MES
					nAno = Integer.parseInt(valorTxt[2]);
					setData(nDia,nMes,nAno);
				}//FIM IF
				else {
					nDia = Integer.parseInt(valorTxt[0]);
					nMes = Integer.parseInt(valorTxt[1]);
					nAno = Integer.parseInt(valorTxt[2]);
					setData(nDia, nMes, nAno);
				}//FIM ELSE
			}//FIM PRIMEIRO IF

			else if(tamVetor == 2) {
				if(mesIsTxt(valorTxt[0])) {
					nMes = verificaMes(valorTxt[0]); //VERIFICA O MES
					nAno = Integer.parseInt(valorTxt[1]);
					setData(nMes,nAno);
				}//FIM IF
				else {
					nMes = Integer.parseInt(valorTxt[0]);
					nAno = Integer.parseInt(valorTxt[1]);
					setData(nMes, nAno);
				}//FIM ELSE
			}//FIM ELSE IF

		}
		catch(Exception e) {System.out.println(" catch Vetor Erro, Data invalida");}
		//else {System.out.println("Data invalida, Set Default");}
	}
	//VERIFICA A STRING MES E RETORNA SEU NUMERO CORRESPONDENTE
	public int verificaMes(String x) {

		switch(x){
		case "Janeiro":{return 1;}
		case "Fevereiro":{return 2;}
		case "Março":{return 3;}
		case "Abril":{return 4;}
		case "Maio":{return 5;}
		case "Junho":{return 6;}
		case "Julho":{return 7;}
		case "Agosto":{return 8;}
		case "Setembro":{return 9;}
		case "Outubro":{return 10;}
		case "Novembro":{return 11;}
		case "Dezembro":{return 12;}
		//MINUSCULO
		case "janeiro":{return 1;}
		case "fevereiro":{return 2;}
		case "março":{return 3;}
		case "abril":{return 4;}
		case "maio":{return 5;}
		case "junho":{return 6;}
		case "julho":{return 7;}
		case "agosto":{return 8;}
		case "setembro":{return 9;}
		case "outubro":{return 10;}
		case "novembro":{return 11;}
		case "dezembro":{return 12;}
		default: break;
		}//FIM SWITCH
		return 0;
	}
	//TRATA QUANDO A DATA EH INVALIDA
	public void invalida(int a, int b, int c) {System.out.println("Data "+ a +"/"+ b +"/"+ c +" invalida. Set Default.");}

	public boolean comparaData(Data x, Data y) {
		if(x.dia == y.dia && x.mesTxt.equals(y.mesTxt) && x.ano == y.ano) {return true;}
		return false;
	}
}//FIM CLASS DATA
