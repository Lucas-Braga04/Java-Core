package entities;

public class DepositBank {

	public static void realizarDeposito(AccountBank account, double valor) {
		account.depositar(valor);
	}
	
	
}
