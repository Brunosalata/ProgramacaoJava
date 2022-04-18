
public class Teoria {

/*	-- Classes são tipo referência
  
 		Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "setas" (tentáculos) para as caixas	
	
													// Dentro da memória, existem duas espaços: Stack, onde fica o espaço com o endereço, 
													   e o Heap, onde ficam armazenados os valores das variáveis (alocação dinámica de memória)
	
	Product p1, p2;									// classe Product e as variáveis p1 e p2
													// é criado um espaço para p1 e um para p2 no Stack, que apontarão os espaços no Heap que contenha seus valores
	p1 = new Product("TV", 900.00, 0);				// p1 recebe new Product, com os valores que preenchem o Heap
	
	p2 = p1;										// p2 recebe p1, então p2 passará a apontar para o endereço de memória de p1
	
	p2 = null;										// p2 não aponta para nenhum endereço
	
	
	-- Tipos primitivos são tipo valor
	
		Em Java, tipos primitivos são tipo valor, que são caixas e não ponteiros.
		
	double x, y;									// duas variáveis, com espaço dentro da Stack
	
	x = 10;											// O espaço na Stack já armazena os valores de x e y, não mais o endereço da Heap
	
	y = x;											// y recebe uma cópia de x
	
	
	-- Tipos primitivos em Java, tipos valor
	
	 -Tipo-			-Conteúdo-					-Padrão-	-Tamanho-					-Intervalo-
	 boolean		true ou false	 			 false		  1 bit			NA
	 char			caracter unicode			 \u0000		 16 bits		\u0000 a \uFFFF	
	 byte			integer							0  		 8 bits			-128 a 127
	 short			integer							0	 	 16 bits		-32768 a 32768
	 int			integer							0	 	 32 bits		-2147483648 a 2147483648
	 long			integer							0	 	 64 bits		-9223372036854775808 a 9223372036854775808
	 float			IEEE 754 pontos flutuantes		0.0	 	 32 bits		+/-1.4E-45 a +/-3.4028235E+38
	 double			IEEE 754 pontos flutuantes		0.0	 	 64 bits		+/-4.9E-324 a +/-1.7976931348623157E+308
	 
	 
	 -- Valores padrão
	 
	 	Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos
	 	- número: 0
	 	- boolean: false
	 	- char: caracter código 0
	 	- objeto: null															Memória
	 																name		price		quantity
	 	Product p = new Product(); 									null		0.0				0
	 	
	 	
	 -- Tipos referência vs. tipos valor
	 
	 	CLASSE													TIPO PRIMITIVO
	 	Vantagem: usufrui de todos os recursos Ori Obj			Vantagem: é mais semples e mais performático
	 	Variáveis são ponteiros									Variáveis são caixas
	 	Objetos precisam ser instanciadas usando new, ou		Não instancia. Uma vez declarados, estão prontos
	 		apontar para um objeto já existente						para uso
	 	Aceita valor null										Não aceita valor null
	 	y = x;													y = x;
	 		"y passa a apontar para onde x aponta"					"y recebe uma cópia de x"
	 	Objetos instanciados no Heap							"Objetos" instanciados no stack
	 	Objetos não utilizados são desalocados em um 			"Objetos" são deslocados imediatamente quando
	 		momento próximo pelo garbage collector					seu escopo de execução é finalizado
	 		
	 		
*/
}
