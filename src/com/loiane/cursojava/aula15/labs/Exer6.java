package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro valor: ");
		double a = scan.nextDouble();

		System.out.println("Entre com o segundo valor: ");
		double b = scan.nextDouble();

		System.out.println("Entre com o terceiro valor: ");
		double c = scan.nextDouble();

		double maior;

		if ((a > b) & (a > c)) {
			maior = a;
			System.out.println(maior + " é o maior.");
		} else if ((b > a) && (b > c)) {
			maior = b;
			System.out.println(maior + " é o maior.");
		} else {
			maior = c;
			System.out.println(maior + " é o maior.");
		}

		scan.close();
	}

}
