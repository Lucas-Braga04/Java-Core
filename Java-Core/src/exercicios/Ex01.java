package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor = 0;
		int v2 = 0;

		
		
		
		System.out.println("Digite o primeiro valor: ");
		valor = in.nextInt();
		System.out.println("Digite o segundo valor: ");
		v2 = in.nextInt();
		
		
		int soma = valor + v2;
		
		System.out.printf("SOMA = %d", soma);

		
		
		in.close();
	}

}
