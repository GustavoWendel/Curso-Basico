package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra(F ou M):");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else if (letra.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo inválido");
		}

		scan.close();
	}

}
