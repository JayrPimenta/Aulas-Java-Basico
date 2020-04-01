import java.util.Locale;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		String cliente = "Joice";
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";
		
		int idade = 30;
		int code = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double media = 53.234567;
		
		System.out.printf("O valor do %s é $ %.2f.%n", produto1, preco1);
		System.out.printf("A %s custa $ %.2f.%n", produto2, preco2);
		System.out.println("");
		System.out.println(cliente+" , "+idade+" anos de idade, codigo "+code+" e generô: "+sexo+".");
		System.out.println("");
		System.out.printf("Média de oito  casas decimais em: %.8f%n", media);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", media);
		Locale.setDefault(Locale.US);
		System.out.printf("US ponto decimal: %.3f", media);
		
		
	}
	
}
