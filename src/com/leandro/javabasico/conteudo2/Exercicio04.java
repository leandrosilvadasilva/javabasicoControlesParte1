package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio04 {
	/*
	 * Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante..
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = scan.next();

		
		if (letra.length() > 1) {
			System.out.println("O caracter digitado N�O � V�LIDO");
		} else  {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("A letra digitada � VOGAL"); break;
			
			default: System.out.println("A letra digitada � CONSOANTE");
				
			}

		} 

	}

}
