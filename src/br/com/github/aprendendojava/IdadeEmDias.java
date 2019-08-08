package br.com.github.aprendendojava;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		
		int ano, mes, dia, calculo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		
		System.out.print("Anos: ");
		ano = entrada.nextInt();
		
		System.out.print("Mês: ");
		mes = entrada.nextInt();
		
		System.out.print("Dias: ");
		dia = entrada.nextInt();
		
		calculo = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("Sua idade em dias totais: " + calculo);
	}
}
