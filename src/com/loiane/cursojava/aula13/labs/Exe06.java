package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double raio, area, valorPi;
		
		System.out.printf("Digite o raio do círculo: ");
		raio = sc.nextDouble();
		
		valorPi = 3.1416;
		
		area = valorPi * (Math.pow(raio, 2));
		
		System.out.printf("O valor da área é = % .2f ", area);
		
		sc.close();
	}
}
