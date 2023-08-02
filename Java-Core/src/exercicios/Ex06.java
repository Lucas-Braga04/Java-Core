package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a = 0;
		double b = 0;
		double c = 0;
		final double pi = 3.14159;
		
		System.out.println("Valor de A: ");
		a = in.nextDouble();
		System.out.println("Valor de B: ");
		b = in.nextDouble();
		System.out.println("Valor de C: ");
		c = in.nextDouble();
		
		double triangulo = (a * c) / 2;
		double circunferencia = pi * (c*c);
		double trapezio = ((a + b) * c) / 2;
		double quadrado = b * b;
		double retangulo = a * b;
				
		System.out.printf("%n%nTRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circunferencia);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		in.close();
	}

}