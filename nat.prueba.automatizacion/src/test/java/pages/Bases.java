package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bases {
	
	static WebDriver driver;
	
	public static void abrir_pagina(String url) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Nats\\git\\pruebaAutomatizacion\\nat.prueba.automatizacion\\driver\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://advantageonlineshopping.com/#/");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	public static void encontrar_login(String botonSignIn) {
		driver.findElement(By.xpath(botonSignIn));
	}
	
	public static void enviar_valores(String val, String locator) {
		WebElement eleLogin = driver.findElement(By.xpath(locator));
		eleLogin.clear();
		eleLogin.sendKeys(val);
		
	}
	
	public static void metodoClick(String clickLocator) throws InterruptedException {
		System.out.println("Clickea");
		driver.findElement(By.xpath(clickLocator)).click();
		
		Thread.sleep(5000);
		
	}


}
