package steps;


import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.PagesBusqueda;

public class StepsBusqueda extends Bases{
	
	PagesBusqueda buscarMouse = new PagesBusqueda();
	

	@Given("^Me encuentro en la pagina principal$")
	public void me_encuentro_en_la_pagina_principal(){
		buscarMouse.conexionWebDriver();
		

	}
	
	@SuppressWarnings("deprecation")
	@And("^navego por la pagina$")
	public void navego_por_la_pagina() {
		Assert.assertEquals(buscar.getTituloPagina(), driver.getTitle());

	}

	@When("^encuentro el icono de busqueda$")
	public void encuentro_el_icono_de_busqueda(){
		WebElement localizadorBusqueda = driver.findElement(buscar.getBarraBusqueda());
		localizadorBusqueda.click();
			
		
	}
	@SuppressWarnings("deprecation")
	@And("^se recibe el resultado de la busqueda$")
	public void se_recibe_el_resultado() {
		Assert.assertEquals(buscar.getVerResultados(), driver.getPageSource());
	
	}
		
	@Then("^presiono enter\\\"([^\\\"]*)\\\"$")
	public void cerrarBusqueda() {
		

	}

	
	/*
	 * @And("se cierra la pagina") public void cierrePagina() {
	 * buscarMouse.closeBrowser();
	 * 
	 * }
	 */
}
