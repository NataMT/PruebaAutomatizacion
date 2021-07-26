
@tagCrear
Feature: Creacion de cuenta
  Quiero crear una nueva cuenta en la pagina de compras

  @tagCrear1
  Scenario: Creacion de cuenta
    Given Me encuentro en la pagina principal
    And busco el icono para el login
    When presiono create new account
    And se despliega la pagina de creacion de cuenta
    When Lleno los campos requeridos
    And marco el checkbox para aceptar los terminos
    And presiono el icono de registro
    Then se inicia sesion
    And se cierra la pagina
    
