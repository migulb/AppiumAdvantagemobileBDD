package br.com.rsinet.hub_BDD.Manager;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_BDD.ScreenFactory.BuscaHome_Screen;
import br.com.rsinet.hub_BDD.ScreenFactory.BuscaLupa_Screen;
import br.com.rsinet.hub_BDD.ScreenFactory.Cadastro_Screen;
import br.com.rsinet.hub_BDD.Utility.AcoesDeTouch;
import io.appium.java_client.android.AndroidDriver;

public class PageManager {

	private AndroidDriver<WebElement> driver;
	private Cadastro_Screen cadas;
	private AcoesDeTouch touch;
	private BuscaLupa_Screen busca;
	private BuscaHome_Screen home;

	public PageManager(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public Cadastro_Screen getCadastro() throws MalformedURLException {

		return (cadas == null) ? cadas = new Cadastro_Screen(driver) : cadas;

	}

	public AcoesDeTouch getTouch() throws MalformedURLException {

		return (touch == null) ? touch = new AcoesDeTouch(driver) : touch;
	}

	public BuscaLupa_Screen getBusca() {

		return (busca == null) ? busca = new BuscaLupa_Screen(driver) : busca;
	}

	public BuscaHome_Screen getHome() {

		return (home == null) ? home = new BuscaHome_Screen(driver) : home;
	}
}
