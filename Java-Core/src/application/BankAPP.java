package application;

import java.util.Locale;
import java.util.Scanner;
import entities.*;

// https://github.com/Lucas-Braga04/AccountBank


public class BankAPP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o número da conta: ");
		int numeroConta = in.nextInt();
		in.nextLine(); //Limpando o buffer
		
		System.out.println("Digite o nome do titular da conta: ");
		String nomeTitular = in.nextLine();
		
		System.out.println("Deseja realizar um depósito inicial? (S/N)");
		char escolhaDeposito = in.next().charAt(0);
		
		
		double saldoInicial = 0;
		if(escolhaDeposito == 'S' || escolhaDeposito == 's') {
			System.out.println("Entre com valor inicial para o depósito: ");
			saldoInicial = in.nextDouble();
		}
		
		AccountBank account = new AccountBank(numeroConta, nomeTitular, saldoInicial);
		
		while(true) {
			System.out.println("\nOpções: ");
			System.out.println("1 - Realizar depósito");
			System.out.println("2 - Realizar saque");
			System.out.println("3 - Ver saldo");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção: ");
			int opcao = in.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor do depósito: ");
				double valorDeposito = in.nextDouble();
				DepositBank.realizarDeposito(account, valorDeposito);
				exibirDadosConta(account);
				break;
			case 2:
				System.out.println("Digite o valor do saque: ");
				double valorSaque = in.nextDouble();
				WithdrawBank.realizarSaque(account, valorSaque);
				exibirDadosConta(account);
				break;
				
			case 3: 
				BalanceAccount.verificarSaldo(account);
				break;
				
			case 4:
				System.out.println("Saindo do sistema...");
				in.close();
				System.exit(0);
				
				default:
					System.out.println("Opção inválida.");
			}
		}
	}
	
	private static void exibirDadosConta(AccountBank account) {
		System.out.println("Dados da conta: ");
		System.out.println("Número da conta: " + account.getNumeroConta());
		System.out.println("Nome do titular: " + account.getNomeTitular());
		System.out.println("Saldo: " + account.getSaldo());
	}

}
