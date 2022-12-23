
public class TesteBook {

	public static void main(String[] args) {

		Book livro1 = new Book();
		Book livro2 = new Book();
		 	;
		
		livro1.nome = "Senhor dos anéis";
		livro1.autor = "Token";
		livro1.anoCriacao = 1990;
		
		livro2.nome = "Harry Potter";
		livro2.autor = "J K Rowling";
		livro2.anoCriacao = 2000;
		
		
		
		livro1.dadosLivro();
		livro2.dadosLivro();
		
				

	}

}
