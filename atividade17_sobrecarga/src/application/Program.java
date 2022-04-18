package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Sobrecarga é um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros
		
			// Proposta de melhoria:
			// - Criar um ocnstrutor opcional, o qual recebe apenas o nome e o preço do produto
			// - A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero

			// Nota: é possível também incluir um construtor padrão
		
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