package exemplos;

public class Programa03 {

	public static void main(String[] args) {


		String texto = "Good Bye Underworld";
		
		int comprimento = texto.length();
		
		System.out.println(comprimento);
		
		
		String novoText = texto.replace(texto, "Até mais mundo inferior");
		
		System.out.println(novoText);
		
    	String subString1 = texto.substring(4);
		System.out.println(subString1);
		
		String subString2 = texto.substring(4,9);
		System.out.println(subString2);
		
		String subString3 = texto.substring(0,4);
		System.out.println(subString3);
		
		
		char letra = texto.charAt(5);
		
		System.out.println(letra);
		
		String testeMaisculo = "UNDEAD";
		
		System.out.println(testeMaisculo.toLowerCase());
		
		String testeMinusculo = "unluck";
		
		System.out.println(testeMinusculo.toUpperCase());
		
		
		String testeTrim = "                           SpyXFamily";
		
		System.out.println(testeTrim.trim());
		
		
		
		String senha = "123456";
		String tentativa = "1234";
		boolean teste = senha.equals(tentativa);
		
		
		System.out.println(teste);
		
		
		
		String frase2 = "Fullstack programmer";
		boolean contain = frase2.contains("Fullstack");
		
		System.out.println(contain);
					
		
		
	}

}
