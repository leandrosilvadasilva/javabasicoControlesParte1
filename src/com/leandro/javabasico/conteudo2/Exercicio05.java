package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio05 {
	/*
	 * Faça um programa para a leitura de duas notas parciais de um aluno. 
		O programa deve calcular a média alcançada por aluno e apresentar:
		o A mensagem "Aprovado", se a média alcançada for maior ou 
		igual a sete;
		o A mensagem "Reprovado", se a média for menor do que sete;
		o A mensagem "Aprovado com Distinção", se a média for igual a 
		dez.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = scan.next();

		
		if (letra.length() > 1) {
			System.out.println("O caracter digitado NÃO É VÁLIDO");
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
			case "U": System.out.println("A letra digitada é VOGAL"); break;
			
			default: System.out.println("A letra digitada é CONSOANTE");
				
			}

		} 

	}

}
