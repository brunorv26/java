package br.com.java;

import java.util.Scanner;

public class PDV2 {

	public static void main(String[] args) {
		double total, desconto, totaldesconto, valorpago, troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("=============");
		System.out.println("=====PDV=====");
		System.out.println("=============");
		System.out.println("");
		System.out.println("Total: ");
		total = teclado.nextDouble();
		System.out.print("% desconto: ");
		desconto = teclado.nextDouble();
		totaldesconto = total - ((total * desconto) /100);
		System.out.println("Total com desconto: " + totaldesconto);
		System.out.println("__________________");
		System.out.println("valor pago:");
		valorpago = teclado.nextDouble();
		troco = valorpago - totaldesconto;
		System.out.println("troco: " + troco);
				
				
				
		
		
	}

}
