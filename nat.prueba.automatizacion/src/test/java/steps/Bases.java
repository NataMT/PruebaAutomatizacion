package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.messages.Messages.Hook;
import pages.PagesBusqueda;
import pages.PagesRegistro;

//M�todos

public class Bases {

	protected WebDriver driver = Hooks.getDriver();
	
	protected PagesBusqueda buscar = new PagesBusqueda();
	protected PagesRegistro registro = new PagesRegistro();




	
}
