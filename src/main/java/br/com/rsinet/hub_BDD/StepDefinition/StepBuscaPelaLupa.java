package br.com.rsinet.hub_BDD.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import br.com.rsinet.hub_BDD.PageFactory.BuscaLupa_Page;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import io.appium.java_client.android.AndroidDriver;

public class StepBuscaPelaLupa {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private BuscaLupa_Page busca;

	public StepBuscaPelaLupa(TestContext context) {

		testContext = context;
		busca = testContext.getPageFactory().getBusca();

	}

	@Dado("^que estou na pagina inicial do app$")
	public void que_estou_na_pagina_inicial_do_app_advantage() throws Throwable {
		driver = testContext.getDriverFactory().getDriver();
	}

	@E("^digito no campo de Busca \"([^\"]*)\"$")
	public void digito_no_campo_de_Busca(String arg1) throws Throwable {

		busca.digitaBusca(arg1);
	}

	@Então("^aperto na lupa de pesquisa$")
	public void aperto_na_lupa_de_pesquisa() throws Throwable {
		busca.lupa();
	}

	@Então("^aperto no tablet desejado$")
	public void aperto_no_tablet_desejado() throws Throwable {
		busca.tablet();
		String tablet = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(tablet.contains("HP ELITE X2 1011 G1"));
	}

	@Então("^clico na lupa de pesquisa$")
	public void clico_na_lupa_de_pesquisa() throws Throwable {
		busca.lupa();
		String erro = driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
		Assert.assertTrue(erro.contains("No results for \"mesa\""));
	}
}
