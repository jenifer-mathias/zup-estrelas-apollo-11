package Aula07;

import java.util.Scanner;

public class Ex7 {

	// Faça um programa que some os numeros ímpares contidos em um intervalo
	// definido pelo usuário.
	// O usuário define o valor inicial do intervalo e o valor final deste intervalo
	// e o programa deverá somar todos os numeros ímpares contidos neste intervalo.
	// se o usuário digitar um intervalo inválido (começando por um valor maior que
	// o valor final)
	// deve ser escrito uma mensagem de erro na tela, “Intervalo de valores
	// inválido” e o programa termina.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o número do início do intervalo: ");
		int inicioDoIntervalo = teclado.nextInt();
		System.out.println(" Digite o número do fim do intervalo: ");
		int fimDoIntervalo = teclado.nextInt();
		int soma = 0;

		if (inicioDoIntervalo > fimDoIntervalo) {
			if (inicioDoIntervalo % 2 == 0) {
				inicioDoIntervalo++;
			}

			for (int i = inicioDoIntervalo; i < fimDoIntervalo; i += 2) {
				soma += i;
			}

			System.out.printf(" A soma dos números ímpares dentro desse intervalo é: %d\n", soma);
		} else {
			System.out.println(" Intervalo inválido. ");
		}

	}

}
