package application;

import java.util.Scanner;

public class Atv9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		Double[] n1 = new Double[n];
		Double[] n2 = new Double[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Digite seu nome, primeira e segunda nota do %do aluno: %n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		
		for(int i=0;i<n;i++) {
		
			double media = (n1[i]+n2[i])/2;
			if(media >= 6) {
				System.out.printf("APROVADO: %s \n", nome[i]);
			}
		}

	}

}
