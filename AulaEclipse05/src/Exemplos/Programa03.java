package Exemplos;

import Modulo.Operacoes;

public class Programa03 {

	public static void main(String[] args) {

		int result = Operacoes.somar(10, 2000);
		int resultMinus = Operacoes.subtrair(150, 20);
		int resultMulti = Operacoes.produto(10, 20);
		
		System.out.println(result);
		System.out.println(resultMinus);
		System.out.println(resultMulti);
		
		
	}

}
