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

public class StepsBusqueda{
	
	WebDriver driver = null;
		
	@Given("entre a la pagina")
	public void entrar_al_sitio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nats\\git\\pruebaAutomatizacion\\nat.prueba.automatizacion\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://advantageonlineshopping.com/#/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}


	
	@And("encuentro el buscador")
	public void encuentro_el_buscador() {
		
		//Click en el icono search
		driver.findElement(By.id("menuSearch")).click();
		
	 
	}

	@When("escribo mouse y comienzo la busqueda")
	public void comienzo_la_busqueda() throws InterruptedException {
		
		//Se ingresa la busqueda
		driver.findElement(By.id("autoComplete")).sendKeys("mouse");
		
		Thread.sleep(2000);
	  
	}

	
	@And("veo todos los resultados")
	public void ver_todos() {
		
		//Ver todo
		driver.getPageSource().contains("View All");
		driver.findElement(By.xpath("//a[contains(text(),'View All')]")).click();
	    
		//cerrar buscador
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[1]/div/div/div/img"));
	}
	

	@Then("navego por la pagina")
	public void navego_por_la_pagina() {
		
		//Navegar resultados
		
		driver.getPageSource().contains("Search result: ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("");
		
		
	    
	}


	@And("cierro el navegador")
	public void cerrar_navegador() {
		
		//Cerrar el navegador 
		driver.close();
	}
	
	
}
	