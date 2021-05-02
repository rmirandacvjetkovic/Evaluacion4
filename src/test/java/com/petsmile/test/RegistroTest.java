package com.petsmile.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistroTest {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/ReservaHora/");
	}
	
	@Test
	public void testRegistro() throws InterruptedException {
		
		/*
		 * Prueba Login correcto, posteriormente se contea largo actual de agendas en tabla
		 * para probar éxito, el largo actual de tablas de debe incrementar en 1
		 */
		
		Integer largoActual = 0;
		
		driver.findElement(By.id("username")).sendKeys("rene");
		driver.findElement(By.id("password")).sendKeys("4321");
		driver.findElement(By.id("btnLogin")).click();	
		Thread.sleep(1000);
		// Obtener largo Actual tabla
		WebElement tabla = driver.findElement(By.tagName("tbody"));
		List<WebElement> filas = tabla.findElements(By.tagName("tr"));
		largoActual = filas.size();
		driver.findElement(By.id("btnModal")).click();
		Thread.sleep(1000);
		Select duenos = new Select(driver.findElement(By.id("selectDueno")));
		duenos.selectByIndex(1);
		Thread.sleep(1000);
		Select mascotas = new Select(driver.findElement(By.id("selectMascota")));
		mascotas.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.id("selectMascota")).sendKeys("2");
		driver.findElement(By.id("inputHora")).sendKeys("10:30");
		driver.findElement(By.id("inputFecha")).sendKeys("05-05-2021");
		driver.findElement(By.id("btnRegistrarAgenda")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertEquals(largoActual + 1, tabla.findElements(By.tagName("tr")).size());
	}
	
	@After
	public void afterTest() {
		driver.quit();
	}
}
