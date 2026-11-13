import java.util.Scanner;

public class Atv1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 1690) {
			System.out.println("Senha inválida, tente novamente!");
			senha = sc.nextInt();
		}
		System.out.println("Acesso liberado!");
		
	}

}
