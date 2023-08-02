package variaveis;

import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b;
		int result;
		
		a = 5.0;
		b = 2.0;
		
		result = (int)((int)a / b);
		
		System.out.println(result);
		
		double a2;
		int b2;
		
		a2 = 5.0;
		b2 = (int) a2;
		
		System.out.println(b2);
		
		
		//Entrada de dados
		
		
		in.close();
	}

}
