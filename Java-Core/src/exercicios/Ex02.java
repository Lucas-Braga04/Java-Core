package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		
		final double pi = 3.14159;
		double raio = 0;
		
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = in.nextDouble();
		
		
		double calc = (raio*raio)*pi ;
		
		System.out.printf("A = %.4f",calc );
		
		in.close();
	}

}
