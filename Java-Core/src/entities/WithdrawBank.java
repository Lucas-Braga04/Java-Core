package entities;

public class WithdrawBank {

	public static void realizarSaque(AccountBank account, double valor) {
		account.sacar(valor);
	}
	
	
}
