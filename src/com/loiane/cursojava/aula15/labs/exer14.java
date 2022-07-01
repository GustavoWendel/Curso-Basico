package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class exer14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Nota 1: ");
		double nota01 = scan.nextDouble();

		System.out.println("Nota 2: ");
		double nota02 = scan.nextDouble();

		double media = (nota01 + nota02) / 2;
		String conceito = null;

		if (media >= 9.0 && media <= 10.0) {
			conceito = "A";
			System.out.println("Conceito: " + conceito);
			System.out.printf("Média: % .2f \n", media);

			if (conceito.equalsIgnoreCase("A")) {
				System.out.println("APROVADO");
			}
		} else if (media >= 7.5 && media < 9.0) {
			conceito = "B";
			System.out.println("Conceito: " + conceito);
			System.out.printf("Média: % .2f \n", media);

			if (conceito.equalsIgnoreCase("B")) {
				System.out.println("APROVADO");
			}
		} else if (media >= 6.0 && media < 7.5) {
			conceito = "C";
			System.out.println("Conceito: " + conceito);
			System.out.printf("Média: % .2f \n", media);

			if (conceito.equalsIgnoreCase("C")) {
				System.out.println("APROVADO");
			}
		} else if (media >= 4.0 && media < 6.0) {
			conceito = "D";
			System.out.println("Conceito: " + conceito);
			System.out.printf("Média: % .2f \n", media);

			if (conceito.equalsIgnoreCase("D")) {
				System.out.println("REPROVADO");
			}
		} else {
			conceito = "E";
			System.out.println("Conceito: " + conceito);
			System.out.printf("Média: % .2f \n", media);

			if (conceito.equalsIgnoreCase("E")) {
				System.out.println("REPROVADO");
			}
		}

		System.out.println("");
		System.out.println("Fim.");

		scan.close();
	}

}
