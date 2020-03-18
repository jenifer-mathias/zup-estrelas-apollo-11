package Aula08;

import java.util.Scanner;

public class Exercicio2 {

	// Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os
	// valores lidos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] valoresInteiros = new int[6];

		for (int i = 0; i < valoresInteiros.length; i++) {     // usei o length para saber o tamanho do array
			System.out.println(" Lendo valores inteiros: ");           // o length percorre o array
			valoresInteiros[i] = teclado.nextInt();
		}

		for (int i = 0; i < valoresInteiros.length; i++) {
			System.out.printf(" Valores dos arrays : %d\n", valoresInteiros[i]);  
			
		}

	}

}
