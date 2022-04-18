import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Office desk";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("Produtos:%n%s, que o preço é R$%.2f%n%s, que o preço é R$%.2f%n" , produto1, preco1, produto2, preco2);
		System.out.printf("%nRegistros: %d anos de idade, código %d e sexo: %s%n", idade, codigo, sexo);
		System.out.printf("%nMedida com oito casas decimais: %.8f%nArredondamento (três casas decimais): %.3f%n", medida, medida);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Ponto decimal americano: %.3f", medida);
		
		/* Resolução sugerida pelo professor:
		  
		  import java.util.Locale;
				
			public class Main {
				
				public static void main(String[] args) {
				String product1 = "Computer";
				String product2 = "Office desk";
				byte age = 30;
				int code = 5290;
				char gender = 'F';
				double price1 = 2100.0;
				double price2 = 650.50;
				double measure = 53.234567;
				
				System.out.println("Products:");
				System.out.printf("%s, which price is $ %.2f%n", product1, price1);
				System.out.printf("%s, which price is $ %.2f%n", product2, price2);
				System.out.println();
				System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
				System.out.println();
				System.out.printf("Measue with eight decimal places: %.8f%n", measure);
				System.out.printf("Rouded (three decimal places): %.3f%n", measure);
				Locale.setDefault(Locale.US);
				System.out.printf("US decimal point: %.3f%n", measure);
		 */
		
	}

}
