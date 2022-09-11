package main.java;

import main.java.model.Livro;
import main.java.service.LivroObjectService;

public class ApplicationJava {

	public static void main(String[] args) {
		LivroObjectService.insertLivro(new Livro("J.K. Rowling", "Harry Potter", 50.15));
		LivroObjectService.insertLivro(new Livro("J.K. Rowling", "Harry Potter 2", 50.16));
		LivroObjectService.insertLivro(new Livro("J.K. Rowling", "Harry Potter 3", 50.17));
		LivroObjectService.insertLivro(new Livro("J.K. Rowling", "Harry Potter 4", 50.18));
		LivroObjectService.insertLivro(new Livro("John Flanagan", "Rangers: Ordem dos Arqueiros - 1", 100));
		LivroObjectService.insertLivro(new Livro("John Flanagan", "Rangers: Ordem dos Arqueiros - 2", 100));
		LivroObjectService.insertLivro(new Livro("Chaves", "Já chegou o disco voador?", 100));
		LivroObjectService.insertLivro(new Livro("Amazon", "Jeff Bezos", 134));
		LivroObjectService.insertLivro(new Livro("Stephen Hawking", "Breves respostas para questões grandes", 96));
		LivroObjectService.insertLivro(new Livro("Robert Kirkman", "The Walking Dead", 100.12));

		System.out.println("\n-========== Livros inseridos ==========-");
		LivroObjectService.outPrintLivros();
		System.out.println("-======================================-");

		int id = 2;
		System.out.println("\n-========== Removendo livro com ID: "+ id +" ==========-");
		LivroObjectService.removeLivro(id);
		LivroObjectService.outPrintLivros();
		System.out.println("-======================================-");

		String title = "Rangers: Ordem dos Arqueiros - 1";
		System.out.println("\n-========== Busca binária pelo título: "+ title +" ==========-");
		LivroObjectService.searchingToTitle(title);
		System.out.println("-======================================-");
	}
}
