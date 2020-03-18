package Aula08;

import java.util.Scanner;

public class Ex4 {

	// Fa�a um programa que leia uma quantidade indeterminada de n�meros positivos e
	// conte
	// quantos deles est�o nos seguintes intervalos: [0-25], [26-50], [51-75] e
	// [76-100].
	// A entrada de dados dever� terminar quando for lido um n�mero negativo.

	public static void main(String[] args) {

		int contadorGrupo1 = 0;
		int contadorGrupo2 = 0;
		int contadorGrupo3 = 0;
		int contadorGrupo4 = 0;
		int contadorFora = 0;

		Scanner teclado = new Scanner(System.in);
		int numeroLido;

		do {
			System.out.println(" Digite um n�mero inteiro");
			numeroLido = teclado.nextInt();

			if (numeroLido < 0) {
				break;

			}
			if (numeroLido <= 25) {
				contadorGrupo1++;
			} else if (numeroLido <= 50) {
				contadorGrupo2++;
			} else if (numeroLido <= 75) {
				contadorGrupo3++;

			} else if (numeroLido <= 100) {
				contadorGrupo4++;

			} else {
				System.out.println(" N�mero fora dos intervalos esperados. ");
				contadorFora++;
			}

		} while (numeroLido >= 0);

		System.out.printf(" Foram lidos %d n�meros no intervalo de 0-25\n", contadorGrupo1);
		System.out.printf(" Foram lidos %d n�meros no intervalo de 0-25\n", contadorGrupo2);
		System.out.printf(" Foram lidos %d n�meros no intervalo de 0-25\n", contadorGrupo3);
		System.out.printf(" Foram lidos %d n�meros no intervalo de 0-25\n", contadorGrupo4);
	}
}
