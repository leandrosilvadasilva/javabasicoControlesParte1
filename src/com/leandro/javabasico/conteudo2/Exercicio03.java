package com.leandro.javabasico.conteudo2;

import java.util.Scanner;

public class Exercicio03 {
	/*
	 * Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a
	 * letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("m")) {
			System.out.println("O sexo digitado � o: Masculino");
		}else if(letra.equalsIgnoreCase("f")){
			System.out.println("O sexo digitado � o: Feminino");
		}else {
			System.out.println("O sexo digitado � inv�lido");
		}

	}

}
