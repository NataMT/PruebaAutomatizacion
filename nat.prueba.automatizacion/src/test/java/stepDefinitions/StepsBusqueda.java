package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//Ejecución del paso a paso

public class StepsBusqueda {

	WebDriver driver = null;

	@Given("entre a la pagina")
	public void entrar_al_sitio() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nats\\git\\pruebaAutomatizacion\\nat.prueba.automatizacion\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://advantageonlineshopping.com/#/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("encuentro el buscador")
	public void encuentro_el_buscador() {

		// Click en el icono search
		driver.findElement(By.id("menuSearch")).click();

	}

	@When("escribo mouse y comienzo la busqueda")
	public void comienzo_la_busqueda() {

		// Se ingresa la busqueda
		driver.findElement(By.id("autoComplete")).sendKeys("mouse");

	}

	@And("se despliegan los resultados")
	public void ver_todos() throws InterruptedException {

		// Click en "View All"
		// class searchPopUp
		driver.getPageSource().contains("searchPopUp");
		driver.findElement(By.linkText("View All")).click();

		// cerrar buscador

		driver.findElement(By.xpath("//img[contains(@src,'/css/images/closeDark.png')]")).click();
		
		Thread.sleep(2000);
	}

	@Then("navego por los resultados")
	public void navego_por_la_pagina() throws InterruptedException {

		// Navegar resultados

		driver.getPageSource().contains("Search result: ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1204)");
		
		Thread.sleep(5000);


	}

	@And("cierro el navegador")
	public void cerrar_navegador() {

		// Cerrar el navegador
		driver.close();
	}

}
