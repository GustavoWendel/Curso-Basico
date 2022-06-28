package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a temperatura em graus Cº: ");
		double temperaturaCelsius = scan.nextDouble();
		
		double temperaturaFarenheit = 1.8 * temperaturaCelsius + 32;

		System.out.printf("A temperatura em graus celsius: %.4f °F", temperaturaFarenheit);
		
		scan.close();

	}

}
