package Aula07;

import java.util.Scanner;

public class Exercicio5 {

	// Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima
	// o m�s
	// correspondente a este numero. Isto �, janeiro se 1, fevereiro se 2, e assim
	// por diante.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero entre 1 e 12 para saber o m�s correspondente: ");
		int numeroInteiro = teclado.nextInt();

		switch (numeroInteiro) {
		case 1:
			System.out.println(" O n�mero digitado corresponde a janeiro. ");
			break;
		case 2:
			System.out.println(" O n�mero digitado corresponde a fevereiro. ");
			break;
		case 3:
			System.out.println(" O n�mero digitado corresponde a mar�o. ");
			break;
		case 4:
			System.out.println(" O n�mero digitado corresponde a abril. ");
			break;
		case 5:
			System.out.println(" O n�mero digitado corresponde a maio. ");
			break;
		case 6:
			System.out.println(" O n�mero digitado corresponde a junho. ");
		case 7:
			System.out.println(" O n�mero digitado corresponde a julho. ");
			break;
		case 8:
			System.out.println(" O n�mero digitado corresponde a agosto. ");
			break;
		case 9:
			System.out.println(" O n�mero digitado corresponde a setembro. ");
			break;
		case 10:
			System.out.println(" O n�mero digitado corresponde a outubro. ");
			break;
		case 11:
			System.out.println(" O n�mero digitado corresponde a novembro. ");
			break;
		case 12:
			System.out.println(" O n�mero digitado corresponde a dezembro. ");
			break;
		default:
			System.out.println(" M�S INV�LIDO! ");

		}

	}

}
