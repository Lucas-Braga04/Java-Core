package application;

import util.*;
import java.util.Locale;
import java.util.Scanner;

public class RaioSemMetodoNaPropriaClasse {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		Calculadora calc = new Calculadora();
		
		System.out.print("Enter value radius: ");
		double radius = in.nextDouble();
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value is: %.2f", calc.PI);
		
		
		in.close();
	}

}
