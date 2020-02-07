package br.com.rsinet.hub_BDD.TesteRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/CadastroDeUsuario.feature", glue = {
		"br.com.rsinet.hub_BDD.StepDefinition" }, tags = "@CadastroNegativo")
public class TestCadastro {

}
