package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import junit.framework.Assert;

public class InserirContasSteps {
	
	private WebDriver driver;

@Dado("^que estou acessando a aplicacao$")
public void que_estou_acessando_a_aplicacao() throws Throwable {
	driver = new ChromeDriver();
	driver.get("https://srbarriga.herokuapp.com");
	driver.manage().window().maximize();
    
}

@Quando("^inserir o usuario \"([^\"]*)\">$")
public void inserir_o_usuario(String usuario) throws Throwable {
   driver.findElement(By.id("email")).sendKeys(usuario);
}

@Quando("^a senha \"([^\"]*)\"$")
public void a_senha(String senha) throws Throwable {
	  driver.findElement(By.id("senha")).sendKeys(senha);
	  
}

@Quando("^seleciono entrar$")
public void seleciono_entrar() throws Throwable {
driver.findElement(By.tagName("Button")).click();
}

@Entao("^visualizo a pagina inicial$")
public void visualizo_a_pagina_inicial() throws Throwable {
	String texto = driver.findElement(By.xpath("//div[@class='alert alert-success'")).getText();
	Assert.assertEquals("Bem vindo, teste!", texto);
}

@Quando("^seleciono contas$")
public void seleciono_contas() throws Throwable {
  driver.findElement(By.linkText("Contas")).click();
}

@Quando("^seleciono adicionar$")
public void seleciono_adicionar() throws Throwable {
	  driver.findElement(By.linkText("Adicionar")).click();
}

@Quando("^informo a conta \"([^\"]*)\"$")
public void informo_a_conta(String conta) throws Throwable {
	  driver.findElement(By.id("nome")).sendKeys(conta);
}

@Quando("^seleciono Salvar$")
public void seleciono_Salvar() throws Throwable {
	driver.findElement(By.tagName("Button")).click();
}

@Entao("^a conta e inserida com sucesso\\.$")
public void a_conta_e_inserida_com_sucesso() throws Throwable {
	String texto = driver.findElement(By.xpath("//div[@class='alert alert-success'")).getText();
	Assert.assertEquals("Bem vindo, teste!", texto);
}


}
