package br.com.rsinet.hub_BDD.StepDefinition;

import java.net.MalformedURLException;

import br.com.rsinet.hub_BDD.Utility.TestContext;
import cucumber.api.java.After;

public class Hooks {

	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@After(order = 0)
	public void FinalizaTest() throws MalformedURLException {
		testContext.getDriverFactory().fecharDriver();

	}
}
