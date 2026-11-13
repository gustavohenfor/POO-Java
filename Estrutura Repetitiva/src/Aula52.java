import java.util.Scanner;

public class Aula52 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 8) {
			System.out.println("Tenta denovo");
			x = sc.nextInt();
		}
		System.out.println("Finalmente!!!");
		
		sc.close();
	}
	
}