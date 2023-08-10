package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Triangle;

public class program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);		
		
		Triangle X = new Triangle();
		Triangle Y = new Triangle();
		
		
		System.out.println("Informe as medidas do triangulo X: ");
		X.a=in.nextDouble();
		X.b=in.nextDouble();
		X.c=in.nextDouble();
		

		System.out.println("Informe as medidas do triangulo Y: ");
		Y.a=in.nextDouble();
		Y.b=in.nextDouble();
		Y.c=in.nextDouble();		
		
		if(X.a == X.b && X.b == X.c) {
			System.out.println("EQUILATERO");
		}else if(X.a == X.b || X.b == X.c || X.c == X.a) {
			System.out.println("ESCALENO");
		}else {
			System.out.println("ISÓCELES");
		}
		
		if(Y.a == Y.b && Y.b == Y.c) {
			System.out.println("EQUILATERO");
		}else if(Y.a == Y.b || Y.b == Y.c || Y.c == Y.a) {
			System.out.println("ESCALENO");
		}else {
			System.out.println("ISÓCELES");
		}
		
		
		double areaDeX = X.area();
		double areaDeY = Y.area();
		
		
		System.out.printf("A area do triangulo X é: %.2f%n",areaDeX);
		System.out.printf("A area do triangulo Y é: %.2f",areaDeY);		
		
		in.close();
	}

}
