package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double nota01, nota02, nota03, media;

		System.out.println("Digite a nota 1: ");
		nota01 = scan.nextDouble();

		System.out.println("Digite a nota 2: ");
		nota02 = scan.nextDouble();

		System.out.println("Digite a nota 3: ");
		nota03 = scan.nextDouble();

		media = (nota01 + nota02 + nota03) / 3;

		if (media >= 7) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado");
			System.exit(0);
		} else if (media < 7) {
			System.out.println("Média: " + media);
			System.out.println("Reprovado");
			System.exit(0);
		} else if (media == 10) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado com distinção");
			System.exit(0);
		}

		scan.close();
	}

}
