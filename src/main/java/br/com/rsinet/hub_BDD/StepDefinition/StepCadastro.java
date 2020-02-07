package br.com.rsinet.hub_BDD.StepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_BDD.PageFactory.Cadastro_Page;
import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class StepCadastro {

	private static AndroidDriver<WebElement> driver;
	private TestContext testContext;
	private Cadastro_Page cadas;

	public StepCadastro(TestContext context) throws MalformedURLException {
		testContext = context;
		cadas = testContext.getPageFactory().getCadastro();
		// driver = testContext.getDriverFactory().getDriver();
	}

	@Dado("^que estou na pagina inicial do app advantage$")
	public void que_estou_na_pagina_inicial_do_app_advantage() throws Throwable {

		driver = testContext.getDriverFactory().getDriver();

	}

	@Quando("^clico no menu esquerdo$")
	public void clico_no_menu_esquerdo() throws Throwable {
		cadas.apertarMenu();
	}

	@E("^clico em login e depois em SIGN UP TODAY para abrir a tela de cadastros$")
	public void clico_em_login_e_depois_em_SIGN_UP_TODAY_para_abrir_a_tela_de_cadastros() throws Throwable {
		cadas.apertarLogin();
		cadas.apertarCriarConta();
	}

	@E("^Digito Usuario \"([^\"]*)\"$")
	public void digito_Usuario(String arg1) throws Throwable {
		cadas.digitarUsuario(arg1);

	}

	@E("^o Email \"([^\"]*)\"$")
	public void o_Email(String arg1) throws Throwable {

		cadas.digitarEmail(arg1);
	}

	@E("^a Senha \"([^\"]*)\"$")
	public void a_Senha(String arg1) throws Throwable {

		cadas.digitarSenha(arg1);

	}

	@E("^confirmo a Senha \"([^\"]*)\"$")
	public void confirmo_a_Senha(String arg1) throws Throwable {

		cadas.confirmaSenha(arg1);
	}

	@E("^digito primeiro Nome \"([^\"]*)\"$")
	public void digito_primeiro_Nome(String arg1) throws Throwable {

		cadas.primeiroNome(arg1);
	}

	@E("^o ultimo nome \"([^\"]*)\"$")
	public void o_ultimo_nome(String arg1) throws Throwable {

		cadas.ultimoNome(arg1, driver);
	}

	@E("^o telefone \"([^\"]*)\"$")
	public void o_telefone(String arg1) throws Throwable {
		cadas.digitaTelefone(arg1);
	}

	@E("^o Pais$")
	public void o_Pais() throws Throwable {

		cadas.escolhePais(driver);
	}

	@E("^o estado \"([^\"]*)\"$")
	public void o_estado(String arg1) throws Throwable {

		cadas.digitarEstado(arg1);
	}

	@E("^o Endereco \"([^\"]*)\"$")
	public void o_Endereco(String arg1) throws Throwable {

		cadas.digitaEndereco(arg1);
	}

	@E("^a cidade \"([^\"]*)\"$")
	public void a_cidade(String arg1) throws Throwable {

		cadas.digitarCidade(arg1);
	}

	@E("^o CEP \"([^\"]*)\"$")
	public void o_CEP(String arg1) throws Throwable {

		cadas.digitarCEP(arg1);
	}

	@E("^clico em confirmar no botão de Confirmar Cadastro$")
	public void clico_em_confirmar_no_botão_de_Confirmar_Cadastro() throws Throwable {

		cadas.clicaConfirmaCadastro(driver);
	}

	@Então("^clico no menu$")
	public void clico_no_menu() throws Throwable {
		cadas.menuFinal();
		// DriverFactory.fecharDriver();
	}

	@E("^apos preencher todos os dados tento cadastrar um usuario ja existente$")
	public void apos_preencher_todos_os_dados_tento_cadastrar_um_usuario_ja_existente() throws Throwable {
		cadas.clicaConfirmaCadastro(driver);
	}

}
