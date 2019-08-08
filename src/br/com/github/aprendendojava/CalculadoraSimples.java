package br.com.github.aprendendojava;

public class CalculadoraSimples {
	
	public double soma(double valorA, double z) {
		return valorA + z;
	}
	
	public double subtracao(double valorA, double valorB) {
		return valorA - valorB;
	}
	
	public double multiplicacao(double valorA, double valorB) {
		return valorA * valorB;
	}
	
	public double divisao(double valorA, double valorB) {
		double calculo = 0;
		
		if (valorB == 0) {
			System.out.println("Divisão por zero");
		} else {
			calculo = valorA / valorB;
		}
		
		return calculo;
	}
}
