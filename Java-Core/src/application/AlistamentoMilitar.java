package application;

import java.util.Scanner;

import alistamento.PaginaDeInscricao;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PaginaDeInscricao inscricao = new PaginaDeInscricao();
		
		System.out.println("Sejam Bem-Vindos ao Alistamento Militar Obrigatório");
		
		
		 while(inscricao.continuarCadastrando(scanner)) {
			 inscricao.inscricao(scanner); 
			
		 }
		 inscricao.Exibicao();
		 scanner.close();
	
	}

}
