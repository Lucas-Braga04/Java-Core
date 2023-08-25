package alistamento;

import java.util.Scanner;

public class PaginaDeInscricao {
	
	public void inscricao() {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome completo: ");
		String namesCandidatos = in.next();
		
		System.out.println("\nDigite seu ano de nascimento: ");
		int idades = in.nextInt();
		
		System.out.println("Digite o nome da sua mâe: ");
		String nameParents = in.next();
		
		System.out.println("Digite o nome do seu pai: ");
		nameParents = in.next();
		
		System.out.println("Informe seu número de telefone: ");
		long cellPhone = in.nextLong();
		
		Nomes nomes = new Nomes(namesCandidatos, nameParents);
		Idade idade = new Idade(idades);
		Telefone celular = new Telefone(cellPhone);
		in.close();
	}

}
