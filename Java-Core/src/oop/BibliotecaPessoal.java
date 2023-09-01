package oop;

import java.util.List;
import java.util.Scanner;

import util.Livros;

public class BibliotecaPessoal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Informe o código do livro: ");
		String idBook = in.next();
		
		System.out.println("Informe o titulo do livro: ");
		String title = in.next();
		
		System.out.println("Informe o autor(a) do livro");
		String nameAutor = in.next();
		
		System.out.println("Qual seu ano de lançamento: ");
		String age = in.next();
		
		System.out.println("Informe o gênero do livro: ");
		String gender = in.next();
		
		System.out.println("Informe a editora do livro: ");
		String edit = in.next();
		
		System.out.println("Quantas páginas o livro possui: ");
		String pages = in.next();
		
		Livros livros = new Livros();
		
		livros.adicionarLivros(idBook, title, nameAutor, age, gender, edit, pages);
		
		List<String> titulos = livros.getTitulos();
		
		for(String titulo : titulos) {
			System.out.println(titulo);
		}
		
		//Listar os elementos 
		System.out.println("---------------------------");
		livros.exibirQuantidadeElementos();
		
		
		//Remover elementos
		System.out.println("Informe o código do livro: ");
		String codLivro = in.next(idBook);
		livros.removeLivros(codLivro);
		
		//Listar os elementos 
		System.out.println("-----------------------------");
		System.out.println("Lista de livros após a remoção");
		livros.exibirQuantidadeElementos();
		
		in.close();
	}
}
