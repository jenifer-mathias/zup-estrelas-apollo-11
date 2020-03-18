package Aula06;

import java.util.Scanner;

public class SegundoExercicio {

	// Leia uma velocidade em km/h (quilometros por hora) e
	// apresente-a convertida em m/s (metros por segundo).

	public static void main(String[] args) {

			Scanner teclado = new Scanner(System.in);
	
			System.out.println(" Digite uma velocidade em km/h: \n");
	
			float velocidade = teclado.nextFloat();
	
			System.out.printf(" A velocidade em metros por segundo é: %.1f \n ", (velocidade / 3.6));

	}

}
