package Aula07;

import java.util.Scanner;

public class Exercicio3 {

	// Fa�a um Programa que pe�a um n�mero e informe se o n�mero � inteiro ou
	// decimal.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero: ");
		float numero = teclado.nextFloat();

		if (numero > Math.floor(numero)) {               // a fun��o Math.floor retornar� o valor baseando-se no menor e mais pr�ximo
			System.out.println(" N�mero decimal! ");     // ex: 10.5 ---> 10.0

		} else {
			System.out.println(" N�mero inteiro! ");

		}

	}

}
