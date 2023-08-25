package application;

public class Conta{

	private String donoDaConta;
	private int numberAccount;
	private double depositoInicial;
	private double deposito;
	
	public Conta(int numberAccount, String donoDaConta, double depositoInicial) {
		this.numberAccount = numberAccount;
		this.donoDaConta = donoDaConta;
		this.depositoInicial = depositoInicial;
	}
	


	public Conta(int numberAccount, String donoDaConta) {
		this.numberAccount = numberAccount;
		this.donoDaConta = donoDaConta;
	}

	public int getNumberAccount() {
		return numberAccount;
	}
	public String getDonoDaConta() {
		return donoDaConta;
	}
	public double getDepositoInicial() {
		return depositoInicial;
	}
	public double getDeposito() {
		return deposito;
	}
	
	
}
