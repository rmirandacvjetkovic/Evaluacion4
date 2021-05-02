package com.petsmile.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIncorrectoTest {
private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/ReservaHora/");
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("rene");
		driver.findElement(By.id("password")).sendKeys("1111");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertEquals("PetSmile - Error", driver.getTitle());
	}
	
	@After
	public void afterTest() {
		driver.quit();
	}
}
