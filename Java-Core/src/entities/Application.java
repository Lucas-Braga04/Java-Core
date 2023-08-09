package entities;

import java.util.Scanner;

public class Application {
	
	public static void main() {
		Scanner in = new Scanner(System.in);		
		
		Triangle X = new Triangle();
		Triangle Y = new Triangle();
		
		
		System.out.println("Informe as medidas do triangulo X: ");
		X.a=in.nextDouble();
		X.b=in.nextDouble();
		X.c=in.nextDouble();
		
		System.out.println("Informe as medidas do triangulo X: ");
		Y.a=in.nextDouble();
		Y.b=in.nextDouble();
		Y.c=in.nextDouble();		
		
		
		double areaDeX = X.area();
		double areaDeY = Y.area();
		
		System.out.printf("A area do triangulo X é: %.2f",areaDeX);
		System.out.printf("A area do triangulo X é: %.2f",areaDeY);		
		
		in.close();
	}

}
