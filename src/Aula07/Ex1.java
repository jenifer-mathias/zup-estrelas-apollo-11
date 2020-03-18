package Aula07;

import java.util.Scanner;

public class Ex1 {

	// Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. 
	//A primeira vez com "for", a segunda com "while" e a terceira com "do while".

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			System.out.printf(" Uso for: %d\n ", i);
		}

		int j = 1;
		while (j <= 100) {
			System.out.printf(" Uso while: %d\n ", j);
			j++;
		}

		int l = 1;
		do {
			System.out.printf(" Uso do while: %d\n ", l);
			l++;
		} while (l <= 100);
	}

}
