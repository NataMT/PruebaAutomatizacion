/*
 * package stepDefinitions;
 * 
 * import io.cucumber.java.*; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; import pages.PagesRegistro;
 * 
 * public class StepsNuevaCuenta {
 * 
 * PagesRegistro creacionCuenta = new PagesRegistro(); Bases abrirBrowser = new
 * Bases();
 * 
 * @Given("^me encuentro en la pagina principal$") public void abrirBrowser() {
 * 
 * }
 * 
 * @And("^busco el icono de login$") public void pagina_principal() throws
 * InterruptedException { creacionCuenta.Login();
 * 
 * }
 * 
 * 
 * @When("^presiono create new account$") public void
 * presiono_create_new_account() { creacionCuenta.paginaRegistro();
 * 
 * }
 * 
 * @Then("^presiono el icono de registro$") public void
 * presiono_el_icono_de_registro() { creacionCuenta.botonesRegistro();
 * creacionCuenta.finRegistro();
 * 
 * }
 * 
 * 
 * @And("se cierra la pagina") public void closePage() {
 * creacionCuenta.cerrarBrowser();
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */