package entities;

public class AccountBank {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public AccountBank(int numeroConta, String nomeTitular, double saldoInicial) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldoInicial;
	}

		
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de " + valor + " realizado com sucesso!");
	}
	
	public void sacar(double valor) {
		double valorComTaxa = valor + 5;
		if(saldo >= valorComTaxa) {
			saldo -= valorComTaxa;
			System.out.println("Saque de " + valor + " realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}


	
	
}
