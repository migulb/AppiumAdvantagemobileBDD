package br.com.rsinet.hub_BDD.ScreenFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BuscaHome_Screen {

	public BuscaHome_Screen(AndroidDriver<WebElement> driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='HEADPHONES']")
	private WebElement produto;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")
	private WebElement fones;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_Menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement btn_login;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private WebElement txt_usuario;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private WebElement txt_Senha;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private WebElement btn_logar;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductQuantity")
	private WebElement quantidadeProd;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
	private WebElement txt_quantidade;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement btn_Apply;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement btn_cart;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewCart")
	private WebElement btn_carrinho;

	public void clicarProduto() {
		produto.click();
	}

	public void escolherFone() {
		fones.click();
	}

	public void clicoMenu() {
		btn_Menu.click();
	}

	public void clicoLogin() {
		btn_login.click();
	}

	public void digitaUsuario(String usuario) {
		txt_usuario.sendKeys(usuario);
	}

	public void digitaSenha(String senha) {
		txt_Senha.sendKeys(senha);
	}

	public void clicoEmLogar() {
		btn_logar.click();
	}

	public void clicoEmQuantidade() {
		quantidadeProd.click();
	}

	public void adicionaQuantidade(String quantidade) {
		txt_quantidade.sendKeys(quantidade);
	}

	public void clicoEmApply() {
		btn_Apply.click();
	}

	public void adicionoCarrinho() {
		btn_cart.click();
	}

	public void entroNoCarrrinho() {
		btn_carrinho.click();
	}

}
