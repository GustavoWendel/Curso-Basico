package com.loiane.cursojava.aula17.beecrowd;

import java.util.Scanner;

public class BeeCrowd1074 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println();
		int n = scan.nextInt();

		for (int contador = 1; contador <= n; contador++) {
			System.out.println();
			int x = scan.nextInt();
			
			if (x % 2 == 0 && x > 0 ) {
				System.out.print("EVEN ");
				System.out.println("POSITIVE");
			} else if (x % 2 != 0 && x > 0 ) {
				System.out.print("ODD ");
				System.out.println("POSITIVE");
			} else if (x % 2 == 0 && x < 0 ) {
				System.out.print("EVEN ");
				System.out.println("NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
		
		
		scan.close();

	}

}
