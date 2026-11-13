
public class main {
	
	public static void main (String[] args) {
		
		String product1 ="MacBook Neo";
		String product2 ="Pacote Office";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 57.90;
		double measure = 53.234567;
		
		System.out.printf("Products: %n");
		System.out.printf("%s, which price is %.4f%n", product1, price1);
		System.out.printf("%s, which price is %.4f%n", product2, price2);
		System.out.printf("%n");
		System.out.printf("Recod of the Year: %d years old, code is %d and gender: %s", age, code, gender);
		System.out.println("");
		System.out.printf("Measure with eight decimal places: %.4f%n", measure);
		System.out.printf("Rouded (three decimal places): %.4f\n", measure);
		System.out.printf("US decimal point is %.4f\n", measure);
	}
}
