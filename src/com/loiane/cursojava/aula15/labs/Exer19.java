package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = 0;

		if (numero < 1000) {
			System.out.println("Digite um n�mero: ");
			numero = scan.nextInt();

			int centenas = numero / 100;
			int dezenas = ((numero - (centenas * 100)) / 10);
			int unidades = (numero - (centenas * 100 + dezenas * 10));

			System.out.print(centenas + " centena(s)" + ", ");
			System.out.print(dezenas + " dezena(s)" + "e ");
			System.out.print(unidades + " unidade(s)");
			scan.close();
		} else {
			System.out.println("Valor acima do exigido");
			System.exit(0);
		}
	}
}
