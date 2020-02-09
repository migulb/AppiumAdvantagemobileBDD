package br.com.rsinet.hub_BDD.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Screenshot {

	TestContext testContext;

	public Screenshot(TestContext context) {
		testContext = context;
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		try {

			File sourcePath = ((TakesScreenshot) testContext.getDriverFactory().getDriver())
					.getScreenshotAs(OutputType.FILE);

			File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
					+ screenshotName + Generator.dataHoraParaArquivo() + ".png");

			Files.copy(sourcePath, destinationPath);

			Reporter.addScreenCaptureFromPath(destinationPath.toString());

		} catch (IOException e) {
			System.out.println("falha no Teste");
		}

	}
}
