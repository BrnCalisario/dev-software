public class MinhaClasse{

    public static void main(String[] args) {

        String matricula = "ABC-000";
        String nome = "Bruno";
        double nota1 = 2;
        double nota2 = 6;
        double notaFinal = (nota1 + nota2) / 2;
        String aprovado = (notaFinal >= 6) ? "( X ) Sim (  ) Nao": "(  ) Sim ( X ) Nao";

        String resultado = "Matricula: " + matricula;
        resultado += "\nNome: " + nome;
        resultado += "\n" + aprovado;
        resultado += "\nNota Final: " + notaFinal; 

        System.out.println(resultado);
        
    }
}