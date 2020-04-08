package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enuns.Cor;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> listaDeFormas = new ArrayList<>();
		
		System.out.print("Numero de formas que deseja calcular: ");
		Integer numeroDeFormas = sc.nextInt();
		
		for (int formaCadastrada = 1; formaCadastrada <= numeroDeFormas; formaCadastrada++) {
			
			System.out.println("Dados da forma #"+formaCadastrada+":");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char tipoDeForma = sc.next().charAt(0);
			
			while (tipoDeForma != 'r' && tipoDeForma != 'c') {
				System.out.print("Informa RETANGULO(r) ou CIRCULO(c): ");
				tipoDeForma = sc.next().charAt(0);
			}
			
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			sc.nextLine();
			String cor = sc.nextLine().toUpperCase();
			
			while (!cor.equals("PRETO")  && !cor.equals("AZUL")  && !cor.equals("VERMELHO") ) {
				System.out.print("Informa PRETO, AZUL ou VERMELHO: ");
				cor = sc.nextLine();
				cor.toUpperCase().toUpperCase();
			}
			
			if (tipoDeForma == 'r') {
				System.out.print("Base: ");
				Double base = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				
				listaDeFormas.add(new Retangulo(Cor.valueOf(cor), base, altura));
				
			} else {
				
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				listaDeFormas.add(new Circulo(Cor.valueOf(cor), raio));
				
			}
			
		}
		
		System.out.println();
		System.out.println("Area das Formas: ");
		for (Forma areaDaForma : listaDeFormas) {
			System.out.printf("%.2f%n",areaDaForma.area());
		}
		
		sc.close();

	}

}
