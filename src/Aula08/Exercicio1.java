package Aula08;

import java.util.Scanner;

public class Exercicio1 {

	// Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
	// inteiros.
	// O programa deve executar os seguintes passos:
	// Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
	// Armazene em uma vari�vel inteira (simples) a soma entre os valores das
	// posi��es A[0], A[1] e A[5] do vetor
	// e mostre na tela esta soma.
	// Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
	// Mostre na tela cada valor do vetor A, um em cada linha.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] A = new int[6];
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;

		int soma = A[0] + A[1] + A[5];

		A[4] = 100;

		for (int i = 0; i < A.length; i++) {
			System.out.printf(" : %d\n", A[i]);
		}

		System.out.printf(" A soma do vetor �: %d\n ", soma);
	}

}
