package Aula07;

import java.util.Scanner;

public class Exercicio3 {

	// Faça um Programa que peça um número e informe se o número é inteiro ou
	// decimal.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número: ");
		float numero = teclado.nextFloat();

		if (numero > Math.floor(numero)) {               // a função Math.floor retornará o valor baseando-se no menor e mais próximo
			System.out.println(" Número decimal! ");     // ex: 10.5 ---> 10.0

		} else {
			System.out.println(" Número inteiro! ");

		}

	}

}
