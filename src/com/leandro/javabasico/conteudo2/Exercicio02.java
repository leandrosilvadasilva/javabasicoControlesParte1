package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou
	 * negativo.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		double num1 = scan.nextInt();
		

		if (num1 < 0) System.out.println("O n�mero � negativo. Valor: " + num1);
		else System.out.println("O n�mero � postivo. Valor: " + num1);
			
	}

}
