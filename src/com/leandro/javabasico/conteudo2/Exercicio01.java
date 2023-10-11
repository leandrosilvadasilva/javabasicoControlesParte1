package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio01 {
	/* Faça um Programa que peça dois números e imprima o maior deles. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número (inteiro)");
		int num1 = scan.nextInt();
		System.out.println("Digite um outro número (inteiro)");
		int num2 = scan.nextInt();
		
		if(num1 > num2) System.out.println("O número maior é: " + num1);
		else System.out.println("O número maior é: " + num2);
	}

}
