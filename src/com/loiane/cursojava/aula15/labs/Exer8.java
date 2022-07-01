package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer8 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor do primeiro produto: R$ ");
		double precoProduto01 = scan.nextDouble();

		System.out.println("Entre com o valor do segundo produto: R$ ");
		double precoProduto02 = scan.nextDouble();

		System.out.println("Entre com o valor do terceiro produto: R$ ");
		double precoProduto03 = scan.nextDouble();

		if (precoProduto01 < precoProduto02 && precoProduto01 < precoProduto03) {
			System.out.println("Você deve comprar o produto com o" + " preço = R$ " + precoProduto01);
		} else if (precoProduto02 < precoProduto01 && precoProduto02 < precoProduto03) {
			System.out.println("Você deve comprar o produto com o" + " preço = R$ " + precoProduto02);
		} else {
			System.out.println("Você deve comprar o produto com o" + " preço = R$" + precoProduto03);
		}

		scan.close();
	}

}
