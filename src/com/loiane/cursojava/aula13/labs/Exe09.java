package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		
		double temperaturaCelsius = (5 * (temperaturaFarenheit - 32) / 9);

		System.out.printf("A temperatura em graus celsius: %.4f °C", temperaturaCelsius);
		
		scan.close();
	}

}
