
package locators;

import org.openqa.selenium.By;


//Localizadores de la pagina de registro 

public class RegistroLocators {
	
	
	public static By signIn = By.id("menuUser");
	public static By nuevaCuenta = By.linkText("CREATE NEW ACCOUNT");
	public static By usuario = By.name("usernameRegisterPage");
	public static By email = By.name("emailRegisterPage");
	public static By contrasena = By.name("passwordRegisterPage");
	public static By confirmarContrasena = By.name("confirm_passwordRegisterPage");
	public static By aceptarTerminos = By.name("i_agree");
	public static By botonRegistro = By.id("register_btnundefined");
	public static By inicioSesion = By.xpath("//a[@id='hrefUserIcon']");

}
