package Aula07;

import java.util.Scanner;

public class Ex4 {

	// Fa�a um programa que calcule e mostre a soma dos 50 primeiros n�meros
	// �mpares.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i = teclado.nextInt();
		int soma = teclado.nextInt();

		for (i = 0; i <= 100; i = i + 2 ) {
			soma = i + i;
		}

		System.out.printf(" A soma dos 50 primeiros n�meros �mpares �: %d\n", soma);

	}

}
