package com.loiane.cursojava.aula17.beecrowd;

import java.util.Scanner;

public class BeeCrowd1072 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int n = scan.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= n; i++) {
			int x = scan.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println("in: " + in);
		System.out.println("out: " + out);
	}
}
