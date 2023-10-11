package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
	 * negativo.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		double num1 = scan.nextInt();
		

		if (num1 < 0) System.out.println("O número é negativo. Valor: " + num1);
		else System.out.println("O número é postivo. Valor: " + num1);
			
	}

}
