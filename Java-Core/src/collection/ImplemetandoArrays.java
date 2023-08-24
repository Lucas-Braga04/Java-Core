package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplemetandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		//Exemplo 01 array notas de um aluno
		
		double notasAlunoA[] = new double [4];
		
		//Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		notasAlunoA[3] = 9.5;
		
		
		//Exibição
		System.out.println(notasAlunoA);//Como array é um objeto, ele retorno um endereço de memoria ram
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
		
		
		//Exibição por meio de metodo de classe Arrays.
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		System.out.println("\n----Exibição com for----");
		//Formas  de percorrer um array

		double notas;
		
		for (int i = 0; i < 3; i++) {
			notas = notasAlunoA[i];
			notas += notasAlunoA[i];
			//System.out.println(notas);
			
			//Calcular a média
			 System.out.printf("Média das notas é: %.2f%n", notas / 3);
		
		}
		
		
		System.out.println("\nMetodo 2");
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			double nota = notasAlunoA[i];
			System.out.println(nota);
			
		}
		
		
		
		
		in.close();
	}

}
