package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " é um número par!");
			System.exit(0);
		} else {
			System.out.println(numero + " não é um número par!");
			System.exit(0);
		}

		scan.close();
	}

}
