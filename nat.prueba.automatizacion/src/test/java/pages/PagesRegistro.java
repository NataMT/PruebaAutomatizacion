/*
 * package pages;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver;
 * 
 * import stepDefinitions.Bases;
 * 
 * //Localizadores de la pagina de registro public class PagesRegistro extends
 * Bases {
 * 
 * public static WebDriver driver;
 * 
 * 
 * // Se definen los localizadores a utolizar By localizadorLogin =
 * By.id("menuUser"); By localizadorCrearCuenta =
 * By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"); By
 * localizadorPaginaRegistro = By.xpath("//*[@id=\"registerCover\"]"); By
 * localizadorUsuario = By.name("usernameRegisterPage"); By localizadorMail =
 * By.name("emailRegisterPage"); By localizadorPass =
 * By.name("passwordRegisterPage"); By localizadorConfirmarPass =
 * By.name("confirm_passwordRegisterPage"); By localizadorNombre =
 * By.name("first_nameRegisterPage"); By localizadorApellido =
 * By.name("last_nameRegisterPage"); By localAcepto = By.xpath(
 * "/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/sec-view/div/input"
 * ); By localRegistro = By.id("register_btnundefined"); By
 * localizadorMenuUsuario = By.id("loginMiniTitle");
 * 
 * public PagesRegistro() {
 * 
 * }
 * 
 * public void Login() throws InterruptedException { By click(localizadorLogin);
 * Thread.sleep(2000); if (isDisplayed(localizadorCrearCuenta)) {
 * click(localizadorCrearCuenta); } else {
 * System.out.println("No se encontraron resultados");
 * 
 * }
 * 
 * }
 * 
 * public void paginaRegistro() { if (isDisplayed(localizadorPaginaRegistro)) {
 * type("Natalia", localizadorUsuario); type("nat.morat@outlook.com",
 * localizadorMail); type("Test1234", localizadorPass); type("Test1234",
 * localizadorConfirmarPass); type("Natalia", localizadorNombre); type("Mora",
 * localizadorApellido); }else {
 * System.out.println("No se llenaron los campos"); } }
 * 
 * public void botonesRegistro() {
 * 
 * click(localAcepto); click(localRegistro); }
 * 
 * public void finRegistro() { isDisplayed(localizadorMenuUsuario); }
 * 
 * 
 * 
 * }
 */