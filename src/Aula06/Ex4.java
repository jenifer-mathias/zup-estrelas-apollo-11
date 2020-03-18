package Aula06;

import java.util.Scanner;

public class Ex4 {

	// Leia o salario de um trabalhador e o valor da prestação de um empréstimo.
	// Se a prestação for maior que 20% do salário imprima:
	// "Empréstimo não concedido",
	// caso contrario imprima:// "Empréstimo concedido"

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o seu salário: ");

		Float salario = teclado.nextFloat();

		System.out.println(" Digite o valor da prestação: ");

		Float prestacao = teclado.nextFloat();

		if (prestacao > (salario * 0.20)) {
			System.out.printf(" Empréstimo não concedido! ");

		} else {
			System.out.printf(" Empréstimo concedido! ");

		}

	}

}
