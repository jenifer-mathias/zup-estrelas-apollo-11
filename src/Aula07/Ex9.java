package Aula07;

import java.util.Scanner;

public class Ex9 {

// Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int fat, numero;

		System.out.println(" Digite um n�mero inteiro: ");
		numero = teclado.nextInt();

		fat = 1;

		do {
			fat = fat * numero;
			numero--;
		} while (numero > 1);

		System.out.printf(" Fatorial = " + fat);
	}

}
