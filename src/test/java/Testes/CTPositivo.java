package Testes;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Funcoes.Cadastro;
import Funcoes.Inicial;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class CTPositivo {
	Inicial inicial = new Inicial();
	Cadastro cadastro = new Cadastro();
	ChromeDriver browser = new ChromeDriver();

	@Test(alwaysRun = true)
	public void sysout() throws Throwable {
		System.out.println("Teste Positivo");		
		
		inicial.acessarPaginaInicial();
		cadastro.inserirDadosPaginaCadastro();

		browser.close();
	}
}
