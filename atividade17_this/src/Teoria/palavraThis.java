package Teoria;

public class palavraThis {

/*		this
	
		É uma referência para o próprio objeto
	
		Usos comuns:
		- Diferenciar atributos de variáveis locais
		- Passar o próprio objeto como argumento na chamada de um método ou construtor
		
	Diferenciar atributos de variáveis locais
		
		Product product = new Product("TV", 1500.0, 0);
		
		- Na memória, será acionado o escopo do construtor, com as variáveis locais do construtor (os próprios parâmetros; "TV", 1500.0 e 0)
		
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		- valores presentes nas variáveis do construtor serão copiados para o objeto Product
		- a palavra 'this' faz com que o sistema acesse o valor do objeto, não do construtor, na variável local)
		- caso não seja incluído 'this', o sistema dá prioridade ao parâmetro, promovendo o acesso ao valor da variável local, no escopo do construtor
	
*/	
	
}
