package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		String usuario;
		String senha;
		boolean infoValidas = false;
		
		
		// Executar� os dados de entrada
		do {
			System.out.println("Entre com o seu nome de usu�rio: ");
			usuario = scan.next();
			
			System.out.println("Entre com o sua senha de usu�rio: ");
			senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				infoValidas = true;
				System.out.println("Informa��es v�lidas. Logado! \n");
				System.exit(0);
			} else {
				System.out.println("Informa��es inv�lidas. Digite a senha novamente! \n");
			}
			
		} while(!infoValidas); // Verifica se as informa��es s�o v�lidas, se sim, o loop acabar�.

		
		scan.close();

	}

}
