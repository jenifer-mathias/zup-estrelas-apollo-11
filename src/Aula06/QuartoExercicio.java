package Aula06;

import java.util.Scanner;

public class QuartoExercicio {

	// Receba a altura do degrau de uma escada e a altura que o usuario deseja
	// alcan�ar subindo a escada.
	// Calcule e mostre quantos degraus o usuario dever� subir para atingir seu
	// objetivo.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite a altura do degrau de uma escada: \n");

		float degrau = teclado.nextFloat();

		System.out.println(" Digite a altura que voc� deseja alcan�ar subindo a escada/ altura da escada : \n");

		float alturad = teclado.nextFloat();

		System.out.printf(" Para atingir o seu objetivo, voc� dever� subir: %.1f \n ", (alturad / degrau));

	}

}
