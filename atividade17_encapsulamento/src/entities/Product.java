package entities;

public class Product {

/*			Padrão de implementação de getters e setters
	
				private String name;
				private double price;
				
				public String getName() {							// get - método para obter o nome retorna o atributo
					return name;									// simplesmente puxa o valor do atributo
				}
				
				public void setName(String name) {					// set - método usado para alterar o valor do atributo
					this.name = name;								// para isso, ele recebe um valor diferente, mas não retorna nada
				}
				
				public double getPrice() {
					return price;
				}
			
				public void setPrice(double price) {
					this.price = price;
				}
*/
	
	
	private String name;			// encapsulamento dos atributos 'private'
	private double price;
	private int quantity;
	
	public Product() {													// construtor padrão, para chamar os diferentes construtores sobrecarga
	}																	// 'Product p = new Product();' no Program. Não resulta conflito
	
	
						// parâmetro do método
	public Product(String name, double price, int quantity) {			// executa no momento da instanciação
		this.name = name;												// 'this.name' referencia o atributo do objeto
		this.price = price;												// 'name' referencia o parâmetro (dentro do método)
		this.quantity = quantity;
	}								
	
	// Copiando o construtor acima para que haja sobrecarga no de baixo
	
	public Product(String name, double price) {						
		this.name = name;											
		this.price = price;											
		quantity = 0;											
	}																
	
	
	// Por convensão, devemos inserir os métodos get e set após os construtores
	
	public void setName(String name) {
		this.name = name;							// método set que recebe um String name como argumento e joga dentro do
	}												// atributo name (this.name) o name recebido como argumento (name)
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
		
	public int getQuantity() {
		return quantity;
	}
	
	//public void setQuantity (int quantity) {		// Esse método não será implementado, pois a alteração na quantidade somente
	//	this.price = price;							// será alterada mediante adição ou remoção de quantidades do estoque
	//}												// e esses métodos já foram criados. Assim, é possível proteger a informação 
													// para que sempre esteja em uma condição consistente
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
