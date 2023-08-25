package alistamento;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class PaginaDeInscricao {
	
	private Candidato[] candidatos = new Candidato[100];
	private int candidatosRegistered = 0;
	public void inscricao(Scanner scanner) {
		
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
		
		System.out.println("Digite seu nome completo: ");
		String name= scanner.next();
		scanner.nextLine();
		System.out.println("\nDigite seu ano de nascimento: ");
		int bDayYear = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite o nome da sua mãe: ");
		String nameMother = scanner.nextLine();
		
		System.out.println("Digite o nome do seu pai: ");
		String nameFather = scanner.nextLine();
		
		System.out.println("Informe seu número de telefone: ");
		long cellPhone = scanner.nextLong();
		
		System.out.println("Informe seu email: ");
		String email = scanner.next();
		
		System.out.println("Qual sua altura em metros (Ex: 1,78 ou 1.78): ");
		double height = lerAltura(scanner, numberFormat);
		
		System.out.println("Qual seu peso: ");
		double weight = lerPeso(scanner, numberFormat);
		
		Candidato candidato = new Candidato(name, bDayYear, nameMother, nameFather, cellPhone, email, height, weight);
		candidatos[candidatosRegistered] = candidato;
		candidatosRegistered++;
	}
	
	private double lerAltura(Scanner scanner, NumberFormat numberFormat) {
	    while (true) {
	    	numberFormat = NumberFormat.getInstance(Locale.US);
	        try {
	            String input = scanner.nextLine().replace(',', '.');
	            return numberFormat.parse(input).doubleValue();
	        } catch (ParseException e) {
	            System.out.println("Formato inválido. Digite sua altura novamente (Ex: 1,78 ou 1.78):");
	        }
	    }
	}
	
	private double lerPeso(Scanner scanner, NumberFormat numberFormat) {
    	numberFormat = NumberFormat.getInstance(Locale.US);
		while(true) {
			try {
				String input = scanner.nextLine().replace(',', '.');
				return numberFormat.parse(input).doubleValue();
			}catch(ParseException e) {
				System.out.println("Formato inválido. Digite seu peso novamente (Ex: 86,5 ou 86.5):");
			}
		}
	}
	
	public void Exibicao() {
		System.out.println("\nLista de Candidatos 2023: ");
		for(int i = 0; i < candidatosRegistered; i++ ) {
			Candidato candidato = candidatos[i];
			System.out.println("Candidato " + (i + 1) + ":");
			candidato.ExibicaoDadosCandidatos();
			candidato.verificacao();
			System.out.println("----------------------");
		}
	}

	public int getCandidatosRegistered() {
		return candidatosRegistered;
	}
	
	public boolean continuarCadastrando(Scanner scanner) {
		 System.out.println("\nDeseja realizar o Alistamento? (S/N): ");
		 String resposta = scanner.next();
		 scanner.nextLine();
		 return resposta.equalsIgnoreCase("S");
		 }
	
}
