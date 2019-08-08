package br.com.github.aprendendojava;

public class CalculadoraSimples {
	
	public double soma(double valor_a, double z) {
		return valor_a + z;
	}
	
	public double subtracao(double valor_a, double valor_b) {
		return valor_a - valor_b;
	}
	
	public double multiplicacao(double valor_a, double valor_b) {
		return valor_a * valor_b;
	}
	
	public double divisao(double valor_a, double valor_b) {
		double calculo = 0;
		
		if (valor_b == 0) {
			System.out.println("Divisão por zero");
		} else {
			calculo = valor_a / valor_b;
		}
		
		return calculo;
	}
}
