package application;

import java.util.Scanner;

import entidade.Retangulo;

public class Atv1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a medida do retângulo: ");
		
		retangulo.comprimento = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo.Area());
		System.out.println(retangulo.Perimeter());
		System.out.println(retangulo.Diagonal());
		
	}

}
