package Aula07;

import java.util.Scanner;

public class Ex2 {

	// Fa�a um programa que leia n inteiros e imprima sua m�dia.

	public static void main(String[] args) {

		int qtdNumerosLidos = 0;
		int numero = 0;
		double media = 0;
		int somaNumerosLidos = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.printf(" Voc� quer calcular a m�dia de quantos n�meros? ");
		qtdNumerosLidos = teclado.nextInt();

		for (int i = 0; i < qtdNumerosLidos; i++) {
			System.out.printf(" Digite um n�mero: \n ");
			numero = teclado.nextInt();
			
			somaNumerosLidos = numero * qtdNumerosLidos;
			
			media = somaNumerosLidos / qtdNumerosLidos;
			
		}
		
		System.out.printf(" A m�dia dos n�meros lidos �: %.2f\n ", media);
	}
}
