package br.com.java;

import java.util.Scanner;

public class OperadoresAritméticos {

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
		// Subtração
		System.out.println("x - y = " + (x - y));
		// Divisão
		System.out.println("x / y = " + (x / y));
		// Multiplicação
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
