package br.com.java;

import java.util.Scanner;

public class ConversorDoDolar {

	public static void main(String[] args) {
		double dolar, real;
		dolar = 3.73;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do real:");
		real = teclado.nextDouble();
		real = real * dolar;
		System.out.println("Valor do dolar: " + 3.73 );
		System.out.println("Valor do real em dolar: " + real );
		

	}

}
