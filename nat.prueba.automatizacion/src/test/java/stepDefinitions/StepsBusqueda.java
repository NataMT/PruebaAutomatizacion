package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}


	@And("navego por la pagina")
	public void navego_por_la_pagina() {
		
		
		
	    
	}

	
	@When("encuentro el buscador")
	public void encuentro_el_buscador() {


		driver.findElement(By.name("mobile_search"));
	 
	}

	@And("escribo mouse y comienzo la busqueda")
	public void comienzo_la_busqueda() {
	  
	}

	
	@Then("veo todos los resultados")
	public void ver_todos() {
	    
	}

	@And("cierro el navegador")
	public void cerrar_navegador() {
		
	}
	
	
}
	