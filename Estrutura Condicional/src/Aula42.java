
import java.util.Scanner;

public class Aula42 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1, n2, n3;
	int media;
	
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	n3 = sc.nextInt();
	
	media = (n1 + n2 + n3)/3;
	
	if(media >= 6) {
		
		System.out.println("Você está APROVADO, com nota média geral do curso: " +media);
		
	} else {
		System.out.println("Você está REPROVADO, contatar cordenação, tendo media: "+media);
	}
	
	}

}
