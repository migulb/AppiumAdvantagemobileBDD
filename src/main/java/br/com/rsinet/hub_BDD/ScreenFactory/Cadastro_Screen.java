package br.com.rsinet.hub_BDD.ScreenFactory;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_BDD.Utility.AcoesDeTouch;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro_Screen {

	private WebDriverWait wait;
	private AndroidDriver<WebElement> driver;
	private AcoesDeTouch scroll;
	private AcoesDeTouch touch;

	public Cadastro_Screen(AndroidDriver<WebElement> driver) throws MalformedURLException {

		AcoesDeTouch touch = new AcoesDeTouch(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);

	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement btn_login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement btn_CriarConta;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private WebElement txt_usuario;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]")
	private WebElement txt_email;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private WebElement txt_senha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]")
	private WebElement txt_ConfSenha;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]")
	private WebElement txt_PrimeNome;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]")
	private WebElement txt_UltimoNome;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]")
	private WebElement txt_Telefone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountries")
	private WebElement cmbx_pais;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/textViewCountries']/child::*[1]")
	private WebElement pais;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private WebElement txt_Endereco;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	private WebElement txt_Cidade;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement txt_Estado;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private WebElement txt_CEP;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_ConfirmaCadastro;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement aguarda;

	public void apertarMenu() {

		btn_menu.click();
	}

	public void apertarLogin() {
		btn_login.click();
	}

	public void apertarCriarConta() {
		btn_CriarConta.click();
	}

	public void digitarUsuario(String usuario) {
		txt_usuario.click();
		txt_usuario.sendKeys(usuario);
	}

	public void digitarEmail(String email) {
		txt_email.click();
		txt_email.sendKeys(email);
	}

	public void digitarSenha(String senha) {
		txt_senha.click();
		txt_senha.sendKeys(senha);

	}

	public void confirmaSenha(String confsenha) {
		txt_ConfSenha.click();
		txt_ConfSenha.sendKeys(confsenha);

	}

	public void primeiroNome(String primNome) {
		txt_PrimeNome.click();
		txt_PrimeNome.sendKeys(primNome);

	}

	public void ultimoNome(String ultimoNome, AndroidDriver<WebElement> driver) {
		txt_UltimoNome.click();
		txt_UltimoNome.sendKeys(ultimoNome);

		AcoesDeTouch.scrollAndClick(driver, "ZIP");

	}

	public void digitaTelefone(String tel) {
		wait.until(ExpectedConditions.elementToBeClickable(txt_Telefone)).click();
		txt_Telefone.sendKeys(tel);

	}

	public void escolhePais(AndroidDriver<WebElement> driver) {
		cmbx_pais.click();
		AcoesDeTouch.scrollAndClick(driver, "BRAZIL");
	}

	public void digitaEndereco(String endereco) {
		txt_Endereco.click();
		txt_Endereco.sendKeys(endereco);

	}

	public void digitarCidade(String cidade) {
		txt_Cidade.click();
		txt_Cidade.sendKeys(cidade);
	}

	public void digitarEstado(String estado) {
		txt_Estado.click();
		txt_Estado.sendKeys(estado);
	}

	public void digitarCEP(String cep) throws MalformedURLException {
		txt_CEP.click();
		txt_CEP.sendKeys(cep);
	}

	public void clicaConfirmaCadastro(AndroidDriver<WebElement> driver) throws MalformedURLException {
		touch.scrollAndClick(driver, "REGISTER");
	}

	public void menuFinal() {
		wait.until(ExpectedConditions.elementToBeClickable(btn_menu)).click();
	}
}
