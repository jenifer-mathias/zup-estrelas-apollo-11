package Aula06;

import java.util.Scanner;

    // Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve
    // comprar, sabendo que a decis�o � sempre pelo mais barato.

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o pre�o do primeiro produto: ");
		Float primeiroPreco = teclado.nextFloat();

		System.out.println(" Digite o pre�o do segundo produto: ");
		Float segundoPreco = teclado.nextFloat();

		System.out.println(" Digite o pre�o do terceiro produto: ");
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
