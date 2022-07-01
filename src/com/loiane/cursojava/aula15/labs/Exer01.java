package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("Maior =" + num1);
		} else {
			System.out.println("Maior = " + num2);
		}

		scan.close();
	}

}
