package Aula05;

import java.util.Scanner;

public class SegundoExercicio {
	
	// Fa�a um programa que leia um numero real e o imprima.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println(" Digite um n�mero real: ");
		double numero = teclado.nextDouble(); // aqui est� lendo do teclado
		
		System.out.printf(" O n�mero lido �: %f", numero); // Ele vai substituir o %d pelo valor contido na var inteiro
	
	}
}
