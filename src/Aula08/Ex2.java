package Aula08;

import java.util.Scanner;

public class Ex2 {

	// Fa�a um programa que calcule o valor total investido por um colecionador em
	// sua cole��o de CDs
	// e o valor m�dio gasto em cada um deles.
	// O usu�rio dever� informar a quantidade de CDs e o valor para em cada um.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Quantos CD's voc� t�m? ");
		int quantidadeCds = teclado.nextInt();

		double valorTotal = 0;

		for (int n = 0; n < quantidadeCds; n++) {

			System.out.printf(" Quanto voc� pagou em cada um? " + "OBS: coloque os valores utilizando virgula. ");
			valorTotal += teclado.nextDouble();
		}

		double valorMedio = 0;
		valorMedio = valorTotal / quantidadeCds;

		System.out.printf(" O valor total de sua cole��o de Cd's �: %.2f\n ", valorTotal);

		System.out.printf(" O valor m�dio de sua cole��o de Cd's �: %.2f\n ", valorMedio);

	}
}
