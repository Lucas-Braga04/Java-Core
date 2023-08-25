package application;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Start_Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Conta conta;
		
		int numberAccount = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número da conta: ", "Abertura da conta", JOptionPane.PLAIN_MESSAGE));
		String donoDaConta= JOptionPane.showInputDialog(null, "Informe o nome do dono da conta: ", "Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		String seraQueVaiTerDeposito  = JOptionPane.showInputDialog(null, "Terá depósito inicial ? Y / N", "Abertura da conta", JOptionPane.PLAIN_MESSAGE);
		seraQueVaiTerDeposito = seraQueVaiTerDeposito.toUpperCase();
		char temDepositoSimNao = seraQueVaiTerDeposito.charAt(0);
		
		if(temDepositoSimNao == 'Y') {
			double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para o depósito: ", "Abertura da conta", JOptionPane.PLAIN_MESSAGE));
			conta = new Conta(numberAccount, donoDaConta, depositoInicial);
		}else {
			conta = new Conta(numberAccount, donoDaConta);
		}
		
		JOptionPane.showMessageDialog(null, conta,"Dados da conta", JOptionPane.INFORMATION_MESSAGE);
		
		double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do depósito", "Deposito em conta", JOptionPane.PLAIN_MESSAGE));
		conta.getDeposito();
		
		
	}

}
