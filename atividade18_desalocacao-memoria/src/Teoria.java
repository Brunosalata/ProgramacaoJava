
public class Teoria {

/*	Deslocamento de memória - garbage collector e escopo local
  
 		Garbage Collector (deslocamento por garbage collector)
 		
 		- É um processo que automatiza o gerenciamento de memória (do Heap) de um programa em execução
		- Monitora os objetos alocados dinamicamente pelo programa (no Heap), deslocando aqueles que não estão mais sendo utilizados
	
				Product p1, p2;
				
				p1 = new Product("TV", 900.00, 0);						// no stack, p1 aponta endereço do Heap
				
				p2 = new Product("Mouse", 30.00, 0);					// no stack, p1 aponta endereço do Heap
	
				p1 = p2;												// p1 passa a apontar para o endereço de p2, deixando os espaços iniciais de p1 (na heap)
																		// sem uma referência. Eles serão liberados pela garbage collector em pouco tempo, liberando a memória
	
		Desalocação por escopo
	
			ex1:	void method1() {									// dentro de stack, um espaço é criado para o escopo do method1
						int x = 10;										// onde é criado um espaço para incluir o valor de x
						if (x > 0) {									// e onde é criado um espaço para o escopo do if
							int y = 20;									// onde, por sua vez, é criado um espaço para declarar o valor de y
						}
						System.out.println(x);							// Assim que o método if é finalizado, seu valor é desalocado
					}													// Assim que o method1 é finalizado, todas as variáveis locais serão desalocadas
	
			
			ex2:	void method1() {
						Product p = method2();							// Quando p chama a execução do method2, a execução vai para o method2()
						System.out.println(p.name);						// que tem referência no stack (subescopo que engloba todo o método), apontando 
					}													// para os endereços na Heap, que receberão os valores "TV", 900.00 e 0
					
					Product method2() {
						Product prod = new Product("TV", 900.00, 0);	// O method2 vai retornar a referência para o objeto na Heap ("TV", 900.00, 0)
						return prod;									// Então, quando o return for executado a variável p vai receber essa referência
					}													// e passará a apontar esse mesmo objeto. NEsse momento, teremos condição de fazer um 
																		// print(p.name), imprimindo "TV".
																		
																		// Mesmo method2 sendo um método com escopo provisório, o que foi instanciado no heap é mantido.
	
	Resumo:
			
			- Objetos alocados dinamicamente, quando não possuem mais referência para eles, serão desalocados pelo garbage collector
			
			- Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução
			
*/
}
