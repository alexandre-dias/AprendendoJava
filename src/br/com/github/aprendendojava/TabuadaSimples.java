package br.com.github.aprendendojava;

import java.util.Scanner;

public class TabuadaSimples {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, i, resultado, r;
		r = 0;

		do {
			System.out.print("Informe um número: ");
			numero = entrada.nextInt();

			for (i = 0; i <= 10; i++) {
				resultado = i * numero;
				System.out.println(numero + " x " + i + " = " + resultado);
			}

			System.out.println("\nReiniciar script? [0-Sim | 1-Não]: ");
			r = entrada.nextInt();
			System.out.println();

		} while (r == 0);
	}
}
