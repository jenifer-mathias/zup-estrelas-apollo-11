package Aula06;

import java.util.Scanner;

public class QuartoExercicio {

	// Receba a altura do degrau de uma escada e a altura que o usuario deseja
	// alcançar subindo a escada.
	// Calcule e mostre quantos degraus o usuario deverá subir para atingir seu
	// objetivo.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite a altura do degrau de uma escada: \n");

		float degrau = teclado.nextFloat();

		System.out.println(" Digite a altura que você deseja alcançar subindo a escada/ altura da escada : \n");

		float alturad = teclado.nextFloat();

		System.out.printf(" Para atingir o seu objetivo, você deverá subir: %.1f \n ", (alturad / degrau));

	}

}
