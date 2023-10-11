package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
	 * letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("m")) {
			System.out.println("O sexo digitado é o: Masculino");
		}else if(letra.equalsIgnoreCase("f")){
			System.out.println("O sexo digitado é o: Feminino");
		}else {
			System.out.println("O sexo digitado é inválido");
		}

	}

}
