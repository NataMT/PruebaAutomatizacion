package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import steps.Bases;

// Localizadores de la pagina de busqueda
public class PagesBusqueda extends Bases {

	String tituloPagina = " Advantage Shopping";

	public static WebDriver driver;

	By localizadorBusqueda = By.xpath("//div[@id='mobileSearch']//*[@id='menuSearch']");
	By localizadorBarraBusqueda = By.xpath("//*[@id=\"autoComplete\"]");
	By localizadorResultados = By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[2]/div/div[2]/a[1]");
	By localizadorPaginaResultados = By.xpath("/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul");
	By localizadorCerrarBusqueda = By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[1]/div/div/div/img");

	public PagesBusqueda() {
	}

	public void conexionWebDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nats\\Desktop\\WorkSpaces\\EclipseWorkspace\\nat.prueba.automatizacion\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

	}

	public String getTituloPagina() {
		return tituloPagina;
	}

	public By getLocalizadorBusqueda() {
		return localizadorBusqueda;

	}

	public By getBarraBusqueda() {
		return localizadorBarraBusqueda;

	}

	public By getVerResultados() {
		return localizadorResultados;

	}

	public By getlocalizadorPaginaResultados() {
		return localizadorPaginaResultados;

	}

	public By getCerrarBusqueda() {
		return localizadorCerrarBusqueda;
	}

}
