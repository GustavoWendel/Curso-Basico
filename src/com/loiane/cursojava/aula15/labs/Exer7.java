package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer7 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maior = 0, menor = 0;
		
		System.out.println("Entre com o primeiro valor: ");
		int a = scan.nextInt();
	
		System.out.println("Entre com o segundo valor: ");
		int b = scan.nextInt();
		
		System.out.println("Entre com o terceiro valor: ");
		int c = scan.nextInt();
		
		if( (a > b) & (a > c) ) {
			maior = a;
			System.out.println(maior + " � maior.");		
		} else if( (b > a) && (b > c) ) {
			maior = b;
			System.out.println(maior +" � maior.");	
		} else if(c > a && c > b) {
			maior = c;
			System.out.println(maior +" � maior.");	
		} else if(a < b && a < c) {
			menor = a;
			System.out.println(a +" � menor.");	
		}  else if(b < a && b < c) {
			menor = b;
			System.out.println(b +" � menor.");	
		} else {
			menor = c;
			System.out.println(menor + "� menor");
		}
		
		
		scan.close();
	}

}
