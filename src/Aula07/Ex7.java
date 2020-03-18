package Aula07;

import java.util.Scanner;

public class Ex7 {

	// Fa�a um programa que some os numeros �mpares contidos em um intervalo
	// definido pelo usu�rio.
	// O usu�rio define o valor inicial do intervalo e o valor final deste intervalo
	// e o programa dever� somar todos os numeros �mpares contidos neste intervalo.
	// se o usu�rio digitar um intervalo inv�lido (come�ando por um valor maior que
	// o valor final)
	// deve ser escrito uma mensagem de erro na tela, �Intervalo de valores
	// inv�lido� e o programa termina.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o n�mero do in�cio do intervalo: ");
		int inicioDoIntervalo = teclado.nextInt();
		System.out.println(" Digite o n�mero do fim do intervalo: ");
		int fimDoIntervalo = teclado.nextInt();
		int soma = 0;

		if (inicioDoIntervalo > fimDoIntervalo) {
			if (inicioDoIntervalo % 2 == 0) {
				inicioDoIntervalo++;
			}

			for (int i = inicioDoIntervalo; i < fimDoIntervalo; i += 2) {
				soma += i;
			}

			System.out.printf(" A soma dos n�meros �mpares dentro desse intervalo �: %d\n", soma);
		} else {
			System.out.println(" Intervalo inv�lido. ");
		}

	}

}
