package Aula07;

import java.util.Scanner;

public class Exercicio1 {

	// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
	// letra escrever:
	// F - Feminino,
	// M - Masculino,
	// Sexo Inválido.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite F ou M para saber o sexo: ");
		
		String letraFM = teclado.next();
		
		switch (letraFM) {
		case "F":
			System.out.println(" Feminino ");
			break;

		case "M":
			System.out.println(" Masculino");
			break;

		default:
			System.out.println(" Sexo Inválido! ");

		}
	}
}
