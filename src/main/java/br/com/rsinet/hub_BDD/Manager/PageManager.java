package br.com.rsinet.hub_BDD.Manager;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_BDD.PageFactory.BuscaHome_Page;
import br.com.rsinet.hub_BDD.PageFactory.BuscaLupa_Page;
import br.com.rsinet.hub_BDD.PageFactory.Cadastro_Page;
import br.com.rsinet.hub_BDD.Utility.AcoesDeTouch;
import io.appium.java_client.android.AndroidDriver;

public class PageManager {

	private AndroidDriver<WebElement> driver;
	private Cadastro_Page cadas;
	private AcoesDeTouch touch;
	private BuscaLupa_Page busca;
	private BuscaHome_Page home;

	public PageManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public Cadastro_Page getCadastro() {

		return (cadas == null) ? cadas = new Cadastro_Page(driver) : cadas;

	}

	public AcoesDeTouch getTouch() {

		return (touch == null) ? touch = new AcoesDeTouch(driver) : touch;
	}

	public BuscaLupa_Page getBusca() {

		return (busca == null) ? busca = new BuscaLupa_Page(driver) : busca;
	}

	public BuscaHome_Page getHome() {

		return (home == null) ? home = new BuscaHome_Page(driver) : home;
	}
}
