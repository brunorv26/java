package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" 1. Windows");
		System.out.println(" 2. Linux");
		System.out.println(" Digite a op��o desejada: " );
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			windown();
			break;
		case 2:
			linux();
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}
		
	}
	
	//Criando um metodo
	static void windown() { 
		System.out.println("Carregando o Windows............");
		
			
		}
		static void linux() { System.out.println("Carregando o Linux..........");
		
	
		
	} 

}
