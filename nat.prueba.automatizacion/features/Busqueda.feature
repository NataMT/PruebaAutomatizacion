#Author: Natalia Mora
Feature: Busqueda de productos
  Necesito buscar un mouse

  @tag1
  Scenario: Busqueda de producto
    Given entre a la pagina
    And encuentro el buscador
    When escribo mouse y comienzo la busqueda
    And se despliegan los resultados
    Then navego por los resultados
    And cierro el navegador

  Scenario Outline: Buscar otros productos
    Given entre a la pagina
    And navego por la pagina
    When encuentro el buscador
    And escribo <item> y comienzo la busqueda
    Then veo todos los resultados
    And cierro el navegador

    Examples: 
      | item       |
      | tablets    |
      | headphones |
      | speakers   |
