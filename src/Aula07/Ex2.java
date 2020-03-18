package Aula07;

import java.util.Scanner;

public class Ex2 {

	// Faça um programa que leia n inteiros e imprima sua média.

	public static void main(String[] args) {

		int qtdNumerosLidos = 0;
		int numero = 0;
		double media = 0;
		int somaNumerosLidos = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.printf(" Você quer calcular a média de quantos números? ");
		qtdNumerosLidos = teclado.nextInt();

		for (int i = 0; i < qtdNumerosLidos; i++) {
			System.out.printf(" Digite um número: \n ");
			numero = teclado.nextInt();
			
			somaNumerosLidos = numero * qtdNumerosLidos;
			
			media = somaNumerosLidos / qtdNumerosLidos;
			
		}
		
		System.out.printf(" A média dos números lidos é: %.2f\n ", media);
	}
}
