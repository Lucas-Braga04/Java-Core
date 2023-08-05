package estruturaDeDecisao;

import java.util.Scanner;

public class Caso {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Solicitar um número até o usuário informar 0
		int valor = 0;
		
		System.out.println("Digite um número: ");
		valor = in.nextInt();
		
		switch (valor) {
		case 1: System.out.println("Você errou");
			System.out.println("Deposite mais R$ 20.00");
			break;
		case 2: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 3: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 4: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 5: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 6: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 7: System.out.println("Você acertou, Parabéns!!!");
			break;
		
		case 8: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 9: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;
		
		case 10: System.out.println("Você errou");
		System.out.println("Deposite mais R$ 20.00");
			break;	
		
		default: System.out.println("Tente novamente informando entre 1 e 10");
			break;
		}
		
		in.close();
		
	}

}
