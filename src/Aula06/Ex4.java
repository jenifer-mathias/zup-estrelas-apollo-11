package Aula06;

import java.util.Scanner;

public class Ex4 {

	// Leia o salario de um trabalhador e o valor da presta��o de um empr�stimo.
	// Se a presta��o for maior que 20% do sal�rio imprima:
	// "Empr�stimo n�o concedido",
	// caso contrario imprima:// "Empr�stimo concedido"

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o seu sal�rio: ");

		Float salario = teclado.nextFloat();

		System.out.println(" Digite o valor da presta��o: ");

		Float prestacao = teclado.nextFloat();

		if (prestacao > (salario * 0.20)) {
			System.out.printf(" Empr�stimo n�o concedido! ");

		} else {
			System.out.printf(" Empr�stimo concedido! ");

		}

	}

}
