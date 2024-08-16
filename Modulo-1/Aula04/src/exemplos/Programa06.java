package Aula04.src.exemplos;

public class Programa06 {
    	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numAlunos = 4;		
		String[] nomes = new String[numAlunos];
		double[] nota1 = new double[numAlunos];
		double[] nota2 = new double[numAlunos];	
		
		for (int i = 0; i < numAlunos; i++) {
			
			System.out.println("Digite o nome do aluno: ");
			nomes[i] = leia.nextLine();
			
			System.out.println("Digite a "
					+ "primeira nota do aluno " + nomes[i] + ": ");
			nota1[i] = leia.nextDouble();
			
			System.out.println("Digite a "
					+ "segunda nota do aluno " + nomes[i] + ": ");
			nota2[i] = leia.nextDouble();
			
			leia.nextLine();
		}
		        
		System.out.println("Nome\t\tNota1\tNota2\tMédia\tSituação");
		for (int i = 0; i < numAlunos ; i++) {
			
			double media = (nota1[i] + nota2[i])/2;
			String situacao;
			if (media >= 6) {
				situacao = "Aprovado";
			} else {
				situacao = "Reprovado";
			}
			
			System.out.println(nomes[i]+"\t\t"+nota1[i]
					+"\t"+nota2[i]+"\t"+media+"\t"+situacao);
			
			
		}
		
		
		
		

	}
}
