package estruturaDeDecisao;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//ele vai pedir par o usuario digitar 5 numero e quando digitado o 0 será finalizado o programa
		
		double valor1 = 0;
		double valor2 = 0;  
		double valor3 = 0;
		double valor4 = 0;
		double valor5 = 0;
		double soma = valor1 + valor2+ valor3 + valor4 + valor5;
		System.out.println("Digite o primeiro valor: ");
		valor1 = in.nextDouble();
		if(valor1 != 0) {
			System.out.println("Digite o segundo valor: ");
			valor2 = in.nextDouble();
			}else if(valor1 == 0) {
				System.out.println("Você digitou 0, sua sessão foi finalizada");
			}if(valor2 !=0) {
				System.out.println("Digite o terceiro valor: ");
				valor3 = in.nextDouble();
			}else if(valor2 == 0) {
				System.out.println("Você digitou 0, sua sessão foi finalizada");
			}if(valor3 !=0){
				System.out.println("Digite o quarto valor: ");
				valor4 = in.nextDouble();
			}else if(valor3 == 0) {
				System.out.println("Você digitou 0, sua sessão foi finalizada");
			}if(valor4 != 0) {
				System.out.println("Digite o quinto valor: ");
			valor5 = in.nextDouble();
			}else if(valor4 == 0) {
				System.out.println("Você digitou 0, sua sessão foi finalizada");
			}if(valor5 != 0) {
				System.out.printf("O primeiro valor é: %.2f%nO segundo é: %.2f%nO terceiro é: %.2f%nO quarto é: %.2f%nO quinto é: %.2f",valor1, valor2, valor3, valor4, valor5);
				System.out.printf("Sessão finalizada quantidade de numeros atingiu seu limite, soma dos valores foi: %.2f",soma);
			}else {
				System.out.println("Você digitou 0, sua sessão foi finalizada");
			}
	
		
		
		
		in.close();
	}

}
