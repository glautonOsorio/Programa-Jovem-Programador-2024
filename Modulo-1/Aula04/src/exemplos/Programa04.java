package Aula04.src.exemplos;

public class Programa04 {


    public static void main(String[] args) {
		
		String[] alunos = new String[5];
		alunos[3] = "Milton";
		alunos[0] = "Diogo";
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
		
		
		String encontrar = "Milton";
		int indiceEncontrado = -1;			
		for(int i = 0; i < alunos.length; i++   ) {
			if (   alunos[i] != null  && alunos[i].equals(encontrar)) {
				indiceEncontrado = i;
				break;
			}			
		}		
		if (indiceEncontrado == -1) {
			System.out.println("Aluno não encontrado");
		} else {
			System.out.println("O aluno esta na posição " + indiceEncontrado);
		}
		
		

	}

    
    
}
