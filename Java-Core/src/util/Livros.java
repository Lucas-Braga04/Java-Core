package util;

import java.util.List;
import java.util.ArrayList;


public class Livros {
	
	private List<String> titulos;
	
	//Construtor
	public Livros() {
		this.titulos = new ArrayList<>();
	}

	
	//Metodo de adição de elementos a lista
	public void adicionarLivros(String idBook, String title, String nameAutor, String age, String gender, String edit, String pages) {
		this.titulos.add("ID Book: " + idBook + " - " + " Title: " + title + " - " + " Name Author: " + nameAutor + " - " + " Ano de Lançamento " + age + " - " + " Gender: " + gender + " - " + " Edit: " + edit + " - " + " Pags: " + pages);
	}
	
	
	//Listar os elementos da lista
	public List<String>getTitulos(){
		return titulos;
	}
	
	//Listar a quantidade de elementos da lista
	
	public void exibirQuantidadeElementos() {
		System.out.println("A lista contém " + this.titulos.size());
	}
	
	
	public void removeLivros(String titulo) {
		//Encontrar o index (indice) do elemento a ser removido
		
		int index = this.titulos.indexOf(titulo);
		
		//Remover o elemento da lista
		this.titulos.remove(index);
	}
}
