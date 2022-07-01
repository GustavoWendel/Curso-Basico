package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do lado A do tri�ngulo: ");
		double A = scan.nextDouble();

		System.out.println("Digite o valor do lado B do tri�ngulo: ");
		double B = scan.nextDouble();

		System.out.println("Digite o valor do lado C do tri�ngulo: ");
		double C = scan.nextDouble();

		if (A + B < C) {
			System.out.println("� um tri�ngulo");
		} else if (A + C < B) {
			System.out.println("� um tri�ngulo");
		} else if (B + C < C) {
			System.out.println("� um tri�ngulo");
		} else {
			System.out.println("N�o � um tri�ngulo");
		}

		if (A == B && A == C && B == C) {
			System.out.println("Tri�ngulo Equil�tero: tr�s lados iguais");
		} else if ((A == B) || (A == C) || (B == C)) {
			System.out.println("Tri�ngulo Is�sceles: quaisquer dois lados iguais");
		} else if ((A != B) && (A != C) && (B != C)) {
			System.out.println("Tri�ngulo Escaleno: tr�s lados diferentes");
		}
		scan.close();
	}

}
