package br.com.github.aprendendojava;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, r;
		r = 0;

		do {
			System.out.print("Informe um valor: ");
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Par\n");
			} else {
				System.out.println("Ímpar\n");
			}

			System.out.println("Reiniciar script? [0-Sim | 1-Não]: ");
			r = entrada.nextInt();
			System.out.println();

		} while (r == 0);
	}
}
