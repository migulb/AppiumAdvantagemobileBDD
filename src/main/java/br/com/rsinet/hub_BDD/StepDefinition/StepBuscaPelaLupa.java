package br.com.rsinet.hub_BDD.StepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import br.com.rsinet.hub_BDD.ScreenFactory.BuscaLupa_Screen;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import io.appium.java_client.android.AndroidDriver;

public class StepBuscaPelaLupa {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private BuscaLupa_Screen busca;

	public StepBuscaPelaLupa(TestContext context) throws MalformedURLException {

		testContext = context;
		busca = testContext.getPageFactory().getBusca();
		driver = testContext.getDriverFactory().getDriver();

	}

	@Dado("^a abertura do app digito no campo de Busca \"([^\"]*)\"$")
	public void a_abertura_do_app_digito_no_campo_de_Busca(String arg1) throws Throwable {

		busca.digitaBusca(arg1);
	}

	@E("^aperto na lupa de pesquisa$")
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
