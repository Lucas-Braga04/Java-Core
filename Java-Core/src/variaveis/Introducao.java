package variaveis;

import java.util.Locale;
import java.util.Scanner;

public class Introducao {

	public static void main(String[] args) {
		// Variáveis locais.
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		
		//int lapis = 0;
		//float leite = 4.0f, agua = 5.0f;
		//float cafe = 4.5f;

		//agua = cafe;
		
		//double x = 10.35784;
		
		//System.out.printf("RESULTADO = ", x , " METROS");
		//System.out.println();
		//System.out.printf("RESULTADO = % .2f METROS%n ", x);
		//System.out.printf("RESULTADO = % .4f METROS%n ", x);

		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
		
		
		
		in.close();
	}

}
