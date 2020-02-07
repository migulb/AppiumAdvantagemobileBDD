package br.com.rsinet.hub_BDD.StepDefinition;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_BDD.PageFactory.BuscaHome_Page;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import io.appium.java_client.android.AndroidDriver;

public class StepBuscaHome {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private BuscaHome_Page busca;

	public StepBuscaHome(TestContext context) {
		testContext = context;
		busca = testContext.getPageFactory().getHome();

	}

	@Dado("^que estou na Home clico em Headphones$")
	public void que_estou_na_Home_clico_em_Headphones() throws Throwable {
		driver = testContext.getDriverFactory().getDriver();
		busca.clicarProduto();

	}

	@Dado("^que estou na Home no menu$")
	public void que_estou_na_Home_no_menu() throws Throwable {

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

	@Dado("^clico em Login para entrar$")
	public void clico_em_Login_para_entrar() throws Throwable {
		busca.clicoEmLogar();
	}

	@E("^clico em HeadPhones$")
	public void clico_em_HeadPhones() throws Throwable {
		busca.clicarProduto();
	}

	@E("^clico no fone HP H(\\d+) IN EAR$")
	public void clico_no_fone_HP_H_IN_EAR(int arg1) throws Throwable {
		busca.escolherFone();

	}

	@E("^clico em Quantity$")
	public void clico_em_Quantity() throws Throwable {

		busca.clicoEmQuantidade();
	}

	@E("^adiciono um grande quantidade$")
	public void adiciono_um_grande_quantidade() throws Throwable {

		busca.adicionaQuantidade("300");

	}

	@E("^clico em APPLY$")
	public void clico_em_APPLY() throws Throwable {

		busca.clicoEmApply();
	}

	@E("^adiciono no Carrinho$")
	public void adiciono_no_Carrinho_e_verifico_a_quantidade_adicionada() throws Throwable {

		busca.adicionoCarrinho();
	}

	@Então("^clico no fone HP H(\\d+)$")
	public void clico_no_fone_HP_H(int arg1) throws Throwable {
		busca.escolherFone();
	}

	@Então("^entro no carrinho e verifico a quantidade adicionada$")
	public void entro_no_carrinho_e_verifico_a_quantidade_adicionada() throws Throwable {

		busca.entroNoCarrrinho();
	}

}
