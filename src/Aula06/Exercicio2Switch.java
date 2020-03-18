package Aula06;

import java.util.Scanner;

public class Exercicio2Switch {

	// Faça um programa que mostre ao usuário um menu com 4 opcões de operacões
	// matemáticas
	// (as básicas, por exemplo). O usuário escolhe uma das opcções e o seu programa
	// entao pede dois
	// numeros e realiza o calculo. Depois mostre o resultado, em seguida, saia.

	public static double soma(double primeiroNumero, double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}

	public static double subtracao(double primeiroNumero, double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	public static double multiplicacao(double primeiroNumero, double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}

	public static double divisao(double primeiroNumero, double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int operacao;
		do {
			System.out.println("\n Escolha uma das quatro operações matemáticas:" + " \n - 1 para soma; "
					+ " \n - 2 para subtracao; " + " \n - 3 para multiplicacao; " + " \n - 4 para divisao; "
					+ "\n ou digite 0 para finalizar o programa. ");

			operacao = teclado.nextInt();

			switch (operacao) {
			case 1:
				System.out.printf(" Digite um número: ");
				double primeiroNumero = teclado.nextDouble();

				System.out.printf(" Digite outro número: ");
				double segundoNumero = teclado.nextDouble();

				System.out.printf(" A soma dos números digitados é: %1.02f ", soma(primeiroNumero, segundoNumero));
				break;

			case 2:
				System.out.printf(" Digite um número: ");
				primeiroNumero = teclado.nextDouble();

				System.out.printf(" Digite outro número: ");
				segundoNumero = teclado.nextDouble();

				System.out.printf(" A subtração dos números digitados é: %1.02f ",
						subtracao(primeiroNumero, segundoNumero));
				break;

			case 3:
				System.out.printf(" Digite um número: ");
				primeiroNumero = teclado.nextDouble();

				System.out.printf(" Digite outro número: ");
				segundoNumero = teclado.nextDouble();

				System.out.printf(" A multiplicação dos números digitados é: %1.02f ",
						multiplicacao(primeiroNumero, segundoNumero));
				break;

			case 4:

				System.out.printf(" Digite um número: ");
				primeiroNumero = teclado.nextDouble();

				System.out.printf(" Digite outro número: ");
				segundoNumero = teclado.nextDouble();

				System.out.printf(" A divisão dos números digitados é: %1.02f ",
						divisao(primeiroNumero, segundoNumero));
				break;

			case 0:
				System.out.println(" Obrigada, volte sempre! ");
				break;
			default:
				System.out.println(" Operação inválida! ");
			}

		} while (operacao != 0);

	}

}
