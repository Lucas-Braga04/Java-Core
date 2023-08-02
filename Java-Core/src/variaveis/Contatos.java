package variaveis;

import java.util.Scanner;

public class Contatos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//String name;
		String email;
		long telefone;
		
		System.out.printf("Insira seu seu nome: ");
		String name = in.next();
		System.out.println("Insira seu email: ");
		email = in.next();
		System.out.println("Insira seu número de telefone: ");
		telefone = in.nextLong();
		
		
		System.out.printf("Dados: %nNome: %s%nEmail: %s%nTelefone: %d",name,email,telefone);
		
		
		
		
		in.close();
	}

}
