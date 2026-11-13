package application;

import java.util.Scanner;

import entidade.Conta;

public class banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter account numnber: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter de account holder: ");
		String nome = sc.nextLine();
		
		Conta conta = new Conta(numero, nome);
		
		System.out.print("Você deseja fazer uma eposito inicial? (y/n) " );
		String resp = sc.nextLine();
		
		if(resp.equalsIgnoreCase("y")) {
			System.out.print("Digite o valor do deposito inicial: R$");
			double vdeposito = sc.nextDouble();
			conta.deposito(vdeposito);
		}
		
		System.out.println();
		System.out.println("Abertura confirmada. Wasu Bank&Tech");
		System.out.println("Dados da Conta:");
		System.out.println("Numero: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
		
		System.out.println();
		System.out.print("Digite o valor do deposito: R$");
		double vdeposito = sc.nextDouble();
		conta.deposito(vdeposito);
		
		System.out.println();
		System.out.println("Atualização na Conta:");
		System.out.println("Numero: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
		
		System.out.println();
		System.out.print("Digite o valor do saque: R$");
		double vsaque = sc.nextDouble();
		conta.saque(vsaque);
		
		System.out.println();
		System.out.println("Atualização na Conta:");
		System.out.println("Numero: " + numero + ", Nome: " + nome + ", Saldo: R$" + conta.getSaldo());
	}

}
