package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	
	    int funcionario = 0;
	    int horasTrab = 0; 
	    double valorHora = 0;
	
	    System.out.println("Qual o número do Funcionário: ");
	    funcionario = in.nextInt();
	
	    System.out.println("Quantas horas foram trabalhadas: ");
	    horasTrab = in.nextInt();
	
	    System.out.println("Qual valor por hora: ");
	    valorHora = in.nextDouble();
	
	    double salario = horasTrab * valorHora;
	
	    System.out.printf("NUMBER = %d", funcionario);
	    System.out.printf("%nSALARY = U$ %.2f", salario);
	
	    in.close();
	}
}