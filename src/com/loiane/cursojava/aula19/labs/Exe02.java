package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Exe02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];

		for (int posicao = 0; posicao < vetorA.length; posicao++) {
			System.out.println("Digite o valor da posição " + posicao + ":");
			vetorA[posicao] = scan.nextInt();

			vetorB[posicao] = vetorA[posicao] * 2;
		}

		System.out.println("Vetor A = ");
		for (int posicao = 0; posicao < vetorB.length; posicao++) {
			System.out.print(vetorA[posicao] + " ");
		}
	
		System.out.println("Vetor B = "); 
		for(int posicao = 0; posicao < vetorB.length; posicao++) {
			System.out.print(vetorB[posicao] + " ");
		}
	
	}

}
