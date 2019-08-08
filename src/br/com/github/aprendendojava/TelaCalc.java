package br.com.github.aprendendojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TelaCalc {
	public static void main(String[] args) {

		double x, z;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner entrada = new Scanner(System.in);

		CalculadoraSimples cs = new CalculadoraSimples();
		
		System.out.println("Entre com o primeiro valor: ");
		x = entrada.nextDouble();

		System.out.println("Entre com o segundo valor: ");
		z = entrada.nextDouble();

		System.out.println("Soma: " + df.format(cs.soma(x, z)));
		System.out.println("Subtração: " + df.format(cs.subtracao(x, z)));
		System.out.println("Multiplicação: " + df.format(cs.multiplicacao(x ,z)));
		System.out.println("Divisão: " + df.format(cs.divisao(x, z)));

	}
}
