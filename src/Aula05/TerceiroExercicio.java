package Aula05;

import java.util.Scanner;

public class TerceiroExercicio {

	// Peça ao usuario para digitar três valores inteiros e imprima a soma deles.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println(" Digite um número inteiro: \n"); //" escreva"
		int n1 = teclado.nextInt(); // "leia"

		System.out.println(" Digite outro inteiro: \n"); //" escreva"
		int n2 = teclado.nextInt(); // "leia"
		
		System.out.println(" Digite outro inteiro: \n"); //" escreva"
		int n3 = teclado.nextInt(); // "leia"
		
	
		System.out.printf(" A soma dos números digitados é: \n %d " , n1 + n2 + n3);
	}
}
