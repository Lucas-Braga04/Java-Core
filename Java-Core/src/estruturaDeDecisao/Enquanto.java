package estruturaDeDecisao;

public class Enquanto {

	public static void main(String[] args) {
		
		//Implementação da variável números
		//int numeros = 0;
		
		//Imprimir na tela todos os números de 1 a 11
		//while(numeros <= 11) {	
			
			//System.out.println(numeros);
			//Incrementando +1 enquanto a condição for verdadeira
			//numeros++;
			
			
		//}
		//montar uma estrutura while onde mostre na tela todos os numeros que são impares de 0 a 10
		int numero = 0;
		while(numero % 2 != 0) {
			
			System.out.println(numero);
			numero ++;
		}
		
		
		int numerosImpares = 1;
		
		while(numerosImpares < 10) {
			
			System.out.println(numerosImpares);
			numerosImpares += 2;
		
		}
		
		int number = 0;
		while(number <= 10) {
			if(number % 2 == 0) {
				System.out.println("Pares");
			}else if(number % 2 == 1) {
				System.out.println(number);
			}
			number++;
		}
		
	}

}
