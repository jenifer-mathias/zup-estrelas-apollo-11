package Aula05;

import java.util.Scanner;

public class SegundoExercicio {
	
	// Faça um programa que leia um numero real e o imprima.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println(" Digite um número real: ");
		double numero = teclado.nextDouble(); // aqui está lendo do teclado
		
		System.out.printf(" O número lido é: %f", numero); // Ele vai substituir o %d pelo valor contido na var inteiro
	
	}
}
