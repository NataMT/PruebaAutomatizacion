
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Bases;

public class StepsNuevaCuenta {
	
	

	@Given("Me encuentro en la pagina principal")
	public void abrirBrowser() {
		Bases.abrir_pagina("https://advantageonlineshopping.com/#/");
	}

	@And("busco el icono de login")
	public void pagina_principal() {

	}

	@When("presiono create new account")
	public void create_new_account() {

	}

	@And("se despliega la pagina de creacion de cuenta")
	public void despliegue_nueva_cuenta() {
	}

	@When("Lleno los campos requeridos")
	public void llenar_campos() {
		Bases.enviar_valores(null, null);

	}

	@And("marco el checkbox para aceptar los terminos")
	public void presionar_checkbox() {

	}

	@And("presiono el boton de registro")
	public void click_registro() {

	}

	@Then("se inicia sesion")
	public void inicio_sesion() {

	}

	@And("se cierra la pagina")
	public void cierre_browser() {

	}

}
