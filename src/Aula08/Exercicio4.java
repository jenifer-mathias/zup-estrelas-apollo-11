package Aula08;

import java.util.Scanner;

public class Exercicio4 {

	// Faça um programa que leia um vetor de 8 posições e, em seguida,
	// leia também dois valores X e Y quaisquer correspondentes a duas posiçoes no
	// vetor.
	// Ao final seu programa deverá escrever a soma dos valores encontrados nas
	// respectivas posições X e Y.

	public static void main(String[] args) {

		double[] numerosLidos = new double[8];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.printf(" Digite um número real : \n ");
			numerosLidos[i] = teclado.nextDouble();
		}

		System.out.println(" Digite um número inteiro de 0-7 correspondente a posição do vetor: ");
		int posicaoX = teclado.nextInt();
		System.out.println(" Digite um número inteiro de 0-7 correspondente a posição do vetor");
		int posicaoY = teclado.nextInt();

		System.out.printf(" A soma das posições digitadas é: %.2f\n ", (numerosLidos[posicaoX] + numerosLidos[posicaoY]));

	}

}
