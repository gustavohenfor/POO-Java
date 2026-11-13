package application;

import java.util.Scanner;

import entidade.produto;

public class Aula97 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		produto[] vect = new produto[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new produto(name, price);
		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / n;

		System.out.printf("%.2f, %.2f%n", soma, avg);

	}

}
