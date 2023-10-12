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

		System.out.println("Digite a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
		
		System.out.println("A media do aluno foi: " + media);
		
		System.out.println("++++++++ +++++++++++++");
		
		if(media == 10) {
			System.out.println("Aluno aprovado com distin��o!");
			System.out.println("Parab�ns!");
		}else if(media >= 7){
			System.out.println("Aluno aprovado!");
		}else System.out.println("Aluno reprovado.");
		

	}

}
