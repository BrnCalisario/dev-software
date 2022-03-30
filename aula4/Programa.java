package ExClasse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\eclipse-workspace\\Aula04\\src\\ExClasse\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		//int quant = 0;
		//Aluno[] alunos = new Aluno[quant - 1];
		
		Aluno[] alunos = new Aluno[3];
		
		
		int contador = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split(";");
			String matricula = dados[0];
			String nome = dados[1];
			String nota1 = dados[2];
			String nota2 = dados[3];
			String nota3 = dados[4];
			
			Aluno aluno = new Aluno();
			aluno.matricula = dados[0];
			aluno.nome = dados[1];
			aluno.nota1 = Double.parseDouble(dados[2]);
			aluno.nota2 = Double.parseDouble(dados[3]);
			aluno.nota3 = Double.parseDouble(dados[4]);
			
			alunos[contador] = aluno;
			contador++;
		}


		
		for(Aluno aluno : alunos) {
			String imp = "Matricula: " + aluno.matricula;
			imp += "\nNome: " + aluno.nome;
			imp += "\nNota 1: " + aluno.nota1;
			imp += "\nNota 2: " + aluno.nota2;
			imp += "\nNota 3: " + aluno.nota3;
			System.out.println(imp + "\n");
			
			
		}
		
		
	}

	
	
}
