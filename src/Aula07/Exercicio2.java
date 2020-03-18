package Aula07;

import java.util.Scanner;

public class Exercicio2 {

	// Um posto est� vendendo combust�veis com a seguinte tabela de descontos:

	// �lcool: at� 20 litros, desconto de 3% por litro
	// acima de 20 litros, desconto de 5% por litro

	// Gasolina: at� 20 litros, desconto de 4% por litro
	// acima de 20 litros, desconto de 6% por litro

	// Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel
	// (codificado da seguinte forma: A-�lcool, G-gasolina),
	// calcule e imprima o valor a ser pago pelo cliente sabendo que
	
	//o pre�o do litro da gasolina � R$ 2,50

	// o pre�o do litro do �lcool � R$ 1,90.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.printf(" Digite o n�mero de litros: ");
		float litros = teclado.nextFloat();

		System.out.printf(" Digite o tipo de combust�vel (Digite A para �lcool G para gasolina): ");
		String combustivel = teclado.next();

		switch (combustivel) {
		case "A":
			if (litros <= 20) {
				System.out.printf(" O pre�o ser� de: %.1f ", (litros * 2.50) - 0.97);

			} else {
				System.out.printf(" O p�o ser� de: %.1f ", (litros * 2.50) - 0.95);

			}
			break;

		case "G":
			if (litros <= 20) {
				System.out.printf(" O pre�o ser� de: %.1f ", (litros * 2.50) - 0.96);

			} else {
				System.out.printf(" O pre�o ser� de: %.1f ", (litros * 2.50) - 0.94);

			}
			break;

		default:
			System.out.println(" Combust�vel n�o encontrado! ");

		}

	}

}
