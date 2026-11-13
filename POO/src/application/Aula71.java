package application;

import java.util.Scanner;

import entidade.Triangulo;

public class Aula71 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite o Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.println("Area do X é " + areaX);
		System.out.println("Area do Y é " + areaY);
		
		if(areaX > areaY) {
			System.out.println("Area X é maior GU");
		} else {
			System.out.println("Area Y é maior GU");
		}
	}

}
