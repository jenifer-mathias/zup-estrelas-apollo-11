package Aula08;

import java.util.Scanner;

public class Exercicio3 {

	// Ler um conjunto de números reais, armazenando-o em vetor
	// e calcular o quadrado das componentes deste vetor, armazenando o resultado em
	// outro vetor.
	// Os conjuntos tem 10 elementos cada.
	// Imprimir todos os conjuntos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double[] numerosLidos = new double[10];
		double[] quadrados = new double[10];

		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.printf(" Digite um número li: \n ");
			numerosLidos[i] = teclado.nextInt();
			quadrados[i] = Math.pow(numerosLidos[i], 2);
		}

		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.println(" O conjunto dos números lidos é: ");
			System.out.printf(" %.2f ", numerosLidos[i]);
		}
	}

}
