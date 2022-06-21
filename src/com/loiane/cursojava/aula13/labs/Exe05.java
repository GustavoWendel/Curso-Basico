package com.loiane.cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exe05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double metro, centrimetro;
		
		System.out.println("Digite um valor: ");
		metro = sc.nextDouble();
		
		centrimetro = metro * 100;
		
		System.out.printf("Conversão de metro para centrímetos = % .2f ", centrimetro);
		
		sc.close();
	}
}
