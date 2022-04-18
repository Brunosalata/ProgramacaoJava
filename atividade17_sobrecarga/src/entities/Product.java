package entities;

public class Product {

	public String name;			// atributo do objeto
	public double price;
	public int quantity;
	
	public Product() {													// construtor padrão, para chamar os diferentes construtores sobrecarga
	}																	// 'Product p = new Product();' no Program
	
	
						// parâmetro do método
	public Product(String name, double price, int quantity) {			// executa no momento da instanciação
		this.name = name;												// 'this.name' referencia o atributo do objeto
		this.price = price;												// 'name' referencia o parâmetro (dentro do método)
		this.quantity = quantity;
	}								
	
	// Copiando o construtor acima para que haja sobrecarga no de baixo
	
	public Product(String name, double price) {						// excluimos o argumento 'int quantity' 
		this.name = name;											// iniciamos 'quantity' com o valor zero, mesmo que, por padrão
		this.price = price;											// a linguagem java inicia números de objetos e arrays com zero.
		quantity = 0;											// Logo, essa linha é opcional.
	}																// Por não ter ambiguidade entre valor do objeto e local, não requer 'this'
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {		// chamando println(product) no main, automaticamente é chamado o toString()
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units. Total: $ "
				+ String.format("%.2f", totalValueInStock());
				
	}
}
