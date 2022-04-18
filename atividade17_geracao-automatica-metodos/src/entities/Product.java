package entities;

public class Product {

	private String name;			// encapsulamento dos atributos 'private'
	private double price;
	private int quantity;
	
	// Criação automática de construtores, getters e setters no eclipse
	// Deleção dos métodos construtores, setters e getters anteriormente criados
	
	// Botão direito >> Source >> Generate Constructor using Fields
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// Botão direito >> Source >> Generate 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	// Métodos anteriormente criados
	
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