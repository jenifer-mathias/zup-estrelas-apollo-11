package Aula06;

import java.util.Scanner;

    // Faça um programa que pergunte o preço de três produtos e informe qual produto você deve
    // comprar, sabendo que a decisão é sempre pelo mais barato.

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o preço do primeiro produto: ");
		Float primeiroPreco = teclado.nextFloat();

		System.out.println(" Digite o preço do segundo produto: ");
		Float segundoPreco = teclado.nextFloat();

		System.out.println(" Digite o preço do terceiro produto: ");
		Float terceiroPreco = teclado.nextFloat();

		if ((primeiroPreco < segundoPreco) && (primeiroPreco < terceiroPreco)) {
			
			System.out.printf(" O produto mais barato custa: R$ %.2f ", primeiroPreco);

		} else if ((segundoPreco < primeiroPreco) && (segundoPreco < terceiroPreco)) {

			System.out.printf(" O produto mais barato custa: R$ %.2f ", segundoPreco);

		} else {

			System.out.printf(" O produto mais barato custa: R$ %.2f ", terceiroPreco);

		}

	}

}
