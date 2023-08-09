package oop;

import java.util.Scanner;

public class Triangulo {
	
	
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		
		
		Triangulo x = new Triangulo();
		x.ladoA = 3.00;
		x.ladoB = 4.00;
		x.ladoC = 2.00;
		
		System.out.println("Digite o primeiro valor: ");
		x.ladoA = in.nextDouble();
		System.out.println("Digite o primeiro valor: ");
		x.ladoB = in.nextDouble();
		System.out.println("Digite o primeiro valor: ");
		x.ladoC = in.nextDouble();
		
		System.out.println(x.ladoA);
		System.out.println(x.ladoB);
		System.out.println(x.ladoC);
		
		System.out.println();
		
		
		Triangulo y = new Triangulo();
		y.ladoA = 3.00;
		y.ladoA = 4.00;
		y.ladoA = 2.00;
		
		
		
		in.close();
	}

}
