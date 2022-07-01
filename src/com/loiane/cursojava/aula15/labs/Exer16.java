package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		double A = scan.nextDouble();

		if (A == 0) {
			System.out.println("A equação não é do segundo grau");
			System.out.println("Fim do programa.");
			System.exit(0);
		}

		System.out.println("Digite o valor de B: ");
		double B = scan.nextDouble();

		System.out.println("Digite o valor de C: ");
		double C = scan.nextDouble();

		double delta = Math.pow(B, 2) - 4 * A * C;

		if (delta < 0) {
			System.out.println("Se o delta calculado for negativo, a equação não possui raizes reais.");
			System.out.println("Valor de delta: " + delta);
			System.out.println("Fim do programa.");
			System.exit(0);
		} else if (delta == 0) {
			System.out.println("A equação possui apenas uma raiz real");
			System.out.println("Valor de delta: " + delta);
			System.out.println("Fim do programa.");
			System.exit(0);
		} else {
			System.out.println("A equação possui duas raiz reais");
			System.out.println("Valor de delta: " + delta);
			System.out.println("Fim do programa.");
			System.exit(0);
		}

		scan.close();

	}
}
