package Aula08;

import java.util.Scanner;

public class Ex2 {

	// Faça um programa que calcule o valor total investido por um colecionador em
	// sua coleção de CDs
	// e o valor médio gasto em cada um deles.
	// O usuário deverá informar a quantidade de CDs e o valor para em cada um.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Quantos CD's você têm? ");
		int quantidadeCds = teclado.nextInt();

		double valorTotal = 0;

		for (int n = 0; n < quantidadeCds; n++) {

			System.out.printf(" Quanto você pagou em cada um? " + "OBS: coloque os valores utilizando virgula. ");
			valorTotal += teclado.nextDouble();
		}

		double valorMedio = 0;
		valorMedio = valorTotal / quantidadeCds;

		System.out.printf(" O valor total de sua coleção de Cd's é: %.2f\n ", valorTotal);

		System.out.printf(" O valor médio de sua coleção de Cd's é: %.2f\n ", valorMedio);

	}
}
