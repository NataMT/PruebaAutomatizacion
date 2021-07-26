@tag
Feature: Busqueda de productos
  Como usuario necesito entrar al sitio web y buscar un mouse

  @tag1
  Scenario: Busqueda de producto
    Given Me encuentro en la pagina principal
    And navego por la pagina
    When encuentro el icono de busqueda
    And presiono el icono
    And escribo mouse
    Then presiono enter
    And se recibe el resultado de la busqueda
    And se cierra la pagina