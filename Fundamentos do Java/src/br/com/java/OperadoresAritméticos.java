package br.com.java;

import java.util.Scanner;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		float x, y; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritmeticos");
		System.out.println("digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.println("Digite o valor de y: ");
		y = teclado.nextFloat();
		//soma
		System.out.println("x + y = " + (x + y));
		// Subtra��o
		System.out.println("x - y = " + (x - y));
		// Divis�o
		System.out.println("x / y = " + (x / y));
		// Multiplica��o
		System.out.println("x * y = " + (x * y));
		// Modulo
		System.out.println("x % y = " + (x % y));
		// Incremento x++ (equivalente a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento
		y--;
		System.out.println("y-- " + y);
		
	}

}
