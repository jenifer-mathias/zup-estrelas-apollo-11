package Aula07;

import java.util.Scanner;

public class Ex9 {

// Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int fat, numero;

		System.out.println(" Digite um número inteiro: ");
		numero = teclado.nextInt();

		fat = 1;

		do {
			fat = fat * numero;
			numero--;
		} while (numero > 1);

		System.out.printf(" Fatorial = " + fat);
	}

}
