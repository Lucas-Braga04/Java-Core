package collection;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ImplemetandoArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		//Exemplo 01 array notas de um aluno
		
		double notasAlunoA[] = new double [3];
		
		//Atribuição
		notasAlunoA[0] = 5.5;
		notasAlunoA[1] = 4.8;
		notasAlunoA[2] = 8.5;
		
		//Exibição
		System.out.println(notasAlunoA);//Como array é um objeto, ele retorno um endereço de memoria ram
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
		
		
		//Exibição por meio de metodo de classe Arrays.
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Formas  de percorrer um array
		
		
		
		
		
		
		in.close();
	}

}
