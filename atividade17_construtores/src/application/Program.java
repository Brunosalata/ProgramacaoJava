package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Product;
		
			// Construtores: operação especial da classe que executa no momento de instanciação do objeto
			// No momento do comando 'new'
			// Usado para iniciar valores dos atributos, além de obrigar ou permitir que o objeto receba dados ou 
			// dependências no momento de sua instanciação
			
			// Se uma classe customizado não for especificado, a classe disponibiliza um construtor padrão:
			// Product p = new Product();
			
			// É possível especificar mais de um construtor na mesma classe (sobrecarga)
		
		
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();				// com isso, instanciamos product com atributos "vazios" (name: null ; price e quantity: 0.0)
														// Podemos exigir que o programador inicie a instanciação com os atributos já definidos
														// Para isso, criamos um construtor que receba os argumentos em Product.java e
														// invertemos a ordem de solicitação dos dados no programa principal
														// Primeiro recebemos os valores para depois instanciarmos
									
		System.out.println("Enter product data: ");		
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine();							// variável temporária auxiliar para receber name
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();							// variável temporária auxiliar para receber price
		System.out.print("Quantity in stock: ");
		//product.quantity = sc.nextInt();
		int quantity = sc.nextInt();							// variável temporária auxiliar para receber quantity
		Product product = new Product(name, price, quantity);	// Realocação da instanciação de Product
		
		
		System.out.println();
		System.out.println(product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		//int quantity = sc.nextInt();							// não aceita a declaração int do atributo (deve apenas ser removido)
		quantity = sc.nextInt();								// nova configuração
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