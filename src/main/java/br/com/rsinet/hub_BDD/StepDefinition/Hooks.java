package br.com.rsinet.hub_BDD.StepDefinition;

import java.net.MalformedURLException;

import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;

	}

	@Before
	public void aberturaDeDriver() throws MalformedURLException {
		testContext.getDriverFactory().getDriver();
	}

	@After(order = 0)
	public void FinalizaTest() throws MalformedURLException {
		testContext.getDriverFactory().fecharDriver();

	}
}
