package br.com.github.aprendendojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaSimples {
	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Informe sua primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe sua segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + df.format(media));
		
		if (media >= 5 && media < 6) {
			System.out.println("Recuperação");
		} else if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
