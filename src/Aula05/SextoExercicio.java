package Aula05;

import java.util.Scanner;

public class SextoExercicio {

// Leia o tamanho do lado de um quadrado e imprima como resultado a sua �rea.	
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite o lado de um quadrado: \n"); // " escreva"
		float ladoq = teclado.nextFloat(); // "leia"

		System.out.printf(" A �rea do quadrado digitado �: \n %1.0f", ladoq * ladoq);
	}
}
