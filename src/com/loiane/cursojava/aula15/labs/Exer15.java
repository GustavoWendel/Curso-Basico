package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do lado A do triângulo: ");
		double A = scan.nextDouble();

		System.out.println("Digite o valor do lado B do triângulo: ");
		double B = scan.nextDouble();

		System.out.println("Digite o valor do lado C do triângulo: ");
		double C = scan.nextDouble();

		if (A + B < C) {
			System.out.println("É um triângulo");
		} else if (A + C < B) {
			System.out.println("É um triângulo");
		} else if (B + C < C) {
			System.out.println("É um triângulo");
		} else {
			System.out.println("Não é um triângulo");
		}

		if (A == B && A == C && B == C) {
			System.out.println("Triângulo Equilátero: três lados iguais");
		} else if ((A == B) || (A == C) || (B == C)) {
			System.out.println("Triângulo Isósceles: quaisquer dois lados iguais");
		} else if ((A != B) && (A != C) && (B != C)) {
			System.out.println("Triângulo Escaleno: três lados diferentes");
		}
		scan.close();
	}

}
