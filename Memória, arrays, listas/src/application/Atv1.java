package application;

import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println("Números negativos:");
		for(int i = 0; i<n;i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

	}

}
