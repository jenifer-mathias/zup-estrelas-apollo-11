package Aula09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio1 {

	// Leia do usuário seu nome, peso e altura e escreva isto em um arquivo texto de
	// nome "dadosPessoais.txt" com cada uma dessas informações em uma linha.

	public static void main(String[] args) throws IOException {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite seu nome: ");
		String nome = teclado.nextLine();

		System.out.printf(" Digite seu peso: ");
		float peso = teclado.nextFloat();

		System.out.println(" Digite sua altura: ");
		float altura = teclado.nextFloat();

		FileWriter writer = new FileWriter("dadosPessoais.txt");
		writer.write(nome);
		writer.write("\n" + peso);
		writer.write("\n" + altura);
		
		writer.close();	

	}

}
