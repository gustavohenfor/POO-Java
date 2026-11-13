package application;

import java.util.Scanner;

import util.Dinheiro;

public class Atv4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dinheiro dinheiro = new Dinheiro();
		
		System.out.print("Valor atual do Dollar: $");
		double dollar = sc.nextDouble();
		
		System.out.print("Valor desejado em Dollar: $");
		double dollardj = sc.nextDouble();
		
		System.out.println("Valor a ser pago em reais: R$" + dinheiro.currencyConverter(dollar, dollardj));
		

	}

}
