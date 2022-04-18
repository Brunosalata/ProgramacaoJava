import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Encapsulamento é um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas
			// operações seguras e que mantenham os objetos em um estado consistente
			// Comparar a um toca disco, que terá exposto botões específicos e esconderá circuitos e placas
		
			// Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso

			// Regra geral básica: 
			// - Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
			// - Os atributos devem ser acessados por meio de métodos get e set (Padrão JavaBeans) - Convensão de desenvolvimento, com algumas regras para padronizar
			
			// Padrão de aplicação de get e set no arquivo Product.java


		
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();		
		
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		String name = sc.nextLine();							
		System.out.print("Price: ");
		double price = sc.nextDouble();							
		//System.out.print("Quantity in stock: ");				// Deleção do requerimento do valor 'quantity'
		//int quantity = sc.nextInt();							
		Product product = new Product(name, price);				// Chamando o construtor de dois argumentos apenas
		
		//product.name = "Computer";							// esse comando solicita alteração da visibilidade do atributo name
		product.setName("Computer");							// com o método setName é possível alterar o valor do atributo name
	
		//System.out.println("Updated name: " + product.name); 	// Para que esse comando funcione, sem mudar a visibilidade do atributo name, é necessário criar o método getName
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("Quantity: " + product.getQuantity());
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		//quantity = sc.nextInt();								// necessário declarar 'int quantity' 
		int quantity = sc.nextInt();							
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
	
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();	
		
	}

}