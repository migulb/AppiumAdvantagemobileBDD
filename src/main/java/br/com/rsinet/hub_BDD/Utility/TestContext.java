package br.com.rsinet.hub_BDD.Utility;

import java.net.MalformedURLException;

import br.com.rsinet.hub_BDD.Manager.PageManager;

public class TestContext {

	private DriverFactory driverManager;
	private PageManager pageManager;

	public TestContext() throws MalformedURLException {

		driverManager = new DriverFactory();
		pageManager = new PageManager(driverManager.getDriver());

	}

	public DriverFactory getDriverFactory() {

		return driverManager;

	}

	public PageManager getPageFactory() {

		return pageManager;
	}
}
