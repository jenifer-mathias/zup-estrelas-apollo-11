package Aula06;

import java.util.Scanner;

public class Exercicio1Switch {

	// Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana
	// correspondente a este numero.
	// Isto e, domingo se 1, segunda-feira se 2, e assim por diante.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero entre 1 a 7 para saber o dia da semana correspondente: ");
		int numeroInteiro = teclado.nextInt();

		switch (numeroInteiro) {
		case 1:
			System.out.println(" O n�mero digitado corresponde a domingo! ");
			break;
		case 2:
			System.out.println(" O n�mero digitado corresponde a segunda-feira! ");
			break;
		case 3:
			System.out.println(" O n�mero digitado corresponde a ter�a-feira! ");
			break;
		case 4:
			System.out.println(" O n�mero digitado corresponde a quarta-feira! ");
			break;
		case 5:
			System.out.println(" O n�mero digitado corresponde a quinta feira! ");
			break;
		case 6:
			System.out.println(" O n�mero digitado corresponde a sexta-feira! ");
			break;
		case 7:
			System.out.println(" O n�mero digitado corresponde a s�bado! ");
			break;
		default:
			System.out.println(" N�mero inv�lido! ");

		}

	}

}
