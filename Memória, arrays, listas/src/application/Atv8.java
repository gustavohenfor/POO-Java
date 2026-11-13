package application;

import java.util.Scanner;

public class Atv8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas you want to digit? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			
		}
		
		int maioridade = idade[0];
	    int posicaomaior = 0;

	    for (int i=1; i<n; i++) {
	        if (idade[i] > maioridade) {
	            maioridade = idade[i];
	            posicaomaior = i;
	        }
	    }
	    
	    System.out.println("Pessoa com a maior IDADE: ");
	    System.out.println("Nome: " + nome[posicaomaior]);

		
		
		
		
		
		
		

	}

}
