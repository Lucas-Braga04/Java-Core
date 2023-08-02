package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		System.out.println("Digite o valor de C: ");
		c = in.nextInt();
		System.out.println("Digite o valor de D: ");
		d = in.nextInt();
		
		double calculo = a*b - c*d;
		
		
		System.out.printf("Diferença = %.0f",calculo);
		
		
		in.close();
	}

}
