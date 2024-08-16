package aplicacao;

import entidades.Pessoa;

public class Programa05 {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa("Rogério", 1.73, 28, 80);
		
		System.out.println(pessoa);
		
		pessoa.setIdade(29);
		
		System.out.println(pessoa);
		
		
	}

}
