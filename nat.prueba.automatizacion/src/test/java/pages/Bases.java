package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Métodos a utilizar dentro del proceso de creación de cuenta

public class Bases {
	
	static WebDriver driver;
	
	//Abrir el browser
	public static void abrir_pagina(String url) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Nats\\git\\pruebaAutomatizacion\\nat.prueba.automatizacion\\driver\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://advantageonlineshopping.com/#/");

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	// Hace scroll en la página
	public static void scrollPagina() throws InterruptedException {
		
		//driver.getPageSource().contains("welcome");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 650)");
		
		Thread.sleep(2000);

	}
	
	// Clickea el boton de inicio de sesión
	public static void encontrar_login(By botonSignIn) throws InterruptedException {
		driver.findElement(botonSignIn).click();
		
		Thread.sleep(5000);
	}
	
	//Rellena los datos requeridos
	public static void enviar_valores(String val, By locator) {
		WebElement eleLogin = driver.findElement(locator);
		eleLogin.clear();
		eleLogin.sendKeys(val);
		
	}
	
	// Hace click
	public static void metodoClick(By clickLocator) throws InterruptedException {
		System.out.println("Clickea");
		driver.findElement(clickLocator).click();
		
		Thread.sleep(5000);
		
	}
	
	//Cierra el browser
	public static void cierrePagina() {
		driver.close();
	}


}
