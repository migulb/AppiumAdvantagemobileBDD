package br.com.rsinet.hub_BDD.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import br.com.rsinet.hub_BDD.PageFactory.BuscaHome_Page;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class StepBuscaHome {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private BuscaHome_Page busca;

	public StepBuscaHome(TestContext context) {
		testContext = context;
		busca = testContext.getPageFactory().getHome();

	}

	@Dado("^que estou na Home$")
	public void que_estou_na_Home() throws Throwable {
		driver = testContext.getDriverFactory().getDriver();
	}

	@Quando("^clico em Headphones$")
	public void clico_em_Headphones() throws Throwable {
		busca.clicarProduto();
	}

	@Então("^escolho o fone HP H(\\d+)$")
	public void escolho_o_fone_HP_H(int arg1) throws Throwable {
		busca.escolherFone();
		String prods = driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
		Assert.assertTrue(prods.contains("HP H2310 IN-EAR"));
	}

	@Quando("^clico no Menu$")
	public void clico_no_Menu() throws Throwable {
		busca.clicoMenu();
	}

	@E("^clico em login$")
	public void clico_em_login() throws Throwable {
		busca.clicoLogin();
	}

	@E("^digito meu usuario e senha \"([^\"]*)\" \"([^\"]*)\"$")
	public void digito_meu_usuario_e_senha(String arg1, String arg2) throws Throwable {
		busca.digitaUsuario(arg1);
		busca.digitaSenha(arg2);
	}

	@E("^clico em Login para entrar$")
	public void clico_em_Login_para_entrar() throws Throwable {
		busca.clicoEmLogar();
	}

	@E("^clico em HeadPhones$")
	public void clico_em_HeadPhones() throws Throwable {
		busca.clicarProduto();
	}

	@E("^clico no fone HP H(\\d+)$")
	public void clico_no_fone_HP_H(int arg1) throws Throwable {
		busca.escolherFone();
	}

	@E("^clico em Quantity$")
	public void clico_em_Quantity() throws Throwable {
		busca.clicoEmQuantidade();
	}

	@Quando("^adiciono um grande quantidade \"([^\"]*)\"$")
	public void adiciono_um_grande_quantidade(String arg1) throws Throwable {
		busca.adicionaQuantidade(arg1);
	}

	@E("^clico em APPLY$")
	public void clico_em_APPLY() throws Throwable {
		busca.clicoEmApply();
	}

	@E("^adiciono no Carrinho$")
	public void adiciono_no_Carrinho() throws Throwable {
		busca.adicionoCarrinho();
	}

	@Então("^entro no carrinho e verifico a quantidade adicionada \"([^\"]*)\"$")
	public void entro_no_carrinho_e_verifico_a_quantidade_adicionada(String arg1) throws Throwable {
		busca.entroNoCarrrinho();
		String descr = driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartQuantity")).getText();
		Assert.assertNotEquals(descr, arg1);

	}

}
