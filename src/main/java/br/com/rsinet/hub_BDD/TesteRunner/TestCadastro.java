package br.com.rsinet.hub_BDD.TesteRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_BDD.Manager.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/CadastroDeUsuario.feature", glue = { "br.com.rsinet.hub_BDD.StepDefinition",
		"br.com.rsinet.hub_BDD.Utility" }, plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/CadastroUsuario.html" })
public class TestCadastro {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("Miguel", System.getProperty("user.name"));
		Reporter.setSystemInfo("SO", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}
