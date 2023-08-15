package application;

import util.CalculadoraComMetodosStatics;
import java.util.Locale;
import java.util.Scanner;

public class RaioSemMetodoSemInstaciacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in =new Scanner (System.in);
		
		System.out.printf("Enter value Radius: ");
		double radius = in.nextDouble();
		
		double c = CalculadoraComMetodosStatics.circumference(radius);
		double v = CalculadoraComMetodosStatics.volume(radius);
		
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Value PI is: %.2f", CalculadoraComMetodosStatics.PI);
		
		
		in.close();
	}

}
