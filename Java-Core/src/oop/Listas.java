package oop;

import java.util.List;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		/* 
		 * Sintaxe para implementar uma lista
		 * List<tipo da lista> nome = new arrayList<>();
		 */
		
		
		//Implementando lista tipo string
		
		
		List<String> lista = new ArrayList<>();
		
		//adicionar os elementos dentro de uma lista
		
		lista.add("Matemática");
		lista.add("Física");
		lista.add("Biologia");
		lista.add("Portugês");
		lista.add("Geografia");
		lista.add("História");
		
		
		//Metodo para percorrer a lista
		for (String materias : lista) {
			System.out.println(materias);
		}
		System.out.println("-------------------------------------");
		
		//Inserir elemento entre um nodo
		
		lista.add(3,"Química");
		lista.add("Inglês");
		lista.add(5,"programação");
		for (String materias : lista) {
			System.out.println(materias);
		}
		
		//Verificar o tamanho de uma lista 
		System.out.println("------------------------------");
		System.out.println("A lista possui um tamanho de "+ lista.size() + " posições");
		
		
		//Remover elementos da lista
		lista.remove(2);
		lista.remove("Física");
		
		
		
		//Listar posicão de um elemento
		System.out.println("Index em inglês: " + lista.indexOf("Inglês"));
		System.out.println("---------------------------");
		for (String materias : lista) {
			System.out.println(materias);
		}
		System.out.println("--------------------------");
		
		//Trabalhar com predicado 
		//Remover todos os elementos que iniciem com a letra G
		//Para remover um elementos utilizando predicado, usamos o método removeif
		
		lista.removeIf(disciplina -> disciplina.charAt(0) == 'G');// Remover toda String disciplina, tal que disciplina na posição 0 seja == 'G'
		
		for (String materias : lista) {
			System.out.println(materias);
			
		}
		System.out.println("------------------------");
		lista.removeIf(disciplina -> disciplina.charAt(4) == 'm');
		lista.removeIf(disciplina -> disciplina.charAt(2) == 'm');
		
		for (String materias : lista) {
			System.out.println(materias);
			
		}
		
	}

}
