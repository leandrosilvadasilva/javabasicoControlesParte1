package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto
	 * voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o pre�o do produto 1??");
		double prod1 = scan.nextDouble();

		System.out.println("Qual o pre�o do produto 2??");
		double prod2 = scan.nextDouble();

		System.out.println("Qual o pre�o do produto 3??");
		double prod3 = scan.nextDouble();

		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("Valor produto 1 = " + prod1);
			System.out.println("Valor produto 2 = " + prod2);
			System.out.println("Valor produto 3 = " + prod3);

			System.out.println("O produto 1 � o mais barato!");

		} else if (prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("Valor produto 1 = " + prod1);
			System.out.println("Valor produto 2 = " + prod2);
			System.out.println("Valor produto 3 = " + prod3);

			System.out.println("O produto 2 � o mais barato!");
		}else {
			System.out.println("Valor produto 1 = " + prod1);
			System.out.println("Valor produto 2 = " + prod2);
			System.out.println("Valor produto 3 = " + prod3);
			
			System.out.println("O produto 3 � o mais barato!");
		}
	}

}
