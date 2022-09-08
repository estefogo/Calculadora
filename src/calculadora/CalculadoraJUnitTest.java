package calculadora;

import static org.junit.jupiter.api.Assertions.*; /* implementação da framework do JUnit para testes automatizados */

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraJUnitTest {
	@SuppressWarnings("deprecation")
	
	/* CASO DE TESTE 1 */
	@Test
	public void SomarDoisNumerosPositivos() { /* criação do método "SomarDoisNumerosPositivos" para o primeiro caso de teste */
		Soma calc1 = new Soma(); /* instância de um novo objeto "calc1" do tipo "Soma", que permite a utilização dos métodos
		da referida classe */
		int soma = calc1.somar(3, 7); /* criação de uma variável "soma" que utiliza o método "somar" aplicando os valores
		3 e 7 como parâmetros*/

		Assert.assertEquals(10, soma); /* utilização do método Assert para comparar o resultado esperado (10) com o resultado
		real da operação (variável "soma") */
	}
	
	/* CASO DE TESTE 2 */
	@Test
	public void SomarPrimeiroNegativo() { /* criação do método "SomarPrimeiroNegativo" para o segundo caso de teste */
		Soma calc2 = new Soma(); /* instância de um novo objeto "calc2" do tipo "Soma", que permite a utilização dos métodos
		da referida classe */
		int soma = calc2.somar(-3, 7); /* criação de uma variável "soma" que utiliza o método "somar" aplicando os valores
		-3 e 7 como parâmetros*/
		
		Assert.assertEquals(4, soma); /* utilização do método Assert para comparar o resultado esperado (4) com o resultado
		real da operação (variável "soma") */
	}
	
	/* CASO DE TESTE 3 */
	@Test
	public void SomarSegundoNegativo() { /* criação do método "SomarSegundoNegativo" para o terceiro caso de teste */
		Soma calc3 = new Soma(); /* instância de um novo objeto "calc3" do tipo "Soma", que permite a utilização dos métodos
		da referida classe */
		int soma = calc3.somar(3, -7); /* criação de uma variável "soma" que utiliza o método "somar" aplicando os valores
		3 e -7 como parâmetros*/
		
		Assert.assertEquals(-4, soma); /* utilização do método Assert para comparar o resultado esperado (-4) com o resultado
		real da operação (variável "soma") */
	}
	/* CASO DE TESTE 4 */
	@Test
	public void SomarDoisNegativos() { /* criação do método "SomarDoisNegativos" para o quarto caso de teste */
		Soma calc4 = new Soma(); /* instância de um novo objeto "calc4" do tipo "Soma", que permite a utilização dos métodos
		da referida classe */
		int soma = calc4.somar(-3, -7); /* criação de uma variável "soma" que utiliza o método "somar" aplicando os valores
		-3 e -7 como parâmetros*/
		
		Assert.assertEquals(-10, soma); /* utilização do método Assert para comparar o resultado esperado (-10) com o resultado
		real da operação (variável "soma") */
	}
	
	/* CASO DE TESTE 5 */
	@Test
	public void SubtrairDoisPositivos() { /* criação do método "SubtrairDoisPositivos" para o quinto caso de teste */
		Subtracao calc5 = new Subtracao(); /* instância de um novo objeto "calc5" do tipo "Subtracao", que permite a utilização dos métodos
		da referida classe */
		int subtracao = calc5.subtrair(12, 4); /* criação de uma variável "subtracao" que utiliza o método "subtrair" aplicando os valores
		12 e 4 como parâmetros*/
		
		Assert.assertEquals(8, subtracao); /* utilização do método Assert para comparar o resultado esperado (8) com o resultado
		real da operação (variável "subtracao") */
	}
	
	/* CASO DE TESTE 6 */
	@Test
	public void SubtrairPrimeiroNegativo() { /* criação do método "SubtrairPrimeiroNegativo" para o sexto caso de teste */
		Subtracao calc6 = new Subtracao(); /* instância de um novo objeto "calc6" do tipo "Subtracao", que permite a utilização dos métodos
		da referida classe */
		int subtracao = calc6.subtrair(-12, 4); /* criação de uma variável "subtracao" que utiliza o método "subtrair" aplicando os valores
		-12 e 4 como parâmetros*/
		
		Assert.assertEquals(-16, subtracao); /* utilização do método Assert para comparar o resultado esperado (-16) com o resultado
		real da operação (variável "subtracao") */
	}
	
	/* CASO DE TESTE 7 */
	@Test
	public void SubtrairSegundoNegativo() { /* criação do método "SubtrairSegundoNegativo" para o sétimo caso de teste */
		Subtracao calc7 = new Subtracao(); /* instância de um novo objeto "calc7" do tipo "Subtracao", que permite a utilização dos métodos
		da referida classe */
		int subtracao = calc7.subtrair(12, -4); /* criação de uma variável "subtracao" que utiliza o método "subtrair" aplicando os valores
		12 e -4 como parâmetros*/
		
		Assert.assertEquals(16, subtracao); /* utilização do método Assert para comparar o resultado esperado (16) com o resultado
		real da operação (variável "subtracao") */
	}
	
	/* CASO DE TESTE 8 */
	@Test
	public void SubtrairDoisNegativos() { /* criação do método "SubtrairDoisNegativos" para o oitavo caso de teste */
		Subtracao calc8 = new Subtracao(); /* instância de um novo objeto "calc8" do tipo "Subtracao", que permite a utilização dos métodos
		da referida classe */
		int subtracao = calc8.subtrair(-12, -4); /* criação de uma variável "subtracao" que utiliza o método "subtrair" aplicando os valores
		-12 e -4 como parâmetros*/
		
		Assert.assertEquals(-8, subtracao); /* utilização do método Assert para comparar o resultado esperado (-8) com o resultado
		real da operação (variável "subtracao") */
	}
	
	/* CASO DE TESTE 9 */
	@Test
	public void DividirDoisPositivos() { /* criação do método "DividirDoisPositivos" para o nono caso de teste */
		Divisao calc9 = new Divisao(); /* instância de um novo objeto "calc9" do tipo "Divisao", que permite a utilização dos métodos
		da referida classe */
		int divisao = calc9.dividir(20, 10); /* criação de uma variável "divisao" que utiliza o método "dividir" aplicando os valores
		20 e 10 como parâmetros*/
		
		Assert.assertEquals(2, divisao); /* utilização do método Assert para comparar o resultado esperado (2) com o resultado
		real da operação (variável "divisao") */
	}
	
	/* CASO DE TESTE 10 */
	@Test
	public void DividirPrimeiroNegativo() { /* criação do método "DividirPrimeiroNegativo" para o décimo caso de teste */
		Divisao calc10 = new Divisao(); /* instância de um novo objeto "calc10" do tipo "Divisao", que permite a utilização dos métodos
		da referida classe */
		int divisao = calc10.dividir(-20, 10); /* criação de uma variável "divisao" que utiliza o método "dividir" aplicando os valores
		-20 e 10 como parâmetros*/
		
		Assert.assertEquals(-2, divisao); /* utilização do método Assert para comparar o resultado esperado (-2) com o resultado
		real da operação (variável "divisao") */
	}
	
	/* CASO DE TESTE 11 */
	@Test
	public void DividirSegundoNegativo() { /* criação do método "DividirSegundoNegativo" para o décimo primeiro caso de teste */
		Divisao calc11 = new Divisao(); /* instância de um novo objeto "calc11" do tipo "Divisao", que permite a utilização dos métodos
		da referida classe */
		int divisao = calc11.dividir(20, -10); /* criação de uma variável "divisao" que utiliza o método "dividir" aplicando os valores
		20 e -10 como parâmetros*/
		
		Assert.assertEquals(-2, divisao); /* utilização do método Assert para comparar o resultado esperado (-2) com o resultado
		real da operação (variável "divisao") */
	}
	
	/* CASO DE TESTE 12 */
	@Test
	public void DividirDoisNegativos() { /* criação do método "DividirDoisNegativos" para o décimo segundo caso de teste */
		Divisao calc12 = new Divisao(); /* instância de um novo objeto "calc12" do tipo "Divisao", que permite a utilização dos métodos
		da referida classe */
		int divisao = calc12.dividir(-20, -10); /* criação de uma variável "divisao" que utiliza o método "dividir" aplicando os valores
		-20 e -10 como parâmetros*/
		
		Assert.assertEquals(2, divisao); /* utilização do método Assert para comparar o resultado esperado (2) com o resultado
		real da operação (variável "divisao") */
	}
	
	/* CASO DE TESTE 13 */
	@Test
	public void MultiplicarDoisPositivos() { /* criação do método "MultiplicarDoisPositivos" para o décimo terceiro caso de teste */
		Multiplicacao calc13 = new Multiplicacao(); /* instância de um novo objeto "calc13" do tipo "Multiplicacao", que permite a utilização dos métodos
		da referida classe */
		int multiplicacao = calc13.multiplicar(5, 3); /* criação de uma variável "multiplicacao" que utiliza o método "multiplicar" aplicando os valores
		5 e 3 como parâmetros*/
		
		Assert.assertEquals(15, multiplicacao); /* utilização do método Assert para comparar o resultado esperado (15) com o resultado
		real da operação (variável "multiplicacao") */
	}
	
	/* CASO DE TESTE 14 */
	@Test
	public void MultiplicarPrimeiroNegativo() { /* criação do método "MultiplicarPrimeiroNegativo" para o décimo quarto caso de teste */
		Multiplicacao calc14 = new Multiplicacao(); /* instância de um novo objeto "calc14" do tipo "Multiplicacao", que permite a utilização dos métodos
		da referida classe */
		int multiplicacao = calc14.multiplicar(-5, 3); /* criação de uma variável "multiplicacao" que utiliza o método "multiplicar" aplicando os valores
		-5 e 3 como parâmetros*/
		
		Assert.assertEquals(-15, multiplicacao); /* utilização do método Assert para comparar o resultado esperado (-15) com o resultado
		real da operação (variável "multiplicacao") */
	}
	
	/* CASO DE TESTE 15 */
	@Test
	public void MultiplicarSegundoNegativo() { /* criação do método "MultiplicarSegundoNegativo" para o décimo quinto caso de teste */
		Multiplicacao calc15 = new Multiplicacao(); /* instância de um novo objeto "calc15" do tipo "Multiplicacao", que permite a utilização dos métodos
		da referida classe */
		int multiplicacao = calc15.multiplicar(5, -3); /* criação de uma variável "multiplicacao" que utiliza o método "multiplicar" aplicando os valores
		5 e -3 como parâmetros*/
		
		Assert.assertEquals(-15, multiplicacao); /* utilização do método Assert para comparar o resultado esperado (-15) com o resultado
		real da operação (variável "multiplicacao") */
	}
	
	/* CASO DE TESTE 16 */
	@Test
	public void MultiplicarDoisNegativos() { /* criação do método "MultiplicarDoisNegativos" para o décimo sexto caso de teste */
		Multiplicacao calc16 = new Multiplicacao(); /* instância de um novo objeto "calc16" do tipo "Multiplicacao", que permite a utilização dos métodos
		da referida classe */
		int multiplicacao = calc16.multiplicar(-5, -3); /* criação de uma variável "multiplicacao" que utiliza o método "multiplicar" aplicando os valores
		-5 e -3 como parâmetros*/
		
		Assert.assertEquals(15, multiplicacao); /* utilização do método Assert para comparar o resultado esperado (15) com o resultado
		real da operação (variável "multiplicacao") */
	}
}