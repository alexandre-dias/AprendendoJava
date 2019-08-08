package br.com.github.aprendendojava;

import java.util.Scanner;

public class AntecessorSucessor {
	public static void main(String[] args) {
		
		int numero, s, a;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		
		s = numero + 1;
		a = numero - 1;
		
		System.out.println("Sucessor: " + s);
		System.out.println("Antecessor: " + a);
	}
}
