package exercicios;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
		
		
		int len = 5;
		String matricula;
		String nome;
		double[] notas = new double[len];
		double[] pesos = {0.05, 0.05, 0.2, 0.2, 0.5};
		double notaF = 0;
	
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Insira a matrícula: ");
		matricula = scan.nextLine();
		System.out.println("Insira o nome: ");
		nome = scan.nextLine();
		
		for(int i=0; i<len; i++) {
			System.out.print("Insira a nota (" + (i + 1) + "):");
			double nota = scan.nextDouble();
			if ((nota >= 0) && (nota <= 10)){
				notas[i] = nota;
				notaF += notas[i] * pesos[i];
			} else {
				System.out.println("NOTA INVÁLIDA. INSIRA UM VALOR ENTRE 0 A 10");
				i--;
			}
		}
		scan.close();
		
		String resultado = "\nRELATÓRIO";
		resultado += "\nMatrícula: " + matricula;
		resultado += "\nNome: " + nome;
		resultado += "\nNota final: " + notaF;
		resultado += "\nResultado: " + ((notaF >= 6) ? "Aprovado" : "Reprovado");
		
		/*for (int i=0; i<len; i++) {
			resultado += "\nNota (" + (i + 1) + "): " + notas[i];
		}*/
		
		System.out.println(resultado);
		
	}
	
}
