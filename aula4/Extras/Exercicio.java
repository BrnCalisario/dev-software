package main;

public class Exercicio {

	public static void print(Object txt) {
		System.out.println(txt);
	}

	public static double somar(double a, double b) {return a + b;}
	
	public static double sub(double a, double b) {return a - b;}
	
	public static double multi(double a, double b) {return a * b;}
	
	public static double divide(double a, double b) {return a / b;}
	
	
	public static void main(String[] args) {
		
		double valorA = 20;
		double valorB = 10;
		
		print("Valores: " + valorA + " " + valorB);
		
		print("Soma: " + somar(valorA, valorB));
		print("Subtra��o: " + sub(valorA, valorB));
		print("Multiplica��o: "+ multi(valorA, valorB));
		print("Divis�o: " + divide(valorA, valorB));
	
		
	}
}