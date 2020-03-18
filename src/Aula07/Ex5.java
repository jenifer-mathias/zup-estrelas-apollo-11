package Aula07;

import java.util.Scanner;

public class Ex5 {

	// Faça um programa que leia um número inteiro positivo n 
	
	//e calcule a soma dos n primeiros números naturais.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroInteiro = 0;
		int soma = 0;
		
		System.out.println(" Digite um número inteiro: ");
		numeroInteiro = teclado.nextInt();
		
		for (int i = 0; i == numeroInteiro; i++) {
			soma = i + numeroInteiro;
		}
			System.out.printf(" A soma dos n primeiros números naturais: %d\n", soma);
		

	}

}
