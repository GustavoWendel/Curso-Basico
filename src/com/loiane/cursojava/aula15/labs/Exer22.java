package com.loiane.cursojava.aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " � um n�mero par!");
			System.exit(0);
		} else {
			System.out.println(numero + " n�o � um n�mero par!");
			System.exit(0);
		}

		scan.close();
	}

}
