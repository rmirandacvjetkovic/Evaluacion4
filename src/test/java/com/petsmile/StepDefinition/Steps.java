package com.petsmile.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrirChrome() {
		System.out.println("Paso - abrir navegador Chrome");
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/ReservaHora/");
	}
	  
	@When("Ingresar Username {string} y Password {string}")
	public void IngresaUsernameAndPassword(String user, String pass) {
		System.out.println("Paso - Ingreso credenciales usuario" + user + " / " + pass);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@Then("inicia sesion")
	public void iniciaSesion() {
		System.out.println("Paso - Inicia sesión");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
}
