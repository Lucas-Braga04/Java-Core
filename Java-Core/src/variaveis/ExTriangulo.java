package variaveis;

import java.util.Scanner;

public class ExTriangulo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double aX = 0;
		double bX = 0;
		double cX = 0;
		
		double aY = 0;
		double bY = 0;
		double cY = 0;
		
		double somax = 0;
		double somay = 0;
		
		double operacaoX;
		double operacaoY;

		
		System.out.println("Informe o primeiro valor do triângulo X: ");
		aX = in.nextDouble();
		System.out.println("Informe o segundo valor do triângulo X: ");
		bX = in.nextDouble();
		System.out.println("Informe o terceiro valor do triângulo X: ");
		cX = in.nextDouble();
		System.out.println("");
		
		
		
		somax = (aX + bX + cX) / 2;
		

		System.out.println("Informe o primeiro valor do triângulo y: ");
		aY = in.nextDouble();
		System.out.println("Informe o segundo valor do triângulo y: ");
		bY = in.nextDouble();
		System.out.println("Informe o terceiro valor do triângulo y: ");
		cY = in.nextDouble();
		System.out.println("");
		
		somay = (aY + bY + cY) / 2;
		
		
		operacaoX = Math.sqrt(somax * (somax - aX) * (somax - bX) * (somax - cX));
		operacaoY = Math.sqrt(somay * (somay - aY) * (somay - bY) * (somay - cY));

		
		
			
		System.out.printf("Triangulo X area: %.2f%n%n", operacaoX);
		System.out.printf("Triangulo Y area: %.2f%n%n", operacaoY);		
		
		if(operacaoX > operacaoY && operacaoY < operacaoX) {
			System.out.println("Larger area X");
		}else if(operacaoY > operacaoX && operacaoX < operacaoY){
			System.out.println("Larger area Y");
		}else {
			System.out.println("Equal areas");
		}
		
		in.close();
	}
}