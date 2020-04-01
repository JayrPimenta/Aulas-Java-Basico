import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Exemplo:
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double valorPorMetroQuadrado = sc.nextDouble();
		
		double AREA = largura * comprimento;
		double PRECO = AREA * valorPorMetroQuadrado;
		
		System.out.printf("Area = %.2f%n", AREA);
		System.out.printf("Valor do terreno = %.2f%n", PRECO);

		*/
		
		/* Exercicio 01 Soma
		
		Integer valorUm = sc.nextInt();
		Integer valorDois = sc.nextInt();
		
		Integer soma = valorUm + valorDois;
		
		System.out.println("SOMA = "+soma);
		
		*/
		
		/* Exercicio 02 Area circulo 
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double diametro = Math.pow(raio, 2);
		double area = diametro * pi;
		
		System.out.printf("A = %.4f", area);
		
		*/
		
		/* Exercicio 03 Diferença 
		
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		Integer d = sc.nextInt();
		Integer diferenca = (a*b-c*d);
		
		System.out.print("DIFERENÇA ="+diferenca);
		
		*/
		
		/* Exercicio 04 Salario Funcionário
		
		Integer numeroDoFuncionario = sc.nextInt();
		Integer horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = valorPorHora * horasTrabalhadas;
		
		System.out.println("Numero = "+numeroDoFuncionario);
		System.out.printf("Salário = U$ %.2f%n",salario);
		
		*/
		
		/* Exercicio 05  Venda de Peças
		
		Integer codigoProdutoUm = sc.nextInt();
		Integer quantidadeParaVendaProdutoUm = sc.nextInt();
		double precoProdutoUm = sc.nextDouble();
		double valorTotalProdutoUm = quantidadeParaVendaProdutoUm * precoProdutoUm;
		
		Integer codigoProdutoDois = sc.nextInt();
		Integer quantidadeParaVendaProdutoDois = sc.nextInt();
		double precoProdutoDois = sc.nextDouble();
		double valorTotalProdutoDois = quantidadeParaVendaProdutoDois * precoProdutoDois;
		
		System.out.printf("Valor a pagar = R$ %.2f",(valorTotalProdutoUm+valorTotalProdutoDois));
		
		*/
		
		/* Exercicio 06 */
		
		double A, B, C, pi;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		double triangulo = (A * C)/2; 
		double diametro = Math.pow(C, 2);
		double circulo = diametro * pi;
		double trapesio = (A+B)*C/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPESIO: %.3f%n",trapesio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		
		
		sc.close();
		
	}

}
