package application;

import java.util.Scanner;

import util.Calcular;

public class Aula78 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	Calcular calcular = new Calcular();
	
	System.out.println("Digite o radius: ");
	double radius = sc.nextDouble();
	
	double c = calcular.circuference(radius);
	double v = calcular.volume(radius);
	
	System.out.println(c);
	System.out.println(v);
	System.out.println(calcular.PI);
	

	}

}
