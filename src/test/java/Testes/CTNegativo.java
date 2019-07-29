package Testes;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcoes.Cadastro;
import Funcoes.Inicial;

public class CTNegativo {
	Inicial inicial = new Inicial();
	Cadastro cadastro = new Cadastro();
	ChromeDriver browser = new ChromeDriver();
	
	@Test(alwaysRun = true)
	public void sysout() throws Throwable {
		System.out.println("Teste Negativo");
		inicial.acessarPaginaInicial();
		cadastro.inserirDadosIncorretos();	
		
		browser.close();
	}
}
