package br.com.java;

import java.util.Scanner;

public class Conversordetemp {
	
	public static void main(String[] args) {
	
	double fa, cel;
	
	Scanner teclado = new Scanner (System.in);
	System.out.println("Digite um valor em fa: ");	
	fa = teclado.nextDouble();
	cel = (fa - 32) / 1.8;
	System.out.println("valor em cel: " + cel );
	
	
	}
	

}
