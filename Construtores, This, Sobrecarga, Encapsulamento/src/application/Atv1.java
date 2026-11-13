package application;

import java.util.Scanner;

import entidade.Conta;

public class Atv1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		Conta conta = new Conta(numero, nome);
		
		System.out.print("Deseja fazer um depósito inicial? (y/n) ");
		String resp = sc.nextLine();
		
		if(resp.equalsIgnoreCase("y")) {
			System.out.print("Digite o valor do depósito: R$");
			double vdeposito = sc.nextDouble();
			conta.deposito(vdeposito);
		} 
		System.out.println();
		System.out.println("Abertura de Conta concluída com êxito. ");
        System.out.println("Conta: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
        
        System.out.println();
        System.out.print("Digite o valor desejado para o depósito majoritário: R$");
        double vdeposito = sc.nextDouble();
		conta.deposito(vdeposito);
		System.out.println("Dados da Conta: ");
        System.out.println("Conta: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
       
        System.out.println();
        System.out.print("Digite o valor desejado para sacar: R$");
        double vsaque = sc.nextDouble();
        conta.saque(vsaque);
        System.out.println("Dados da Conta: ");
        System.out.println("Conta: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
		
		

	}

}
