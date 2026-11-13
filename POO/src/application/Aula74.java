package application;

import java.util.Scanner;

import entidade.produto;

public class Aula74 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		produto product = new produto();
		
		System.out.println("Digite dados do produto:");
		System.out.println("Nome: ");
		product.name = sc.nextLine();
		System.out.println("Preço: ");
		product.price = sc.nextDouble();
		System.out.println("Quantidade: ");
		product.quantity =sc.nextInt();
		
		System.out.println(product.toString());
		
		System.out.print("Digite a quantia de produtos que deseja adicionar: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(product.toString());
		
		System.out.print("Digite a quantia de produtos que deseja remover: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println(product.toString());
		
		
		
		
		
	}

}
