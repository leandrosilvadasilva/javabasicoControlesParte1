package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio07 {
	/*
	 * Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		double num2 = scan.nextDouble();
		System.out.println("Digite o terceiro n�mero:");
		double num3 = scan.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("N�meros digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O n�mero 1 � o menor");
			
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("N�meros digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O n�mero 2 � o menor");
		} else {
			System.out.println("N�meros digitados: 1: " + num1 + ". num 2: " + num2 + ". num 3: " + num3 + ".");
			System.out.println( "O n�mero 3 � o menor");
		} {

		}
	}

}
