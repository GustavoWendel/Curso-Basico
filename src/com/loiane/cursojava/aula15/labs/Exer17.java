package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto");
			System.out.println("Fim.");
			System.exit(0);
		} else {
			System.out.println("Não é um ano bissexto");
			System.out.println("Fim.");
			System.exit(0);
		}

		scan.close();
	}

}
