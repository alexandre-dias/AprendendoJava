package br.com.github.aprendendojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMCEmJava {
	public static void main(String[] args) {
		
		int altura;
		double peso, imc;
		
		// Capturar dados enviados pelo usuário
		Scanner entrada = new Scanner(System.in);
		
		// Limita as casas depois da vírgula
		DecimalFormat df = new DecimalFormat("###,#00.00"); 
		
		System.out.println("Informe seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.println("Informe sua altura: ");
		altura = entrada.nextInt();
		
		imc = (peso / (altura * altura)) * 10000;
		
		System.out.println("Seu IMC é: " + df.format(imc));
		
		if (imc < 18.5) {
			System.out.println("Desnutrição");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Eutrofia");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II (Severo)");
		} else {
			System.out.println("Obesidade grau III (Mórbida)");
		}
		
	}
}
