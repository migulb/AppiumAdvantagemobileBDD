package br.com.rsinet.hub_BDD.StepDefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_BDD.ScreenFactory.Cadastro_Screen;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import io.appium.java_client.android.AndroidDriver;

public class StepCadastro {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private Cadastro_Screen cadastro;

	public StepCadastro(TestContext context) throws MalformedURLException {
		testContext = context;
		cadastro = testContext.getPageFactory().getCadastro();
		driver = testContext.getDriverFactory().getDriver();
	}

	@Dado("^a abertura do appAdvantage clico no menu esquerdo$")
	public void clico_no_menu_esquerdo() throws Throwable {
		cadastro.apertarMenu();
	}

	@E("^clico em login e depois em SIGN UP TODAY para abrir a tela de cadastros$")
	public void clico_em_login_e_depois_em_SIGN_UP_TODAY_para_abrir_a_tela_de_cadastros() throws Throwable {
		cadastro.apertarLogin();
		cadastro.apertarCriarConta();
	}

	@E("^Digito Usuario \"([^\"]*)\"$")
	public void digito_Usuario(String arg1) throws Throwable {
		cadastro.digitarUsuario(arg1);

	}

	@E("^o Email \"([^\"]*)\"$")
	public void o_Email(String arg1) throws Throwable {

		cadastro.digitarEmail(arg1);
	}

	@E("^a Senha \"([^\"]*)\"$")
	public void a_Senha(String arg1) throws Throwable {

		cadastro.digitarSenha(arg1);

	}

	@E("^confirmo a Senha \"([^\"]*)\"$")
	public void confirmo_a_Senha(String arg1) throws Throwable {

		cadastro.confirmaSenha(arg1);
	}

	@E("^digito primeiro Nome \"([^\"]*)\"$")
	public void digito_primeiro_Nome(String arg1) throws Throwable {

		cadastro.primeiroNome(arg1);
	}

	@E("^o ultimo nome \"([^\"]*)\"$")
	public void o_ultimo_nome(String arg1) throws Throwable {

		cadastro.ultimoNome(arg1, driver);
	}

	@E("^o telefone \"([^\"]*)\"$")
	public void o_telefone(String arg1) throws Throwable {
		cadastro.digitaTelefone(arg1);
	}

	@E("^o Pais$")
	public void o_Pais() throws Throwable {

		cadastro.escolhePais(driver);
	}

	@E("^o estado \"([^\"]*)\"$")
	public void o_estado(String arg1) throws Throwable {

		cadastro.digitarEstado(arg1);
	}

	@E("^o Endereco \"([^\"]*)\"$")
	public void o_Endereco(String arg1) throws Throwable {

		cadastro.digitaEndereco(arg1);
	}

	@E("^a cidade \"([^\"]*)\"$")
	public void a_cidade(String arg1) throws Throwable {

		cadastro.digitarCidade(arg1);
	}

	@E("^o CEP \"([^\"]*)\"$")
	public void o_CEP(String arg1) throws Throwable {

		cadastro.digitarCEP(arg1);
	}

	@E("^clico em confirmar no botão de Confirmar Cadastro$")
	public void clico_em_confirmar_no_botão_de_Confirmar_Cadastro() throws Throwable {

		cadastro.clicaConfirmaCadastro(driver);
	}

	@Então("^clico no menu \"([^\"]*)\"$")
	public void clico_no_menu(String arg1) throws Throwable {
		cadastro.menuFinal();
		String cadastro = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(cadastro.contains(arg1));
	}

	@Então("^clico no menu do lado esquerdo$")
	public void clico_no_menu_do_lado_esquerdo() throws Throwable {
		cadastro.menuFinal();
		String login = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText();
		Assert.assertTrue(login.contains("LOGIN"));
	}

	@E("^apos preencher todos os dados tento cadastrar um usuario ja existente$")
	public void apos_preencher_todos_os_dados_tento_cadastrar_um_usuario_ja_existente() throws Throwable {
		cadastro.clicaConfirmaCadastro(driver);
	}

}
