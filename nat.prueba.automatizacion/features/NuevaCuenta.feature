#Author : Natalia Mora
@tagCrear
Feature: Creacion de cuenta
  Quiero crear una nueva cuenta en la pagina de compras

  @tagCrear1
  Scenario: Creacion de cuenta
    Given Me encuentro en la pagina principal
    And busco el icono de login
    When presiono create new account
    And se despliega la pagina de creacion de cuenta
    When Lleno los campos requeridos
    And marco el checkbox para aceptar los terminos
    And presiono el boton de registro
    Then se inicia sesion
    And se cierra la pagina

  Scenario Outline: Creacion otros usuarios
    Given Me encuentro en la pagina principal
    And busco el icono de login
    When presiono create new account
    And se despliega la pagina de creacion de cuenta
    When Lleno los campos requeridos <usuario> <email> <contraseña> <confirmarContraseña>
    And marco el checkbox para aceptar los terminos
    And presiono el boton de registro
    Then se inicia sesion
    And se cierra la pagina
    
    Examples:
      | usuario  | email           | contrasena | confirmarContrasena |
      | Tester35 | test57@test.com | 1234Test   | 1234Test            |
      | Tester39 | test39@test.com | 1234Test   | 1234Test            |
      | Tester40 | test40@test.com | 1234Test   | 1234Test            |
      | Tester42 | test42@test.com | 1234Test   | 1234Test            |
