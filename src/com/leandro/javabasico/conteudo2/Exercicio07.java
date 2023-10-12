package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio07 {
	/*
	 * Faça um Programa que leia três números e mostre o maior e o menor deles.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro número:");
		double num3 = scan.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("Números digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O número 1 é o menor");
			
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("Números digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O número 2 é o menor");
		} else {
			System.out.println("Números digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O número 3 é o menor");
		} {

		}
	}

}
