package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio05 {
	/*
	 * Fa�a um programa para a leitura de duas notas parciais de um aluno. 
		O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou 
		igual a sete;
		o A mensagem "Reprovado", se a m�dia for menor do que sete;
		o A mensagem "Aprovado com Distin��o", se a m�dia for igual a 
		dez.
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
