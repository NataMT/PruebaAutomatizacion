
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.RegistroLocators;
import pages.Bases;

public class StepsNuevaCuenta {
	
	// LLamamos cada método para dar el paso a paso

	@Given("Me encuentro en la pagina principal")
	public void abrirBrowser() {
		Bases.abrir_pagina("https://advantageonlineshopping.com/#/");
	}

	@And("busco el icono de login")
	public void pagina_principal() throws InterruptedException {
		
		Bases.encontrar_login(RegistroLocators.signIn);
		

	}

	@When("presiono create new account")
	public void create_new_account() throws InterruptedException {
		Bases.metodoClick(RegistroLocators.nuevaCuenta);

	}

	@And("se despliega la pagina de creacion de cuenta")
	public void despliegue_nueva_cuenta() {
	}

	
	@When("Lleno los campos requeridos")
	public void llenar_campos() {
		Bases.enviar_valores("Tester33", RegistroLocators.usuario);
		Bases.enviar_valores("test55@test.com", RegistroLocators.email);
		Bases.enviar_valores("Test1234", RegistroLocators.contrasena);
		Bases.enviar_valores("Test1234", RegistroLocators.confirmarContrasena);
		

	}

	@And("marco el checkbox para aceptar los terminos")
	public void presionar_checkbox() throws InterruptedException {
		Bases.scrollPagina();
		
		
		Bases.metodoClick(RegistroLocators.aceptarTerminos);

	}

	@And("presiono el boton de registro")
	public void click_registro() throws Throwable {
		Bases.metodoClick(RegistroLocators.botonRegistro);

	}

	@Then("se inicia sesion")
	public void inicio_sesion() throws Throwable {
		Bases.metodoClick(RegistroLocators.inicioSesion);

	}

	@And("se cierra la pagina")
	public void cierre_browser() {
		
		Bases.cierrePagina();

	}

}
