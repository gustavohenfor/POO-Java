package application;

import java.util.Scanner;

import entidade.produto;

public class Construtor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite dados do produto:");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preço: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantity =sc.nextInt();
		
		produto product = new produto(name, price, quantity);
		/* Construtor acima aguarda nome, preço e quantia */
		
		System.out.println(product.toString());
		
		System.out.print("Digite a quantia de produtos que deseja adicionar: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product.toString());
		
		System.out.print("Digite a quantia de produtos que deseja remover: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println(product.toString());
		
		
		
		
		
	}

}
