package exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Aluno\\eclipse-workspace\\ExercicioAula\\src\\exercicio\\grupos-tabulados.txt");
		Scanner scan = new Scanner(arquivo);
		scan.nextLine();
		
		int total = 0;
		List<Grupo> grupos = new ArrayList<Grupo>();
		
		while(scan.hasNext()) {
			
			String linha = scan.nextLine();
			String[] dados = linha.split("	");
			
			
			if ((grupos.isEmpty()) || (!nomeExiste(grupos, dados[0]))) {
				Grupo novoGrupo = new Grupo();
				novoGrupo.nome = dados[0];
				grupos.add(novoGrupo);
			} 
			
			for(Grupo grupo : grupos) {
				if (dados[0].equals(grupo.nome)) {
					grupo.valor += Integer.parseInt(dados[1]);
				}
			}
			total += Integer.parseInt(dados[1]);
		}
		
		for(Grupo grupo : grupos) {
			System.out.println(grupo.nome + ": " + grupo.valor);
		}
		
		System.out.println("Total: " + total);
		
		
		scan.close();
	}
	
	
	public static boolean nomeExiste(List<Grupo> lista, String nome) {
		
		for(Grupo grupo : lista) {
			if (grupo.getNome().equals(nome)){
				return true;
			}
		}
		return false;
	}
	
}
