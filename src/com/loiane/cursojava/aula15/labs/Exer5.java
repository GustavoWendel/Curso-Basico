package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a primeira nota do aluno(a): ");
		double nota01 = scan.nextDouble();

		System.out.println("Entre a segunda nota do aluno(a): ");
		double nota02 = scan.nextDouble();

		double media = (nota01 + nota02) / 2;

		if (media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Média = " + media);
		} else {
			System.out.println("Reprovado");
			System.out.println("Média = " + media);
		}

		scan.close();
	}

}
