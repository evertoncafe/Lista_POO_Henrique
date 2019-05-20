package com.everton.exer_08;

public class Conta {
	private String nomeCo;
	private float saldo;
	private static float taxJu;

	//GET's and SET's
	public String getNomeCo() {
		return nomeCo;
	}
	public void setNomeCo(String nomeCo) {
		this.nomeCo = nomeCo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if(saldoNegativo(saldo)){
			this.saldo = saldo;
		}
	}

	//GET's and SET's ESTATICOS
	public static float getTaxJu() {
		return taxJu;
	}
	public static void setTaxJu(float taxJu) {
		Conta.taxJu = taxJu;
	}

	//CONSTRUTORES
	public Conta(String nomeCo, float saldo) throws Exception {
		this.nomeCo = nomeCo;
		setSaldo(saldo);
	}
	public Conta(String nomeCo) throws Exception{
		this.nomeCo = nomeCo;
		this.saldo = 0;
	}

	//METODOS
	public String toString() {
		StringBuilder x = new StringBuilder();
		x.append("Correntista: ");
		x.append(this.getNomeCo());
		x.append("\nSaldo: ");
		x.append(this.getSaldo());
		x.append("\nTaxa de juros: ");
		x.append(Conta.getTaxJu());
		return x.toString(); 
	}

	public boolean equals(Object conta) {
		Conta comp = (Conta) conta;
		if(this.getNomeCo().equals(comp.getNomeCo()) && this.getSaldo() == comp.getSaldo()) {
			return true;
		}
		return false;
	}
	public void saqueConta(float valor) {
		try{
			setSaldo(getSaldo() - valor);
			System.out.println("Valor sacado: " + valor);
		}//FIM TRY
		catch(Exception erro) {
			System.out.println("=== Valor inválido solicitado ===\n");
		}//FIM CATCH
	}//FIM SAQUE CONTA
	//METODOS ESTATICOS
	public static void corrigirJuros(Conta x) {
		float newSaldo;
		System.out.println(x);
		newSaldo = x.getSaldo() - (x.getSaldo()*(Conta.taxJu/100));
		x.setSaldo(newSaldo);
		System.out.println("Saldo Corrigido:  " + newSaldo + ";\n");

	}// FIM CORRIGIR JUROS
	public static boolean saldoNegativo(float saldo) {
		if(saldo < 0) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}//FIM IF
		return true;
	}//FIM SALDO NEGATIVO


}//FIM CONTA
