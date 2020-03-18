package Aula07;

import java.util.Scanner;

public class Exercicio2 {

	// Um posto está vendendo combustíveis com a seguinte tabela de descontos:

	// Álcool: até 20 litros, desconto de 3% por litro
	// acima de 20 litros, desconto de 5% por litro

	// Gasolina: até 20 litros, desconto de 4% por litro
	// acima de 20 litros, desconto de 6% por litro

	// Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
	// (codificado da seguinte forma: A-álcool, G-gasolina),
	// calcule e imprima o valor a ser pago pelo cliente sabendo que
	
	//o preço do litro da gasolina é R$ 2,50

	// o preço do litro do álcool é R$ 1,90.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.printf(" Digite o número de litros: ");
		float litros = teclado.nextFloat();

		System.out.printf(" Digite o tipo de combustível (Digite A para álcool G para gasolina): ");
		String combustivel = teclado.next();

		switch (combustivel) {
		case "A":
			if (litros <= 20) {
				System.out.printf(" O preço será de: %.1f ", (litros * 2.50) - 0.97);

			} else {
				System.out.printf(" O pço será de: %.1f ", (litros * 2.50) - 0.95);

			}
			break;

		case "G":
			if (litros <= 20) {
				System.out.printf(" O preço será de: %.1f ", (litros * 2.50) - 0.96);

			} else {
				System.out.printf(" O preço será de: %.1f ", (litros * 2.50) - 0.94);

			}
			break;

		default:
			System.out.println(" Combustível não encontrado! ");

		}

	}

}
