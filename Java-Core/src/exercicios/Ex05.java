package exercicios;

import java.util.Scanner;

public class Ex05 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int codPeca1 = 0;
		int numPeca1 = 0;
		double valorPeca1 = 0;
		int codPeca2 = 0;
		int numPeca2 = 0;
		double valorPeca2 = 0;
		
		System.out.println("Qual o código da primeira peça: ");
		codPeca1 = in.nextInt();
		System.out.println("Quantidade de peças: ");
		numPeca1 = in.nextInt();
		System.out.println("Valor de cada peça: ");
		valorPeca1 = in.nextDouble();
		System.out.println("Qual o código da segunda peça: ");
		codPeca2 = in.nextInt();
		System.out.println("Quantidade de peças: ");
		numPeca2 = in.nextInt();
		System.out.println("Valor de cada peça: ");
		valorPeca2 = in.nextDouble();
		
		
		double calculoPeca1 = numPeca1 * valorPeca1;
		double calculoPeca2 = numPeca2 * valorPeca2;
		double resultado = calculoPeca1 + calculoPeca2;
		
		
		System.out.printf("%nCódigo da peça 1: %d%nNúmero de peças: %d%nValor Unitário: %.2f%n%nCódigo da peça 2: %d%nNúmero de peças: %d%nValor Unitário: %.2f%n%n",codPeca1,numPeca1,valorPeca1,codPeca2,numPeca2,valorPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", resultado);
		
		
		in.close();
	}

}
