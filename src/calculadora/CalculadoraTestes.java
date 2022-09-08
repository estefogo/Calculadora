package calculadora;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Soma calc1 = new Soma(); // nova instância de um objeto "calc1" do tipo "Soma"
		Subtracao calc2 = new Subtracao(); // nova instância de um objeto "calc2" do tipo "Subtracao"
		Divisao calc3 = new Divisao(); // nova instância de um objeto "calc3" do tipo "Divisao"
		Multiplicacao calc4 = new Multiplicacao(); // nova instância de um objeto "calc4" do tipo "Multiplicacao"
		
		/* os objetos instanciados acima permitem a utilização dos métodos criados nas classes Soma, Subtracao, 
		Divisao e Multiplicacao */
		
		/* CASO DE TESTE 1 */
		int soma1 = calc1.somar(3, 7); /* criação de uma variável "soma1" que utiliza o método "somar"
		aplicando os valores 3 e 7 como parâmetro */
		System.out.println(soma1); /* exibição do resultado da operação (variável "soma1"), sendo que o resultado esperado é 10 */
		
		/* CASO DE TESTE 2 */
		int soma2 = calc1.somar(-3, 7); /* criação de uma variável "soma2" que utiliza o método "somar"
		aplicando os valores -3 e 7 como parâmetro */
		System.out.println(soma2); /* exibição do resultado da operação (variável "soma2", sendo que o resultado esperado é 4 */
		
		/* CASO DE TESTE 3 */
		int soma3 = calc1.somar(3, -7); /* criação de uma variável "soma3" que utiliza o método "somar"
		aplicando os valores 3 e -7 como parâmetro */
		System.out.println(soma3); /* exibição do resultado da operação (variável "soma3"), sendo que o resultado esperado é -4 */
		
		/* CASO DE TESTE 4 */
		int soma4 = calc1.somar(-3, -7); /* criação de uma variável "soma4" que utiliza o método "somar"
		aplicando os valores -3 e -7 como parâmetro */
		System.out.println(soma4); /* exibição do resultado da operação (variável "soma4"), sendo que o resultado esperado é -10 */
		
		/* CASO DE TESTE 5 */
		int subtracao1 = calc2.subtrair(12,4); /* criação de uma variável "subtracao1" que utiliza o método 
		"subtrair" aplicando os valores 12 e 4 como parâmetro */
		System.out.println(subtracao1); /* exibição do resultado da operação (variável "subtracao1"), sendo que o resultado esperado é 8 */
		
		/* CASO DE TESTE 6 */
		int subtracao2 = calc2.subtrair(-12,4); /* criação de uma variável "subtracao2" que utiliza o método 
		"subtrair" aplicando os valores -12 e 4 como parâmetro */
		System.out.println(subtracao2); /* exibição do resultado da operação (variável "subtracao2"), sendo que o resultado esperado é -16 */
		
		/* CASO DE TESTE 7 */
		int subtracao3 = calc2.subtrair(12,-4); /* criação de uma variável "subtracao3" que utiliza o método 
		"subtrair" aplicando os valores 12 e -4 como parâmetro */
		System.out.println(subtracao3); /* exibição do resultado da operação (variável "subtracao3"), sendo que o resultado esperado é 16 */
		
		/* CASO DE TESTE 8 */
		int subtracao4 = calc2.subtrair(-12,-4); /* criação de uma variável "subtracao4" que utiliza o método 
		"subtrair" aplicando os valores -12 e -4 como parâmetro */
		System.out.println(subtracao4); /* exibição do resultado da operação (variável "subtracao4"), sendo que o resultado esperado é -8 */
		
		/* CASO DE TESTE 9 */
		int divisao1 = calc3.dividir(20,10); /* criação de uma variável "divisao1" que utiliza o método 
		"dividir" aplicando os valores 20 e 10 como parâmetro */
		System.out.println(divisao1); /* exibição do resultado da operação (variável "divisao1"), sendo que o resultado esperado é 2 */
		
		/* CASO DE TESTE 10 */
		int divisao2 = calc3.dividir(-20,10); /* criação de uma variável "divisao2" que utiliza o método 
		"dividir" aplicando os valores -20 e 10 como parâmetro */
		System.out.println(divisao2); /* exibição do resultado da operação (variável "divisao2"), sendo que o resultado esperado é -2 */
		
		/* CASO DE TESTE 11 */
		int divisao3 = calc3.dividir(20,-10); /* criação de uma variável "divisao3" que utiliza o método 
		"dividir" aplicando os valores 20 e -10 como parâmetro */
		System.out.println(divisao3); /* exibição do resultado da operação (variável "divisao3"), sendo que o resultado esperado é -2 */
		
		/* CASO DE TESTE 12 */
		int divisao4 = calc3.dividir(-20,-10); /* criação de uma variável "divisao4" que utiliza o método 
		"dividir" aplicando os valores -20 e -10 como parâmetro */
		System.out.println(divisao4); /* exibição do resultado da operação (variável "divisao4"), sendo que o resultado esperado é 2 */
		
		/* CASO DE TESTE 13 */
		int multiplicacao1 = calc4.multiplicar(5,3); /* criação de uma variável "multiplicacao1" que utiliza o método 
		"multiplicar" aplicando os valores 5 e 3 como parâmetro */
		System.out.println(multiplicacao1); /* exibição do resultado da operação (variável "multiplicacao1"), sendo que o resultado esperado é 15 */
		
		/* CASO DE TESTE 14 */
		int multiplicacao2 = calc4.multiplicar(-5,3); /* criação de uma variável "multiplicacao2" que utiliza o método 
		"multiplicar" aplicando os valores -5 e 3 como parâmetro */
		System.out.println(multiplicacao2); /* exibição do resultado da operação (variável "multiplicacao2"), sendo que o resultado esperado é -15 */
		
		/* CASO DE TESTE 15 */
		int multiplicacao3 = calc4.multiplicar(5,-3); /* criação de uma variável "multiplicacao3" que utiliza o método 
		"multiplicar" aplicando os valores 5 e -3 como parâmetro */
		System.out.println(multiplicacao3); /* exibição do resultado da operação (variável "multiplicacao3"), sendo que o resultado esperado é -15 */
		
		/* CASO DE TESTE 16 */
		int multiplicacao4 = calc4.multiplicar(-5,-3); /* criação de uma variável "multiplicacao4" que utiliza o método 
		"multiplicar" aplicando os valores -5 e -3 como parâmetro */
		System.out.println(multiplicacao4); /* exibição do resultado da operação (variável "multiplicacao4"), sendo que o resultado esperado é 15 */
	}
}