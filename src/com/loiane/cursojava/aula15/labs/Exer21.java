package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int valor;

		System.out.print("Entre com um valor para saque(Mínimo de R$ 10,00 para sacar): R$ ");
		valor = scan.nextInt();

		int nota5 = 5;
		int nota10 = 10;
		int nota50 = 50;
		int nota100 = 100;

		if (valor >= 10 && valor <= 600) {

			if (valor >= nota5) {
				nota5 = valor / 5;
				valor = valor - (nota5 * 5);
			}

			if (valor >= nota10) {
				nota10 = valor / 10;
				valor = valor - (nota10 * 10);
			}

			if (valor >= nota50) {
				nota50 = valor / 50;
				valor = valor - (nota50 * 50);
			}

			if (valor >= nota100) {
				nota100 = valor / 100;
				valor = valor - (nota100 * 100);
			}

			System.out.println(nota5 + " notas de R$ 5,00");
			System.out.println(nota10 + " notas de R$ 10,00");
			System.out.println(nota50 + " notas de R$ 50,00");
			System.out.println(nota100 + " notas de R$ 100,00");

		} else {
			System.out.println("Não é possível realizar o saque.");
		}

		scan.close();
	}

}
