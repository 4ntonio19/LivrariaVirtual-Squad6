package application;

import entities.Eletronico;
import entities.Impresso;
import entities.Livro;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Eletronico("Titulo 1", "Autor 1", "Editora 1", 11.0f, 14.00);
		Livro livro2 = new Impresso("Titulo 2", "Autor 2", "Editora 2", 11.0f, 10, 22);
		
		System.out.println(livro);
		System.out.println(livro2);

	}

}
