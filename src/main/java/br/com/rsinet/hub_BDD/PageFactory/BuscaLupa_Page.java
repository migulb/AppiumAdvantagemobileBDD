package br.com.rsinet.hub_BDD.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BuscaLupa_Page {

	public BuscaLupa_Page(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement txt_busca;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement btn_lupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewProduct")
	private WebElement tablet;

	public void digitaBusca(String busca) {
		txt_busca.sendKeys(busca);
	}

	public void lupa() {
		btn_lupa.click();
	}

	public void tablet() {
		tablet.click();
	}
}
