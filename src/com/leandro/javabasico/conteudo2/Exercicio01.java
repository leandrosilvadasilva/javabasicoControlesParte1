package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio01 {
	/* Fa�a um Programa que pe�a dois n�meros e imprima o maior deles. */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero (inteiro)");
		int num1 = scan.nextInt();
		System.out.println("Digite um outro n�mero (inteiro)");
		int num2 = scan.nextInt();
		
		if(num1 > num2) System.out.println("O n�mero maior �: " + num1);
		else System.out.println("O n�mero maior �: " + num2);
	}

}
